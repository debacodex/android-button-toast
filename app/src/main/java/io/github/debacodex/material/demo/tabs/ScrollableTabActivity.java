package io.github.debacodex.material.demo.tabs;
 
import android.os.Bundle;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import io.github.debacodex.material.demo.R;
import io.github.debacodex.material.tablayout.MagicIndicator;
import io.github.debacodex.material.tablayout.ViewPagerHelper;
import io.github.debacodex.material.tablayout.buildins.UIUtil;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.CommonNavigator;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.abs.IPagerIndicator;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.abs.IPagerTitleView;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.indicators.BezierPagerIndicator;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.indicators.LinePagerIndicator;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.indicators.TriangularPagerIndicator;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.indicators.WrapPagerIndicator;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.titles.ClipPagerTitleView;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.titles.ColorTransitionPagerTitleView;
import io.github.debacodex.material.tablayout.buildins.commonnavigator.titles.SimplePagerTitleView;

import java.util.List;
import java.util.Arrays;

import io.github.debacodex.material.demo.ext.titles.ScaleTransitionPagerTitleView;
import io.github.debacodex.material.demo.ext.titles.ColorFlipPagerTitleView;

import io.github.debacodex.material.demo.ViewPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;

public class ScrollableTabActivity extends AppCompatActivity { 
	
