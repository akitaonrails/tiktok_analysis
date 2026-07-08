package com.gyf.barlibrary;

import X.C21586319dt;
import X.C786410Ut5;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;

/* JADX INFO: loaded from: classes34.dex */
public class FitsKeyboard implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int mActionBarHeight;
    public Activity mActivity;
    public View mChildView;
    public View mContentView;
    public View mDecorView;
    public ImmersionBar mImmersionBar;
    public boolean mIsAddListener;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public final int mStatusBarHeight;
    public int mTempKeyboardHeight;
    public Window mWindow;

    public void cancel() {
        if (this.mIsAddListener) {
            C786410Ut5.C3(this.mDecorView.getViewTreeObserver(), this);
            this.mIsAddListener = false;
        }
    }

    public void disable() {
        if (this.mIsAddListener) {
            if (this.mChildView != null) {
                this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
            } else {
                this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), this.mImmersionBar.getPaddingBottom());
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i;
        ImmersionBar immersionBar = this.mImmersionBar;
        if (immersionBar == null || immersionBar.getBarParams() == null || !this.mImmersionBar.getBarParams().keyboardEnable) {
            return;
        }
        int navigationBarHeight = ImmersionBar.getNavigationBarHeight(this.mActivity);
        Rect rect = new Rect();
        this.mDecorView.getWindowVisibleDisplayFrame(rect);
        int height = this.mContentView.getHeight() - rect.bottom;
        if (height != this.mTempKeyboardHeight) {
            this.mTempKeyboardHeight = height;
            boolean z = true;
            if (ImmersionBar.checkFitsSystemWindows(this.mWindow.getDecorView().findViewById(R.id.content))) {
                height -= navigationBarHeight;
                if (height <= navigationBarHeight) {
                    z = false;
                }
            } else if (this.mChildView != null) {
                if (this.mImmersionBar.getBarParams().isSupportActionBar) {
                    height += this.mActionBarHeight + this.mStatusBarHeight;
                }
                if (this.mImmersionBar.getBarParams().fits) {
                    height += this.mStatusBarHeight;
                }
                if (height > navigationBarHeight) {
                    i = this.mPaddingBottom + height;
                } else {
                    i = 0;
                    z = false;
                }
                this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, i);
            } else {
                int paddingBottom = this.mImmersionBar.getPaddingBottom();
                height -= navigationBarHeight;
                if (height > navigationBarHeight) {
                    paddingBottom = height + navigationBarHeight;
                } else {
                    z = false;
                }
                this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), paddingBottom);
            }
            int i2 = height >= 0 ? height : 0;
            if (this.mImmersionBar.getBarParams().onKeyboardListener != null) {
                this.mImmersionBar.getBarParams().onKeyboardListener.onKeyboardChange(z, i2);
            }
        }
    }

    public void enable(int i) {
        this.mWindow.setSoftInputMode(i);
        if (!this.mIsAddListener) {
            C786410Ut5.x3(this.mDecorView.getViewTreeObserver(), this);
            this.mIsAddListener = true;
        }
    }

    public FitsKeyboard(ImmersionBar immersionBar, Activity activity, Window window) {
        this.mImmersionBar = immersionBar;
        this.mActivity = activity;
        this.mWindow = window;
        View decorView = window.getDecorView();
        this.mDecorView = decorView;
        ViewGroup viewGroup = (ViewGroup) decorView.findViewById(R.id.content);
        View childAt = viewGroup.getChildAt(0);
        this.mChildView = childAt;
        if (childAt != null) {
            if (childAt instanceof C21586319dt) {
                this.mChildView = ((ViewGroup) childAt).getChildAt(0);
            }
            View view = this.mChildView;
            if (view != null) {
                this.mPaddingLeft = view.getPaddingLeft();
                this.mPaddingTop = this.mChildView.getPaddingTop();
                this.mPaddingRight = this.mChildView.getPaddingRight();
                this.mPaddingBottom = this.mChildView.getPaddingBottom();
            }
        }
        View view2 = this.mChildView;
        this.mContentView = view2 != null ? view2 : viewGroup;
        BarConfig barConfig = new BarConfig(this.mActivity);
        this.mStatusBarHeight = barConfig.getStatusBarHeight();
        this.mActionBarHeight = barConfig.getActionBarHeight();
    }
}
