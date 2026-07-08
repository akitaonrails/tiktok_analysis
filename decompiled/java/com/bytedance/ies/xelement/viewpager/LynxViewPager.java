package com.bytedance.ies.xelement.viewpager;

import X.AbstractC1336950ktZ;
import X.C1289960jfm;
import X.C1298720jtu;
import X.C1336690kt9;
import X.C1336740ktE;
import X.C1339320kxO;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import j27.s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxViewPager extends BaseLynxViewPager<C1336740ktE, C1336690kt9> {
    public boolean LLJI;

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void initViewPagerChangeListener() {
        LJJIJ().getMViewPager().addOnPageChangeListener(new C1339320kxO(this, 0));
    }

    public LynxViewPager(s sVar) {
        super(sVar, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends X.0ktZ<K>, X.0kt9] */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        if (context == null) {
            return null;
        }
        this.LLIZLLLIL = new AbstractC1336950ktZ<C1336740ktE>(context) { // from class: X.0kt9
            @Override // X.AbstractC1336950ktZ
            public void setTabBarElementAdded(boolean z) {
            }

            {
                new LinkedHashMap();
                super(new C1336770ktH(context) { // from class: X.0ktE
                    {
                        new LinkedHashMap();
                    }

                    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
                    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) throws IllegalAccessException {
                        boolean zOnInterceptTouchEvent;
                        Integer numValueOf;
                        if (!getMAllowHorizontalGesture()) {
                            if (motionEvent != null) {
                                numValueOf = Integer.valueOf(motionEvent.getActionMasked());
                            } else {
                                numValueOf = null;
                            }
                            zOnInterceptTouchEvent = false;
                            if (numValueOf != null) {
                                if (numValueOf.intValue() == 0) {
                                    setMLastMotionX(motionEvent.getX());
                                    setMLastMotionY(motionEvent.getY());
                                    setMActivePointerId(motionEvent.getPointerId(0));
                                } else if (numValueOf.intValue() == 2 && getMActivePointerId() != -1) {
                                    int iFindPointerIndex = motionEvent.findPointerIndex(getMActivePointerId());
                                    float x = motionEvent.getX(iFindPointerIndex);
                                    float y = motionEvent.getY(iFindPointerIndex);
                                    if (Math.abs(x - getMLastMotionX()) * 0.5f > Math.abs(y - getMLastMotionY())) {
                                        setMLastMotionX(x);
                                        setMLastMotionY(y);
                                        Field isUnableToDrag = getIsUnableToDrag();
                                        if (isUnableToDrag != null) {
                                            isUnableToDrag.setAccessible(true);
                                            if (isUnableToDrag.getBoolean(this)) {
                                                isUnableToDrag.set(this, Boolean.FALSE);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
                        }
                        InterfaceC1336750ktF mInterceptTouchEventListener = getMInterceptTouchEventListener();
                        if (mInterceptTouchEventListener != null) {
                            mInterceptTouchEventListener.LIZ(zOnInterceptTouchEvent);
                        }
                        return zOnInterceptTouchEvent;
                    }

                    @Override // androidx.viewpager.widget.ViewPager
                    public void setCurrentItem(int i) {
                        PagerAdapter adapter = super.getAdapter();
                        if (adapter != null && this.LLIZ) {
                            i = (adapter.getCount() - i) - 1;
                        }
                        super.setCurrentItem(i);
                    }

                    @Override // androidx.viewpager.widget.ViewPager
                    public final void setCurrentItem(int i, boolean z) {
                        PagerAdapter adapter = super.getAdapter();
                        if (adapter != null && this.LLIZ) {
                            i = (adapter.getCount() - i) - 1;
                        }
                        super.setCurrentItem(i, z);
                    }
                }, context);
            }
        };
        initListener(context);
        return LJJIJ();
    }

    @InterfaceC1312540kGC(name = "viewpager-dynamic")
    public final void setViewPagerDynamic(boolean z) {
        this.LLJI = z;
    }

    public LynxViewPager(s sVar, Object obj) {
        super(sVar, obj);
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void LJJIIZI(LynxViewpagerItem lynxViewpagerItem, int i) {
        if (this.LLJI) {
            if (LJJIJ().getMTabLayout() != null && LJJIJ().getTabLayoutCodeMode() != 0) {
                C1336690kt9 c1336690kt9LJJIJ = LJJIJ();
                int i2 = i - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                c1336690kt9LJJIJ.setMChanged(true);
                ListProtector.add(c1336690kt9LJJIJ.getMPendingChildren(), i2, lynxViewpagerItem);
                return;
            }
            C1336690kt9 c1336690kt9LJJIJ2 = LJJIJ();
            c1336690kt9LJJIJ2.setMChanged(true);
            ListProtector.add(c1336690kt9LJJIJ2.getMPendingChildren(), i, lynxViewpagerItem);
            return;
        }
        C1336690kt9 c1336690kt9LJJIJ3 = LJJIJ();
        c1336690kt9LJJIJ3.LLILZLL = true;
        ((ArrayList) c1336690kt9LJJIJ3.LLIZLLLIL).add(lynxViewpagerItem);
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    @InterfaceC1967107nB
    public void selectTab(ReadableMap readableMap, Callback callback) {
        PagerAdapter adapter;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (readableMap.hasKey("index")) {
            int i = readableMap.getInt("index");
            if (i >= 0 && (adapter = LJJIJ().getMViewPager().getAdapter()) != null && i < adapter.getCount()) {
                LJJIJ().setCurrentSelectIndex(i);
                javaOnlyMap.put("success", Boolean.TRUE);
                if (callback != null) {
                    callback.invoke(0, javaOnlyMap);
                    return;
                }
                return;
            }
            javaOnlyMap.put("msg", "index out of bounds");
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.put("msg", "no index key");
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void sendTabChangeEvent(String str, int i, String str2) {
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "change");
        c1289960jfm.LIZIZ(str, "tag");
        c1289960jfm.LIZIZ(Integer.valueOf(i), "index");
        c1289960jfm.LIZIZ(str2, Scene.SCENE_SERVICE);
        c1298720jtu.LIZIZ(c1289960jfm);
    }
}