		private static final String[] CHANNELS = new String[]{"Com","Github","Debacodex"};
		private List<String> mDataList = Arrays.asList(CHANNELS);
		private ViewPager mViewPager;
		private ViewPagerAdapter mViewPagerAdapter;
		@Override 
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_scrollabletab);

			mViewPager = (ViewPager) findViewById(R.id.ViewPager1);
			mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
			mViewPager.setAdapter(mViewPagerAdapter);
			


			initMagicIndicator1();
			initMagicIndicator2();
			initMagicIndicator3();
			initMagicIndicator4();
			initMagicIndicator5();
			initMagicIndicator6();
			initMagicIndicator7();
			initMagicIndicator8();
			initMagicIndicator9();
		}

		private void initMagicIndicator1() {
			MagicIndicator magicIndicator = (MagicIndicator) findViewById(R.id.magic_indicator1);
			magicIndicator.setBackgroundColor(Color.parseColor("#d43d3d"));
			CommonNavigator commonNavigator = new CommonNavigator(this);
			commonNavigator.setSkimOver(true);
			commonNavigator.setAdjustMode(true);
			
			/*int padding = UIUtil.getScreenWidth(this) / 100;
			commonNavigator.setRightPadding(padding);
			commonNavigator.setLeftPadding(padding);  */
			commonNavigator.setAdapter(new CommonNavigatorAdapter() {

					@Override
					public int getCount() {
						return mDataList == null ? 0 : mDataList.size();
					}

					@Override
					public IPagerTitleView getTitleView(Context context, final int index) {
						ClipPagerTitleView clipPagerTitleView = new ClipPagerTitleView(context);
						clipPagerTitleView.setText(mDataList.get(index));
						
						clipPagerTitleView.setTextColor(Color.parseColor("#f2c4c4"));
						clipPagerTitleView.setClipColor(Color.WHITE);
						clipPagerTitleView.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									mViewPager.setCurrentItem(index);
								}
							});
						return clipPagerTitleView;
					}

					@Override
					public IPagerIndicator getIndicator(Context context) {
						return null;
					}
				});
			magicIndicator.setNavigator(commonNavigator);
			ViewPagerHelper.bind(magicIndicator, mViewPager);
		}

		private void initMagicIndicator2() {
			MagicIndicator magicIndicator = (MagicIndicator) findViewById(R.id.magic_indicator2);
			magicIndicator.setBackgroundColor(Color.parseColor("#00c853"));
			CommonNavigator commonNavigator = new CommonNavigator(this);
			commonNavigator.setScrollPivotX(0.25f);
			
			commonNavigator.setAdjustMode(true);
			commonNavigator.setAdapter(new CommonNavigatorAdapter() {
					@Override
					public int getCount() {
						return mDataList == null ? 0 : mDataList.size();
					}

					@Override
					public IPagerTitleView getTitleView(Context context, final int index) {
						SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(context);
						simplePagerTitleView.setText(mDataList.get(index));
						simplePagerTitleView.setNormalColor(Color.parseColor("#c8e6c9"));
						simplePagerTitleView.setSelectedColor(Color.WHITE);
						simplePagerTitleView.setTextSize(12);
						simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									mViewPager.setCurrentItem(index);
								}
							});
						return simplePagerTitleView;
					}

					@Override
					public IPagerIndicator getIndicator(Context context) {
						LinePagerIndicator indicator = new LinePagerIndicator(context);
						indicator.setMode(LinePagerIndicator.MODE_EXACTLY);
						indicator.setLineHeight(UIUtil.dip2px(context, 4));
						indicator.setColors(Color.parseColor("#ffffff"));
						return indicator;
					}
				});
			magicIndicator.setNavigator(commonNavigator);
			ViewPagerHelper.bind(magicIndicator, mViewPager);
		}

		private void initMagicIndicator3() {
			MagicIndicator dnTabLayout = (MagicIndicator) findViewById(R.id.magic_indicator3);
			dnTabLayout.setBackgroundColor(Color.BLACK);
			CommonNavigator commonNavigator = new CommonNavigator(this);
			
			commonNavigator.setAdjustMode(true);
			commonNavigator.setAdapter(new CommonNavigatorAdapter() {

					@Override
					public int getCount() {
						return mDataList.size();
					}

					@Override
					public IPagerTitleView getTitleView(Context context, final int index) {
						SimplePagerTitleView simplePagerTitleView = new ColorTransitionPagerTitleView(context);
						simplePagerTitleView.setNormalColor(Color.GRAY);
						simplePagerTitleView.setSelectedColor(Color.WHITE);
						simplePagerTitleView.setText(mDataList.get(index));
						simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									mViewPager.setCurrentItem(index);
								}
							});
						return simplePagerTitleView;
					}

					@Override
					public IPagerIndicator getIndicator(Context context) {
						LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
						linePagerIndicator.setMode(LinePagerIndicator.MODE_WRAP_CONTENT);
						linePagerIndicator.setColors(Color.WHITE);
						
						linePagerIndicator.setLineHeight(UIUtil.dip2px(context, 4));
						return linePagerIndicator;
					}
				});
			dnTabLayout.setNavigator(commonNavigator);
			ViewPagerHelper.bind(dnTabLayout, mViewPager);
		}

		private void initMagicIndicator4() {
			MagicIndicator magicIndicator = (MagicIndicator) findViewById(R.id.magic_indicator4);
			magicIndicator.setBackgroundColor(Color.parseColor("#455a64"));
			CommonNavigator commonNavigator = new CommonNavigator(this);
			commonNavigator.setAdjustMode(true);
			commonNavigator.setAdapter(new CommonNavigatorAdapter() {
					@Override
					public int getCount() {
						return mDataList == null ? 0 : mDataList.size();
					}

					@Override
					public IPagerTitleView getTitleView(Context context, final int index) {
						SimplePagerTitleView simplePagerTitleView = new ColorTransitionPagerTitleView(context);
						simplePagerTitleView.setText(mDataList.get(index));
						simplePagerTitleView.setNormalColor(Color.parseColor("#88ffffff"));
						simplePagerTitleView.setSelectedColor(Color.WHITE);
						simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									mViewPager.setCurrentItem(index);
								}
							});
						return simplePagerTitleView;
					}

					@Override
					public IPagerIndicator getIndicator(Context context) {
						LinePagerIndicator indicator = new LinePagerIndicator(context);
						indicator.setColors(Color.parseColor("#ffffff"));
						indicator.setLineHeight(UIUtil.dip2px(context, 4));
						indicator.setRoundRadius(UIUtil.dip2px(context, 3));
						return indicator;
					}
				});
			magicIndicator.setNavigator(commonNavigator);
			ViewPagerHelper.bind(magicIndicator, mViewPager);
		}

		private void initMagicIndicator5() {
			MagicIndicator magicIndicator = (MagicIndicator) findViewById(R.id.magic_indicator5);
			magicIndicator.setBackgroundColor(Color.WHITE);
			CommonNavigator commonNavigator = new CommonNavigator(this);
			commonNavigator.setScrollPivotX(0.8f);
			
			commonNavigator.setAdjustMode(true);
			commonNavigator.setAdapter(new CommonNavigatorAdapter() {
					@Override
					public int getCount() {
						return mDataList == null ? 0 : mDataList.size();
					}

					@Override
					public IPagerTitleView getTitleView(Context context, final int index) {
						SimplePagerTitleView simplePagerTitleView = new ScaleTransitionPagerTitleView(context);
						simplePagerTitleView.setText(mDataList.get(index));
						simplePagerTitleView.setTextSize(18);
						simplePagerTitleView.setNormalColor(Color.parseColor("#616161"));
						simplePagerTitleView.setSelectedColor(Color.parseColor("#f57c00"));
						simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									mViewPager.setCurrentItem(index);
								}
							});
						return simplePagerTitleView;
					}

					@Override
					public IPagerIndicator getIndicator(Context context) {
						LinePagerIndicator indicator = new LinePagerIndicator(context);
						indicator.setStartInterpolator(new AccelerateInterpolator());
						indicator.setEndInterpolator(new DecelerateInterpolator(1.6f));
						
						indicator.setLineHeight(UIUtil.dip2px(context, 4));
						
						indicator.setColors(Color.parseColor("#f57c00"));
						return indicator;
					}
				});
			magicIndicator.setNavigator(commonNavigator);
			ViewPagerHelper.bind(magicIndicator, mViewPager);
		}

		private void initMagicIndicator6() {
			MagicIndicator magicIndicator = (MagicIndicator) findViewById(R.id.magic_indicator6);
			magicIndicator.setBackgroundColor(Color.WHITE);
			CommonNavigator commonNavigator = new CommonNavigator(this);
			
			commonNavigator.setAdjustMode(true);
			commonNavigator.setAdapter(new CommonNavigatorAdapter() {
					@Override
					public int getCount() {
						return mDataList == null ? 0 : mDataList.size();
					}

					@Override
					public IPagerTitleView getTitleView(Context context, final int index) {
						SimplePagerTitleView simplePagerTitleView = new ScaleTransitionPagerTitleView(context);
						simplePagerTitleView.setText(mDataList.get(index));
						simplePagerTitleView.setTextSize(18);
						simplePagerTitleView.setNormalColor(Color.GRAY);
						simplePagerTitleView.setSelectedColor(Color.BLACK);
						simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									mViewPager.setCurrentItem(index);
								}
							});
						return simplePagerTitleView;
					}

					@Override
					public IPagerIndicator getIndicator(Context context) {
						BezierPagerIndicator indicator = new BezierPagerIndicator(context);
						indicator.setColors(Color.parseColor("#ff4a42"), Color.parseColor("#fcde64"), Color.parseColor("#73e8f4"), Color.parseColor("#76b0ff"), Color.parseColor("#c683fe"));
						return indicator;
					}
				});
			magicIndicator.setNavigator(commonNavigator);
			ViewPagerHelper.bind(magicIndicator, mViewPager);
		}

		private void initMagicIndicator7() {
			MagicIndicator magicIndicator = (MagicIndicator) findViewById(R.id.magic_indicator7);
			magicIndicator.setBackgroundColor(Color.parseColor("#fafafa"));
			CommonNavigator commonNavigator7 = new CommonNavigator(this);
			commonNavigator7.setScrollPivotX(0.65f);
			
			commonNavigator7.setAdjustMode(true);
			commonNavigator7.setAdapter(new CommonNavigatorAdapter() {
					@Override
					public int getCount() {
						return mDataList == null ? 0 : mDataList.size();
					}

					@Override
					public IPagerTitleView getTitleView(Context context, final int index) {
						SimplePagerTitleView simplePagerTitleView = new ColorFlipPagerTitleView(context);
						simplePagerTitleView.setText(mDataList.get(index));
						simplePagerTitleView.setNormalColor(Color.parseColor("#9e9e9e"));
						simplePagerTitleView.setSelectedColor(Color.parseColor("#00c853"));
						simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									mViewPager.setCurrentItem(index);
								}
							});
						return simplePagerTitleView;
					}

					@Override
					public IPagerIndicator getIndicator(Context context) {
						LinePagerIndicator indicator = new LinePagerIndicator(context);
						indicator.setMode(LinePagerIndicator.MODE_EXACTLY);
						indicator.setLineHeight(UIUtil.dip2px(context, 6));
						indicator.setLineWidth(UIUtil.dip2px(context, 10));
						indicator.setRoundRadius(UIUtil.dip2px(context, 3));
						indicator.setStartInterpolator(new AccelerateInterpolator());
						indicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
						indicator.setColors(Color.parseColor("#00c853"));
						return indicator;
					}
				});
			magicIndicator.setNavigator(commonNavigator7);
			ViewPagerHelper.bind(magicIndicator, mViewPager);
		}

		private void initMagicIndicator8() {
			MagicIndicator magicIndicator = (MagicIndicator) findViewById(R.id.magic_indicator8);
			magicIndicator.setBackgroundColor(Color.WHITE);
			CommonNavigator commonNavigator = new CommonNavigator(this);
			commonNavigator.setScrollPivotX(0.35f);
			
			commonNavigator.setAdjustMode(true);
			/*int padding = UIUtil.getScreenWidth(this) / 30;
			commonNavigator.setRightPadding(padding);
			commonNavigator.setLeftPadding(padding); */
			commonNavigator.setAdapter(new CommonNavigatorAdapter() {
					@Override
					public int getCount() {
						return mDataList == null ? 0 : mDataList.size();
					}

					@Override
					public IPagerTitleView getTitleView(Context context, final int index) {
						SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(context);
						simplePagerTitleView.setText(mDataList.get(index));
						simplePagerTitleView.setNormalColor(Color.parseColor("#333333"));
						simplePagerTitleView.setSelectedColor(Color.parseColor("#e94220"));
						simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									mViewPager.setCurrentItem(index);
								}
							});
						return simplePagerTitleView;
					}

					@Override
					public IPagerIndicator getIndicator(Context context) {
						WrapPagerIndicator indicator = new WrapPagerIndicator(context);
						indicator.setFillColor(Color.parseColor("#ebe4e3"));
						return indicator;
					}
				});
			magicIndicator.setNavigator(commonNavigator);
			ViewPagerHelper.bind(magicIndicator, mViewPager);
		}

		private void initMagicIndicator9() {
			MagicIndicator magicIndicator = (MagicIndicator) findViewById(R.id.magic_indicator9);
			magicIndicator.setBackgroundColor(Color.WHITE);
			CommonNavigator commonNavigator = new CommonNavigator(this);
			commonNavigator.setScrollPivotX(0.15f);
			
			commonNavigator.setAdjustMode(true);
			commonNavigator.setAdapter(new CommonNavigatorAdapter() {
					@Override
					public int getCount() {
						return mDataList == null ? 0 : mDataList.size();
					}

					@Override
					public IPagerTitleView getTitleView(Context context, final int index) {
						SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(context);
						simplePagerTitleView.setText(mDataList.get(index));
						simplePagerTitleView.setNormalColor(Color.parseColor("#333333"));
						simplePagerTitleView.setSelectedColor(Color.parseColor("#e94220"));
						simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									mViewPager.setCurrentItem(index);
								}
							});
						return simplePagerTitleView;
					}

					@Override
					public IPagerIndicator getIndicator(Context context) {
						TriangularPagerIndicator indicator = new TriangularPagerIndicator(context);
						indicator.setLineColor(Color.parseColor("#e94220"));
						return indicator;
					}
				});
			magicIndicator.setNavigator(commonNavigator);
			ViewPagerHelper.bind(magicIndicator, mViewPager);
		}

	
 }
