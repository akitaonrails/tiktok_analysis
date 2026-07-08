package com.gyf.barlibrary;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class BarParams implements Cloneable {
    public float autoNavigationBarDarkModeAlpha;
    public boolean autoNavigationBarDarkModeEnable;
    public float autoStatusBarDarkModeAlpha;
    public boolean autoStatusBarDarkModeEnable;
    public int flymeOSStatusBarFontColor;
    public boolean fullScreen;
    public boolean hideNavigationBar;
    public float navigationBarAlpha;
    public boolean navigationBarDarkIcon;
    public OnKeyboardListener onKeyboardListener;
    public float statusBarAlpha;
    public int statusBarColor;
    public boolean statusBarDarkFont;
    public View statusBarView;
    public View titleBarView;
    public int navigationBarColor = -16777216;
    public boolean useDefaultNavigationBarColor = true;
    public int defaultNavigationBarColor = -16777216;
    public BarHide barHide = BarHide.FLAG_SHOW_BAR;
    public boolean statusBarColorEnabled = true;
    public int statusBarColorTransform = -16777216;
    public int navigationBarColorTransform = -16777216;
    public Map<View, Map<Integer, Integer>> viewMap = new HashMap();
    public float viewAlpha = 0.0f;
    public int contentColor = 0;
    public int contentColorTransform = -16777216;
    public float contentAlpha = 0.0f;
    public boolean fits = false;
    public boolean isSupportActionBar = false;
    public boolean keyboardEnable = false;
    public int keyboardMode = 18;
    public boolean navigationBarEnable = true;
    public boolean navigationBarWithKitkatEnable = true;
    public boolean navigationBarWithEMUI3Enable = true;
    public boolean fixMarginAtBottom = false;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BarParams m146clone() {
        try {
            return (BarParams) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
