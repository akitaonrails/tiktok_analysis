package com.ss.android.ugc.aweme.im.creative.edit.impl.button;

import X.AbstractC1445310niL;
import X.C01GW;
import X.C0QSJ;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C13LE;
import X.C14KQ;
import X.C1710306mr;
import X.C197039127h;
import X.C2173421A4e;
import X.C2174131A6x;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C497820Jfg;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19359510ob;
import X.InterfaceC1146704e9;
import X.InterfaceC19370810qQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS167S0100000_33;
import Y.ALAdapterS27S0100000_33;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.GroupShotParam;
import com.ss.android.ugc.aweme.im.creative.edit.impl.button.IMEditSendButtonAssem;
import com.ss.android.ugc.aweme.im.creative.edit.impl.ui.IMEditPageScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class IMEditSendButtonAssem extends UISlotAssem implements InterfaceC19370810qQ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public boolean LLJJJIL;
    public volatile C2174131A6x LLJJJJJIL;
    public InterfaceC665370Q7z LLJJJJLIIL;
    public C0QSJ LLJJL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2389));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2394));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2393));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2392));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2390));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2391));
    public final EnumC19359510ob LLJJJJ = EnumC19359510ob.SEND_BUTTON;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMEditSendButtonAssem.class, "featureGraph", "getFeatureGraph()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/di/IMEditFeatureGraph;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC19370810qQ
    public final void Fd() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{IMEditPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IMEditPageScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return ((C2173421A4e) this.LLJJI.getValue()).LIZ.LIZIZ() ? R.layout.cr8 : R.layout.cgx;
    }

    public final C2174131A6x kp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJLIIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJJJLIIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{IMEditPageScope.class});
            this.LLJJL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C2174131A6x c2174131A6x = (C2174131A6x) c0qsjLIZLLL.getAbility(C2174131A6x.class);
        C687700QyG.LJ(c2174131A6x, C2174131A6x.class);
        return c2174131A6x;
    }

    public final AbstractC1445310niL lp() {
        return ((C2173421A4e) this.LLJJI.getValue()).LIZJ.getValue();
    }

    public final TuxIconView mp() {
        return (TuxIconView) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.InterfaceC19370810qQ
    public final EnumC19359510ob W() {
        return this.LLJJJJ;
    }

    public final void hp(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iO2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int iLJFF = ((C2173421A4e) this.LLJJI.getValue()).LJFF.getValue().LJFF();
            if (Build.VERSION.SDK_INT < 35) {
                iO2 = ((C2173421A4e) this.LLJJI.getValue()).LJFF.getValue().o2();
            } else {
                iO2 = 0;
            }
            marginLayoutParams.bottomMargin = iLJFF - iO2;
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        GroupShotParam groupShotParam;
        int iLIZ;
        int iLIZ2;
        int iLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i2;
        super.onViewCreated(view);
        Drawable drawableLIZ = null;
        final boolean z = true;
        if (((C2173421A4e) this.LLJJI.getValue()).LIZ.LIZIZ()) {
            C426750GoL.LJIIL((View) this.LLJJJ.getValue(), 0, 0, 0, 0, 16);
            final int iLJIIIIZZ = C14KQ.LJIIIIZZ(view.getContext());
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            final int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
            final int i3 = iLIZIZ2 + iLIZIZ3 + iLIZIZ4;
            final int i4 = i3 + (iLIZIZ5 * 2);
            if (i4 <= iLJIIIIZZ) {
                z = false;
                ((LinearLayout) this.LLJJJ.getValue()).setGravity(17);
            }
            Context context = getContext();
            if (context != null) {
                iLIZ = C497820Jfg.LIZ(context);
            } else {
                iLIZ = 0;
            }
            Context context2 = getContext();
            if (context2 != null) {
                iLIZ2 = C1710306mr.LIZ(context2);
            } else {
                iLIZ2 = 0;
            }
            if (iLIZ <= 640) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            }
            int iLIZIZ6 = iLIZIZ - iLIZ2;
            TuxIconView tuxIconView = (TuxIconView) this.LLJJIJI.getValue();
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    if (iLIZ2 >= iLIZIZ6) {
                        i2 = iLIZIZ;
                    } else {
                        i2 = iLIZIZ6;
                    }
                    marginLayoutParams.bottomMargin = i2;
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.M6(tuxIconView, marginLayoutParams);
            TuxIconView tuxIconViewMp = mp();
            ViewGroup.LayoutParams layoutParams2 = tuxIconViewMp.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2 != null) {
                    if (iLIZ2 >= iLIZIZ6) {
                        iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    }
                    marginLayoutParams2.bottomMargin = iLIZIZ + iLIZIZ6;
                }
            } else {
                marginLayoutParams2 = null;
            }
            C786410Ut5.M6(tuxIconViewMp, marginLayoutParams2);
            TuxIconView tuxIconViewMp2 = mp();
            if (tuxIconViewMp2 != null) {
                Context context3 = getContext();
                if (context3 != null) {
                    C1361400lX0 c1361400lX0 = new C1361400lX0(context3, R.style.y0);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a03, c1361400lX0);
                    c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(50));
                    c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(50));
                    c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(50));
                    c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(50));
                    drawableLIZ = c384050F3z.LIZ(context3);
                }
                tuxIconViewMp2.setBackground(drawableLIZ);
            }
            TuxIconView tuxIconViewMp3 = mp();
            if (tuxIconViewMp3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewMp3, 0);
            }
            TuxIconView tuxIconViewMp4 = mp();
            if (tuxIconViewMp4 != null) {
                tuxIconViewMp4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.1A4d
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                        if (!z) {
                            int i13 = (iLJIIIIZZ - i4) / 2;
                            IMEditSendButtonAssem iMEditSendButtonAssem = this;
                            iMEditSendButtonAssem.ip(i13, iLIZIZ5, iMEditSendButtonAssem.mp());
                            IMEditSendButtonAssem iMEditSendButtonAssem2 = this;
                            iMEditSendButtonAssem2.ip(iLIZIZ5, i13, (View) iMEditSendButtonAssem2.LLJJIJIL.getValue());
                            return;
                        }
                        int iMin = Math.min((iLJIIIIZZ - i3) / 2, iLIZIZ5);
                        IMEditSendButtonAssem iMEditSendButtonAssem3 = this;
                        iMEditSendButtonAssem3.ip(Math.max(0, iLJIIIIZZ - i4) / 2, iMin, iMEditSendButtonAssem3.mp());
                        IMEditSendButtonAssem iMEditSendButtonAssem4 = this;
                        iMEditSendButtonAssem4.ip(iMin, 0, (View) iMEditSendButtonAssem4.LLJJIJIL.getValue());
                    }
                });
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJJ.getValue(), "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.setStartDelay(300L);
            objectAnimatorOfFloat.addListener(new ALAdapterS27S0100000_33(this, 7));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            C786410Ut5.a9((TuxIconView) this.LLJJIJI.getValue(), new ACListenerS167S0100000_33(this, 52));
            C786410Ut5.a9(mp(), new ACListenerS167S0100000_33(this, 53));
        } else {
            DMCameraModelMirror dMCameraModelMirror = ((C2173421A4e) this.LLJJI.getValue()).LIZ.dmCameraModelMirror;
            if (dMCameraModelMirror != null && dMCameraModelMirror.groupShotData != null) {
                hp(view);
                DMCameraModelMirror dMCameraModelMirror2 = ((C2173421A4e) this.LLJJI.getValue()).LIZ.dmCameraModelMirror;
                if (dMCameraModelMirror2 != null && (groupShotParam = dMCameraModelMirror2.groupShotData) != null && groupShotParam.groupShotTaskId != null) {
                    i = 2131830893;
                } else {
                    i = 2131830914;
                }
                ((TextView) this.LLJJIII.getValue()).setText(i);
                C786410Ut5.U8((C197039127h) this.LLJJIII.getValue(), new ACListenerS167S0100000_33(this, 54));
            } else {
                hp(view);
                C197039127h c197039127h = (C197039127h) this.LLJJIII.getValue();
                c197039127h.setText(R.string.sxo);
                c197039127h.LJJJLZIJ(null, null);
                C786410Ut5.U8(c197039127h, new ACListenerS167S0100000_33(this, 55));
            }
        }
        ((C2173421A4e) this.LLJJI.getValue()).LIZIZ.getValue().LIZ(this);
    }

    @Override // X.InterfaceC19370810qQ
    public final void pi(int i) {
        C786410Ut5.LJLLLLLL(i, getContentView());
    }

    public final void ip(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i2);
        }
        if (view != null) {
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }
}
