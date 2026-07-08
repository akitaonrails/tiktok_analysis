package com.bytedance.android.livesdk.broadcast.preview.widget.notify;

import X.C01GW;
import X.C0ULZ;
import X.C0UPY;
import X.C0UPZ;
import X.C0UQX;
import X.C13LE;
import X.C452501pT;
import X.C480910ItV;
import X.C500260Jjc;
import X.C760180Trs;
import X.C770220UJg;
import X.C771740UPc;
import X.C771790UPh;
import X.C786410Ut5;
import X.EnumC771760UPe;
import Y.ACListenerS79S0300000_12;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.AgeGateNotifyEvent;
import com.bytedance.android.livesdk.broadcast.BannerNotifyEvent;
import com.bytedance.android.livesdk.broadcast.ColdDownNotifyEvent;
import com.bytedance.android.livesdk.broadcast.NormalNotifyEvent;
import com.bytedance.android.livesdk.broadcast.ShakeBlockTipEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewViolationVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewCommonNotifyWidget extends PreviewWidget {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 185));
    public C771790UPh LLILZIL;
    public EnumC771760UPe LLILZLL;
    public C0UPZ LLIZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i11;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final View I1() {
        return (View) this.LLILZ.getValue();
    }

    public final boolean J1() {
        DataChannel dataChannel = this.dataChannel;
        Object objGg0 = dataChannel != null ? dataChannel.gg0(LiveModeChannel.class) : null;
        if (C760180Trs.LJI()) {
            return objGg0 == LiveMode.SCREEN_RECORD || objGg0 == LiveMode.THIRD_PARTY;
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(PreviewViolationVisibilityChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(PreviewViolationVisibilityChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        ViewGroup viewGroup;
        super.C1();
        View view = getView();
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null || viewGroup.getChildCount() <= 0) {
            hide();
        } else {
            show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, AgeGateNotifyEvent.class, new AwS591S0100000_12(this, 365));
            dataChannel.EQ2(this, ColdDownNotifyEvent.class, new AwS591S0100000_12(this, 366));
            dataChannel.EQ2(this, NormalNotifyEvent.class, new AwS591S0100000_12(this, 367));
            dataChannel.EQ2(this, BannerNotifyEvent.class, new AwS591S0100000_12(this, 368));
            dataChannel.BQ2(this, ShakeBlockTipEvent.class, new AwS591S0100000_12(this, 369));
            dataChannel.EQ2(this, LiveModeChannel.class, new AwS591S0100000_12(this, 370));
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 371));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ItV, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final void G1(C771790UPh c771790UPh) {
        ViewGroup viewGroup;
        ?? r2;
        ?? r1;
        this.LLILZIL = c771790UPh;
        boolean z = true;
        if (c771790UPh.LIZ == 0) {
            show();
            View viewH1 = H1(c771790UPh.LIZIZ);
            if (viewH1 != null) {
                C500260Jjc.LLFFF(viewH1);
                return;
            }
            if (J1()) {
                C0ULZ c0ulz = new C0ULZ(getContext());
                c0ulz.setTag(c771790UPh.LIZIZ);
                c0ulz.setTitle(c771790UPh.LIZJ);
                c0ulz.setSubTitle(null);
                if (c771790UPh.LIZLLL != 0) {
                    z = false;
                }
                c0ulz.setRightIcon(z);
                c0ulz.LIZIZ();
                c0ulz.LIZ();
                r2 = c0ulz;
            } else {
                final Context context = getContext();
                ?? r22 = new LinearLayout(context) { // from class: X.0ItV
                    public C16F5 LL;
                    public LiveIconView LLILLJJLI;

                    public final LiveIconView getArrowFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.b8t);
                            this.LLILLJJLI = (LiveIconView) callbackFindViewById;
                        }
                        return (LiveIconView) callbackFindViewById;
                    }

                    public final C16F5 getNotifyTextFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LL;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.pfs);
                            this.LL = (C16F5) callbackFindViewById;
                        }
                        return (C16F5) callbackFindViewById;
                    }

                    {
                        C500260Jjc.LJIILL(R.layout.hhv, this, true);
                        C16F5 notifyTextFromXml = getNotifyTextFromXml();
                        notifyTextFromXml.setMovementMethod(LinkMovementMethod.getInstance());
                        notifyTextFromXml.setHighlightColor(0);
                    }

                    public final void setArrowFromXml(LiveIconView liveIconView) {
                        this.LLILLJJLI = liveIconView;
                    }

                    public final void setArrowVisibility(int i) {
                        C786410Ut5.LLJJIJIL(getArrowFromXml(), i);
                    }

                    public final void setNotifyText(CharSequence charSequence) {
                        getNotifyTextFromXml().setText(charSequence);
                    }

                    public final void setNotifyTextFromXml(C16F5 c16f5) {
                        this.LL = c16f5;
                    }
                };
                r22.setTag(c771790UPh.LIZIZ);
                r22.setArrowVisibility(c771790UPh.LIZLLL);
                r22.setNotifyText(c771790UPh.LIZJ);
                r2 = r22;
            }
            View view = getView();
            if ((view instanceof ViewGroup) && (r1 = (ViewGroup) view) != 0) {
                r1.addView(r2);
                return;
            }
            return;
        }
        View viewH12 = H1(c771790UPh.LIZIZ);
        if (viewH12 != null) {
            C500260Jjc.LJIILIIL(viewH12);
        }
        View view2 = getView();
        if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null && viewGroup.getChildCount() > 0) {
            return;
        }
        hide();
    }

    public final View H1(EnumC771760UPe enumC771760UPe) {
        ViewGroup viewGroup;
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (J1()) {
                    if ((childAt instanceof C0ULZ) && childAt.getTag() == enumC771760UPe) {
                        return childAt;
                    }
                } else if ((childAt instanceof C480910ItV) && childAt.getTag() == enumC771760UPe) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final void L1(C0UPZ c0upz) {
        C0UPY c0upy;
        String str;
        String str2;
        String str3;
        Long l;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C0ULZ c0ulz;
        String str4;
        String str5 = null;
        if (J1()) {
            View viewI1 = I1();
            if ((viewI1 instanceof C0ULZ) && (c0ulz = (C0ULZ) viewI1) != null) {
                c0ulz.setTag(c0upz.LIZ);
                c0ulz.setTitle(c0upz.LIZIZ);
                c0ulz.setSubTitle(c0upz.LIZJ);
                C771740UPc c771740UPc = c0upz.LIZLLL;
                if (c771740UPc != null) {
                    str4 = c771740UPc.LIZJ;
                } else {
                    str4 = null;
                }
                c0ulz.setRightIcon(C500260Jjc.LJJIIZ(str4));
                C786410Ut5.Xa(c0ulz, new ACListenerS79S0300000_12(this, c0ulz, c0upz, 4));
            }
        } else {
            View viewI12 = I1();
            if ((viewI12 instanceof C0UPY) && (c0upy = (C0UPY) viewI12) != null) {
                c0upy.setTag(c0upz.LIZ);
                c0upy.setTitle(c0upz.LIZIZ);
                c0upy.setSubTitle(c0upz.LIZJ);
                C771740UPc c771740UPc2 = c0upz.LIZLLL;
                if (c771740UPc2 != null) {
                    str = c771740UPc2.LIZJ;
                } else {
                    str = null;
                }
                c0upy.setRightIcon(C500260Jjc.LJJIIZ(str));
                C786410Ut5.E7(c0upy, new ACListenerS79S0300000_12(this, c0upy, c0upz, 5));
            }
        }
        DataChannel dataChannel = this.dataChannel;
        C771740UPc c771740UPc3 = c0upz.LIZLLL;
        if (c771740UPc3 != null) {
            str5 = c771740UPc3.LIZLLL;
            str2 = c771740UPc3.LJ;
            str3 = c771740UPc3.LJFF;
            l = c771740UPc3.LJI;
        } else {
            str2 = null;
            str3 = null;
            l = null;
        }
        C0UQX.LJJIIZI(dataChannel, str5, str2, str3, l);
        show();
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && viewGroup.indexOfChild(I1()) == -1) {
            View view2 = getView();
            if ((view2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view2) != null) {
                viewGroup2.addView(I1());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, android.text.Spannable, android.text.SpannableString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M1(com.bytedance.android.live.broadcast.model.RoomCreateInfo r18, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r19) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget.M1(com.bytedance.android.live.broadcast.model.RoomCreateInfo, com.bytedance.android.livesdkapi.depend.model.live.LiveMode):void");
    }
}
