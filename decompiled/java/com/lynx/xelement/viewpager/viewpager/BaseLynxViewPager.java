package com.lynx.xelement.viewpager.viewpager;

import X.AbstractC1336850ktP;
import X.C1299120juY;
import X.C1336790ktJ;
import X.C1336890ktT;
import X.C13LZ;
import X.C786410Ut5;
import X.InterfaceC1311800kF0;
import X.InterfaceC1312540kGC;
import X.InterfaceC1336820ktM;
import X.InterfaceC1967107nB;
import android.content.Context;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.xelement.viewpager.childitem.LynxViewpagerItem;
import j27.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseLynxViewPager<K extends C1336790ktJ, T extends AbstractC1336850ktP<K>> extends UISimpleView<T> implements InterfaceC1311800kF0 {
    public static final C1336890ktT Companion = new Object() { // from class: X.0ktT
    };
    public String mCurrentOffset;
    public boolean mEnableChangeEvent;
    public boolean mEnableOffsetChangeEvent;
    public boolean mIsKeepItemView;
    public T mPager;

    public abstract void addPagerChildItem(LynxViewpagerItem lynxViewpagerItem, int i);

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public abstract T createView(Context context);

    public abstract void initViewPagerChangeListener();

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean needCustomLayout() {
        return true;
    }

    public void selectIndexIsSet(int i) {
    }

    @InterfaceC1967107nB
    public abstract void selectTab(ReadableMap readableMap, Callback callback);

    public abstract void sendTabChangeEvent(String str, int i, String str2);

    public T getMPager() {
        T t = this.mPager;
        if (t != null) {
            return t;
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void layoutChildren() {
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.mChildren, i);
            if (this.mIsKeepItemView || !(lynxBaseUI instanceof LynxUI) || ((LynxUI) lynxBaseUI).mView.isAttachedToWindow()) {
                if (needCustomLayout()) {
                    if (lynxBaseUI instanceof UIGroup) {
                        ((UIGroup) lynxBaseUI).layoutChildren();
                    }
                } else if (lynxBaseUI instanceof LynxUI) {
                    lynxBaseUI.layout();
                }
            }
        }
    }

    private final void initGestureListener() {
        getMPager().getMViewPager().setMInterceptTouchEventListener(new InterfaceC1336820ktM(this) { // from class: X.0ktS
            @Override // X.InterfaceC1336820ktM
            public final void LIZ() {
            }
        });
    }

    @Override // X.InterfaceC1311800kF0
    public void onPatchFinish() {
        int count;
        if (getMPager().getMChanged()) {
            AbstractC1336850ktP mPager = getMPager();
            if (mPager.LLIZLLLIL) {
                mPager.LLIZLLLIL = false;
                ((ArrayList) mPager.LLILLJJLI).clear();
                ((ArrayList) mPager.LLILLJJLI).addAll(mPager.LLILLL);
                mPager.LLILZLL.notifyDataSetChanged();
                PagerAdapter adapter = mPager.LL.getAdapter();
                if (adapter != null && (count = adapter.getCount()) != 0) {
                    mPager.LL.setCurrentItem(C13LZ.LJ(mPager.LLILZIL, 0, count - 1), false);
                }
            }
            selectIndexIsSet(getMPager().getMViewPager().getCurrentItem());
        }
    }

    private final void initPagerListener() {
        initViewPagerChangeListener();
    }

    public final String getMCurrentOffset() {
        return this.mCurrentOffset;
    }

    public final boolean getMEnableChangeEvent() {
        return this.mEnableChangeEvent;
    }

    public final boolean getMEnableOffsetChangeEvent() {
        return this.mEnableOffsetChangeEvent;
    }

    public final boolean getMIsKeepItemView() {
        return this.mIsKeepItemView;
    }

    public BaseLynxViewPager(s sVar) {
        this(sVar, null);
    }

    public void initListener(Context context) {
        initGestureListener();
        initPagerListener();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void removeChild(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            lynxBaseUI.setParent(null);
            if (lynxBaseUI instanceof LynxViewpagerItem) {
                AbstractC1336850ktP mPager = getMPager();
                mPager.LLIZLLLIL = true;
                ((ArrayList) mPager.LLILLL).remove(lynxBaseUI);
                return;
            }
            LynxLog.e("LynxViewPager", "viewpager child is illegal, please check behaviors");
        }
    }

    @InterfaceC1312540kGC(name = "allow-horizontal-gesture")
    public final void setAllowHorizontalGesture(boolean z) {
        getMPager().setAllowHorizontalGesture(z);
    }

    @InterfaceC1312540kGC(name = "background")
    public final void setBackground(String str) {
        int color;
        AbstractC1336850ktP mPager = getMPager();
        if (str.length() <= 7) {
            color = ColorProtector.parseColor(str);
        } else {
            int color2 = ColorProtector.parseColor(str);
            color = (color2 << 24) | (color2 >>> 8);
        }
        mPager.setBackgroundColor(color);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.mEnableChangeEvent = true;
        }
    }

    @InterfaceC1312540kGC(name = "keep-item-view")
    public final void setKeepItemView(boolean z) {
        this.mIsKeepItemView = z;
        getMPager().setKeepItemView(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLynxDirection(int i) {
        super.setLynxDirection(i);
        getMPager().setLynxDirection(i);
    }

    public final void setMCurrentOffset(String str) {
        this.mCurrentOffset = str;
    }

    public final void setMEnableChangeEvent(boolean z) {
        this.mEnableChangeEvent = z;
    }

    public final void setMEnableOffsetChangeEvent(boolean z) {
        this.mEnableOffsetChangeEvent = z;
    }

    public final void setMIsKeepItemView(boolean z) {
        this.mIsKeepItemView = z;
    }

    public void setMPager(T t) {
        this.mPager = t;
    }

    @InterfaceC1312540kGC(name = "select-index")
    public final void setSelect(int i) {
        PagerAdapter adapter;
        if (getMPager().getMViewPager().getCurrentItem() == i) {
            return;
        }
        if (i >= 0 && (adapter = getMPager().getMViewPager().getAdapter()) != null && i < adapter.getCount()) {
            getMPager().setCurrentSelectIndex(i);
        }
        getMPager().setSelectedIndex(i);
    }

    public BaseLynxViewPager(s sVar, Object obj) {
        super(sVar, obj);
        this.mEnableOffsetChangeEvent = true;
        this.mCurrentOffset = "";
    }

    public String handleFormatStr(String str, Object... objArr) {
        return C786410Ut5.j4(str, Arrays.copyOf(new Object[]{objArr}, 1));
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        if (lynxBaseUI instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            lynxBaseUI.setParent(this);
            if (lynxBaseUI instanceof LynxViewpagerItem) {
                addPagerChildItem((LynxViewpagerItem) lynxBaseUI, i);
            } else {
                LynxLog.e("LynxViewPager", "viewpager child is illegal, please check behaviors");
            }
        }
    }
}
