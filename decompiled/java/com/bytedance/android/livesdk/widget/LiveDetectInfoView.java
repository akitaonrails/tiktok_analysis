package com.bytedance.android.livesdk.widget;

import X.C01GW;
import X.C086I;
import X.C0IJ3;
import X.C0IJ4;
import X.C0IUA;
import X.C1161920gLG;
import X.C11NJ;
import X.C1388190mED;
import X.C19EG;
import X.C292401Bi;
import X.C464950ILd;
import X.C469110IaT;
import X.C474070IiT;
import X.C475060Ik4;
import X.C477520Io2;
import X.C501470JlZ;
import X.C766270U4b;
import X.C784440Upu;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC521770KdD;
import X.InterfaceC465240IMg;
import X.InterfaceC474080IiU;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.livesdk.ViewPagerSlideStatusEvent;
import com.bytedance.android.livesdk.watch.DetectReportDialog;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.debug.GetQuestionnaireContentResponse;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveDetectInfoView extends LiveRecyclableWidget implements View.OnClickListener, InterfaceC465240IMg {
    public TextView LL;
    public TextView LLILLJJLI;
    public C474070IiT LLILLL;
    public CoverImageModel LLILZIL;
    public DetectReportDialog LLIZLLLIL;
    public final String LLILZ = "LiveDetectInfoView";
    public final C11NJ LLILZLL = new C11NJ();
    public final C01GW LLIZ = C292401Bi.LIZ(new AwS551S0100000_7(this, 113));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h6j;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLILZLL.LJ();
        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).removeScreenShotListener();
        x1().removeCallbacksAndMessages(null);
        this.LLILZIL = null;
    }

    public final WeakHandler x1() {
        return (WeakHandler) this.LLIZ.getValue();
    }

    public final void z1() {
        List<Question> list;
        CoverImageModel coverImageModel;
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        DetectReportDialog detectReportDialog = this.LLIZLLLIL;
        if ((detectReportDialog != null && detectReportDialog.isShowing()) || (list = C0IJ3.LJII) == null || list.isEmpty() || (coverImageModel = this.LLILZIL) == null || TextUtils.isEmpty(coverImageModel.uri)) {
            return;
        }
        CoverImageModel coverImageModel2 = this.LLILZIL;
        if (coverImageModel2 == null || coverImageModel2.urlList == null) {
            return;
        }
        List<String> list2 = coverImageModel2 != null ? coverImageModel2.urlList : null;
        if (C086I.LIZIZ(C0IJ3.LJII) || C086I.LIZIZ(list2) || (context = this.context) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
            return;
        }
        DetectReportDialog detectReportDialog2 = new DetectReportDialog();
        this.LLIZLLLIL = detectReportDialog2;
        List<Question> list3 = C0IJ3.LJII;
        CoverImageModel coverImageModel3 = this.LLILZIL;
        detectReportDialog2.LLILZIL = list3;
        detectReportDialog2.LLILZLL = coverImageModel3;
        C475060Ik4 c475060Ik4 = detectReportDialog2.LLILZ;
        if (c475060Ik4 != null) {
            c475060Ik4.LL = list3;
            c475060Ik4.LLILLL = coverImageModel3;
            c475060Ik4.LLLI();
        }
        detectReportDialog2.show(supportFragmentManager, this.LLILZ);
        detectReportDialog2.setOnDismissListener(new DialogInterfaceOnDismissListenerC521770KdD(this, 2));
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        Integer numValueOf;
        if (message != null && (numValueOf = Integer.valueOf(message.what)) != null) {
            if (numValueOf.intValue() == 48) {
                if (HandlerHook.getMessageObj(message.obj) != null && (HandlerHook.getMessageObj(message.obj) instanceof GetQuestionnaireContentResponse)) {
                    GetQuestionnaireContentResponse getQuestionnaireContentResponse = (GetQuestionnaireContentResponse) HandlerHook.getMessageObj(message.obj);
                    Boolean bool = C0IJ3.LIZ;
                    C0IJ3.LJII = getQuestionnaireContentResponse.questions;
                    z1();
                    return;
                }
                return;
            }
            if (numValueOf.intValue() != 51) {
                return;
            }
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj != null) {
                if (messageObj instanceof CoverImageModel) {
                    this.LLILZIL = (CoverImageModel) HandlerHook.getMessageObj(message.obj);
                    z1();
                    return;
                } else if (messageObj instanceof C477520Io2) {
                    C501470JlZ c501470JlZ = (C501470JlZ) messageObj;
                    if (!TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                        C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
                        return;
                    }
                }
            }
            C766270U4b.LJIIJJI("upload image fail,please try again");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:69:0x016f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveDetectInfoView.onClick(android.view.View):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if (obj instanceof Room) {
                Room.isValid((Room) obj);
            }
        }
        this.LL = (TextView) findViewById(R.id.zi_);
        this.LLILLJJLI = (TextView) findViewById(R.id.zi9);
        this.LLILLL = (C474070IiT) findViewById(R.id.muh);
        TextView textView = this.LL;
        TextView textView2 = null;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.T7(textView, this);
        TextView textView3 = this.LLILLJJLI;
        if (textView3 == null) {
            textView3 = null;
        }
        C786410Ut5.T7(textView3, this);
        TextView textView4 = this.LLILLJJLI;
        if (textView4 != null) {
            textView2 = textView4;
        }
        C786410Ut5.LLIL(textView2, 8);
        C474070IiT c474070IiT = this.LLILLL;
        if (c474070IiT != null) {
            c474070IiT.setOnViewDragListener(new InterfaceC474080IiU() { // from class: X.0IbT
                @Override // X.InterfaceC474080IiU
                public final void Bi() {
                    C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(C1388190mED.LIZ(this.LIZ.context)));
                    if (c472280IfaLIZLLL != null) {
                        c472280IfaLIZLLL.setDragDebugTools(false);
                    }
                    DataChannelGlobal.LLILZ.FQ2(ViewPagerSlideStatusEvent.class, Boolean.TRUE);
                }

                @Override // X.InterfaceC474080IiU
                public final void Ci() {
                    C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(C1388190mED.LIZ(this.LIZ.context)));
                    if (c472280IfaLIZLLL != null) {
                        c472280IfaLIZLLL.setDragDebugTools(true);
                    }
                    DataChannelGlobal.LLILZ.FQ2(ViewPagerSlideStatusEvent.class, Boolean.FALSE);
                }
            });
        }
        C474070IiT c474070IiT2 = this.LLILLL;
        if (c474070IiT2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c474070IiT2);
            c474070IiT2.setTranslationY(-600.0f);
        }
        y1(false);
        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).addScreenShotListener();
        this.LLILZLL.LIZ(C784440Upu.LIZ().LJ(C469110IaT.class).LJJLJLI(new AfS176S0100000_7(this, 138)));
        if (C0IJ3.LJII == null) {
            C464950ILd c464950ILd = C464950ILd.LJI;
            WeakHandler weakHandlerX1 = x1();
            c464950ILd.getClass();
            C464950ILd.LJI(weakHandlerX1);
        }
    }

    public final void y1(boolean z) {
        TextView textView = null;
        if (C0IJ3.LIZLLL == 0) {
            TextView textView2 = this.LL;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setBackgroundResource(R.drawable.f18);
            TextView textView3 = this.LL;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(2131841324);
            TextView textView4 = this.LLILLJJLI;
            if (textView4 != null) {
                textView = textView4;
            }
            C786410Ut5.LLIL(textView, 8);
            if (z) {
                Set<Long> set = C0IJ3.LJFF;
                set.clear();
                C464950ILd c464950ILd = C464950ILd.LJI;
                WeakHandler weakHandlerX1 = x1();
                long jLIZIZ = C0IJ4.LIZIZ();
                int size = set.size();
                c464950ILd.getClass();
                C464950ILd.LJIILIIL(weakHandlerX1, jLIZIZ, 0, size);
            }
            C0IJ4.LIZ(C0IUA.LIZLLL);
            return;
        }
        TextView textView5 = this.LL;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setBackgroundResource(R.drawable.f657f17);
        TextView textView6 = this.LL;
        if (textView6 == null) {
            textView6 = null;
        }
        textView6.setText(2131841332);
        TextView textView7 = this.LLILLJJLI;
        if (textView7 != null) {
            textView = textView7;
        }
        C786410Ut5.LLIL(textView, 8);
        if (!z) {
            return;
        }
        C464950ILd c464950ILd2 = C464950ILd.LJI;
        WeakHandler weakHandlerX12 = x1();
        long jLIZIZ2 = C0IJ4.LIZIZ();
        int size2 = C0IJ3.LJFF.size();
        c464950ILd2.getClass();
        C464950ILd.LJIILIIL(weakHandlerX12, jLIZIZ2, 1, size2);
    }
}
