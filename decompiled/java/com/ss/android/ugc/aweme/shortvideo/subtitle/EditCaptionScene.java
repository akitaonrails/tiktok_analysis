package com.ss.android.ugc.aweme.shortvideo.subtitle;

import X.AbstractC1585810rMx;
import X.AbstractC21674919sB;
import X.AbstractC2217051Bpv;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.AnonymousClass1264;
import X.C01GW;
import X.C092O;
import X.C0CHQ;
import X.C0DHG;
import X.C0DXR;
import X.C0EJ1;
import X.C0EJ3;
import X.C0ETY;
import X.C0EVG;
import X.C0EVI;
import X.C0F63;
import X.C0F6U;
import X.C0F71;
import X.C0LAB;
import X.C0MWZ;
import X.C0XF1;
import X.C128A;
import X.C12ES;
import X.C1341080l0E;
import X.C1388190mED;
import X.C1390410mHn;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1402610mbT;
import X.C1416310mxZ;
import X.C1428470nHB;
import X.C1428520nHG;
import X.C1452730nuJ;
import X.C1453160nv0;
import X.C1453170nv1;
import X.C1456140nzo;
import X.C1462750oAT;
import X.C1463700oC0;
import X.C1654320t9S;
import X.C1662160tM6;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C19510311Uv;
import X.C1954807lC;
import X.C19719212De;
import X.C19733712It;
import X.C19737512Kf;
import X.C19A3;
import X.C1D10;
import X.C1DRF;
import X.C1DRG;
import X.C20094213jo;
import X.C201955140j;
import X.C20684815ws;
import X.C21566519ah;
import X.C21566919al;
import X.C21673919s1;
import X.C2173051A2t;
import X.C2188811AlT;
import X.C2216891Bpf;
import X.C2216941Bpk;
import X.C2216971Bpn;
import X.C2216981Bpo;
import X.C2217001Bpq;
import X.C2217011Bpr;
import X.C2217021Bps;
import X.C2217381BqS;
import X.C289240BVi;
import X.C294870Bh7;
import X.C296180BjE;
import X.C306660C0i;
import X.C348100Dkm;
import X.C352130DrH;
import X.C363730ENv;
import X.C364440EQo;
import X.C366700EZg;
import X.C366800EZq;
import X.C371890Ei3;
import X.C372580EjA;
import X.C372830EjZ;
import X.C372880Eje;
import X.C384340F5c;
import X.C384570F5z;
import X.C425240Glu;
import X.C452501pT;
import X.C545820Lau;
import X.C564040MAg;
import X.C632670Orh;
import X.C786410Ut5;
import X.C790060Uyy;
import X.C960203pA;
import X.C985403tE;
import X.EnumC372730EjP;
import X.InterfaceC1391500mJY;
import X.InterfaceC1446740nke;
import X.InterfaceC1452170ntP;
import X.InterfaceC1455860nzM;
import X.InterfaceC1456910o13;
import X.InterfaceC1460000o62;
import X.InterfaceC1461350o8D;
import X.InterfaceC1461390o8H;
import X.InterfaceC1464180oCm;
import X.InterfaceC2216881Bpe;
import X.InterfaceC2217461Bqa;
import X.InterfaceC362610EJn;
import X.InterfaceC372920Eji;
import X.InterfaceC379610EuV;
import X.InterfaceC524950KiL;
import X.InterfaceC790070Uyz;
import Y.ACListenerS168S0100000_34;
import Y.AObjectS247S0100000_29;
import Y.AObjectS250S0100000_33;
import Y.AObserverS209S0100000_5;
import Y.AObserverS212S0100000_8;
import Y.AObserverS231S0100000_29;
import Y.AObserverS236S0100000_34;
import Y.ARunnableS103S0200000_34;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.AwS657S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nv7.c0;
import u4.q0;

/* JADX INFO: loaded from: classes35.dex */
public final class EditCaptionScene extends C19A3 implements InterfaceC2216881Bpe, InterfaceC379610EuV, C0EVI {
    public static final C2173051A2t LLLZLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLZZ;
    public static final int LLLZZIL;
    public static final int LLZ;
    public static final int LLZIL;
    public static final int LLZILL;
    public static final int LLZL;
    public static final float LLZLI;
    public final C1DRG LLJILLL;
    public C364440EQo LLJJ;
    public long LLJJI;
    public C2216891Bpf LLJJIII;
    public C19737512Kf LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public float LLJJJIL;
    public final C01GW LLJJJJ;
    public C2216941Bpk LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public HighLightLayoutManager LLJL;
    public C384570F5z LLJLIL;
    public final C1664750tQH LLJLILLLLZIIL;
    public final C1664750tQH LLJLL;
    public final C1664750tQH LLJLLIL;
    public Context LLJLLL;
    public InterfaceC1452170ntP LLJZ;
    public int LLJZIJLIL;
    public ViewGroup LLL;
    public C372830EjZ LLLF;
    public C2217021Bps LLLFF;
    public MutableLiveData<C1452730nuJ> LLLFFI;
    public SafeHandler LLLFZ;
    public SafeHandler LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public boolean LLLIIIIL;
    public final ArrayList<CaptionUtterance> LLLIIIL;
    public ArrayList<CaptionUtterance> LLLIIL;
    public ArrayList<CaptionUtterance> LLLIILIL;
    public C2217001Bpq LLLIL;
    public long LLLILZ;
    public boolean LLLILZJ;
    public InterfaceC524950KiL LLLILZLLLI;
    public final C2216981Bpo LLLIZZ;
    public String LLLJ;
    public final C1664750tQH LLLJIL;
    public RelativeLayout LLLJL;
    public LinearLayout LLLL;
    public TextView LLLLII;
    public TextView LLLLIIIILLL;
    public LinearLayout LLLLIIL;
    public C1390410mHn LLLLIILL;
    public LinearLayout LLLLIILLL;
    public C425240Glu LLLLIL;
    public View LLLLILI;
    public TextView LLLLJ;
    public TextView LLLLJI;
    public TuxIconView LLLLL;
    public View LLLLLIL;
    public View LLLLLILLIL;
    public TuxTextView LLLLLJIL;
    public ConstraintLayout LLLLLJLJLL;
    public TuxIconView LLLLLL;
    public TuxIconView LLLLLLIL;
    public LinearLayout LLLLLLJ;
    public TuxTextView LLLLLLL;
    public TuxIconView LLLLLLLLL;
    public TuxIconView LLLLLLLLLL;
    public TuxTextView LLLLLLLZIL;
    public FrameLayout LLLLLLZ;
    public LinearLayout LLLLLLZZ;
    public AnonymousClass1264 LLLLLZ;
    public Context LLLLLZIL;
    public InterfaceC1461390o8H LLLLLZL;
    public Integer LLLLZ;
    public String LLLLZI;
    public String LLLLZIL;
    public ArrayList<LanguageDetail> LLLLZLL;
    public boolean LLLLZLLIL;
    public boolean LLLLZLLLI;
    public boolean LLLZ;
    public boolean LLLZI;
    public final C384340F5c LLLZIIL;
    public final C01GW LLLZIL;
    public Dialog LLLZL;
    public Rect LLLZLL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.1A2t] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditCaptionScene.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLLZZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(EditCaptionScene.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(EditCaptionScene.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(EditCaptionScene.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(EditCaptionScene.class, "subtitleApi", "getSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0)};
        LLLZLZ = new Object() { // from class: X.1A2t
        };
        int iLIZ = C366700EZg.LIZ(266.0d);
        LLLZZIL = iLIZ;
        int iLIZ2 = C366700EZg.LIZ(425.0d);
        LLZ = iLIZ2;
        int iLIZ3 = C366700EZg.LIZ(163.0d);
        LLZIL = iLIZ3;
        LLZILL = (iLIZ3 + iLIZ2) - iLIZ;
        LLZL = C366700EZg.LIZ(52.0d);
        LLZLI = C12ES.LIZJ(12.0f, C0CHQ.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    @Override // X.C0EVI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AD() {
        /*
            r5 = this;
            X.0tM6 r1 = X.C1662160tM6.LIZIZ
            java.lang.String r0 = "EditCaptionScene -> recognize fail, show retry"
            X.C201955140j.LIZJ(r1, r0)
            android.app.Dialog r0 = r5.LLLZL
            if (r0 == 0) goto L83
            boolean r1 = r0.isShowing()
            r0 = 1
            if (r1 != r0) goto L83
        L12:
            r4 = 0
            if (r0 == 0) goto L21
            android.app.Dialog r0 = r5.LLLZL
            if (r0 == 0) goto L1f
            r0.dismiss()
            X.C785410UrT.LIZ(r0)
        L1f:
            r5.LLLZL = r4
        L21:
            android.widget.LinearLayout r1 = r5.LLLLLZ()
            r0 = 8
            X.C786410Ut5.LJZL(r0, r1)
            r5.LLLLZLLLI()
            r5.LLZ()
            X.12Kf r0 = r5.LLJJIJI
            if (r0 != 0) goto L48
            X.12Kf r3 = new X.12Kf
            android.widget.FrameLayout r2 = r5.LLLLLZL()
            android.widget.LinearLayout r1 = r5.LLLLLLLLLL()
            android.view.View r0 = r5.LLJJL
            if (r0 != 0) goto L43
            r0 = r4
        L43:
            r3.<init>(r1, r0, r2)
            r5.LLJJIJI = r3
        L48:
            android.view.View r1 = r5.LLJJL
            if (r1 != 0) goto L4d
            r1 = r4
        L4d:
            r0 = 2131392929(0x7f0a79a1, float:1.84065E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            Y.ACListenerS168S0100000_34 r1 = new Y.ACListenerS168S0100000_34
            r0 = 18
            r1.<init>(r5, r0)
            X.C786410Ut5.T7(r2, r1)
            android.view.View r0 = r5.LLJJL
            if (r0 == 0) goto L65
            r4 = r0
        L65:
            r0 = 2131365854(0x7f0a0fde, float:1.8351585E38)
            android.view.View r2 = r4.findViewById(r0)
            Y.ACListenerS168S0100000_34 r1 = new Y.ACListenerS168S0100000_34
            r0 = 19
            r1.<init>(r5, r0)
            X.C786410Ut5.I7(r1, r2)
            X.12Kf r1 = r5.LLJJIJI
            if (r1 == 0) goto L82
            X.11Uv r0 = new X.11Uv
            r0.<init>()
            r1.LIZJ(r0)
        L82:
            return
        L83:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.AD():void");
    }

    public final int LLLLJ() {
        long j = this.LLLILZ;
        C2217021Bps c2217021Bps = this.LLLFF;
        if (c2217021Bps == null) {
            c2217021Bps = null;
        }
        if (j == c2217021Bps.LIZ()) {
            return -1;
        }
        C2217021Bps c2217021Bps2 = this.LLLFF;
        if (c2217021Bps2 == null) {
            c2217021Bps2 = null;
        }
        this.LLLILZ = c2217021Bps2.LIZ();
        if (LLLLLLZZ().getAdapter() == null) {
            return -1;
        }
        C384570F5z c384570F5z = this.LLJLIL;
        ArrayList<CaptionUtterance> arrayList = (c384570F5z != null ? c384570F5z : null).LL;
        for (CaptionUtterance captionUtterance : arrayList) {
            if (((int) captionUtterance.LIZJ()) != 0 || ((int) captionUtterance.LIZ()) != this.LLJZIJLIL) {
                long jLIZJ = captionUtterance.LIZJ();
                long j2 = this.LLLILZ;
                if (jLIZJ <= j2 && j2 < captionUtterance.LIZ()) {
                    return arrayList.indexOf(captionUtterance);
                }
            }
        }
        return arrayList.size() - 1;
    }

    public final String LLLLJI() {
        LanguageDetail next;
        String str;
        ArrayList<LanguageDetail> arrayList = this.LLLLZLL;
        if (arrayList != null) {
            Iterator<LanguageDetail> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(next.localName, this.LLLLZI)) {
                    break;
                }
            }
            LanguageDetail languageDetail = next;
            if (languageDetail != null && (str = languageDetail.code) != null) {
                return str;
            }
        }
        return "";
    }

    public final InterfaceC1455860nzM LLLLL() {
        return (InterfaceC1455860nzM) this.LLJLILLLLZIIL.getValue(this, LLLZZ[0]);
    }

    public final int LLLLLIL() {
        int iO2 = c0.LIZ.o2();
        Context context = this.LLJLLL;
        if (context == null) {
            context = null;
        }
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(context);
        Context context2 = this.LLJLLL;
        if (context2 == null) {
            context2 = null;
        }
        int iLIZJ = fullScreenHeight - ((int) C12ES.LIZJ(52.0f, context2));
        int i = ((C2217011Bpr) this.LLLIIII.getValue()).LIZ.getInt("control_view_height", -1);
        int i2 = LLZ;
        if (i != i2) {
            i2 = LLLZZIL;
        }
        int i3 = iLIZJ - i2;
        Context context3 = this.LLJLLL;
        int statusBarHeight = (i3 - ScreenUtils.getStatusBarHeight(context3 != null ? context3 : null)) - iO2;
        C372830EjZ c372830EjZ = this.LLLF;
        return statusBarHeight - (c372830EjZ != null ? c372830EjZ.getGrabberHeight() : 0);
    }

    public final String LLLLLILLIL() {
        return this.LLLZI ? "edit_page_text_sidebar" : "edit_page_subtitle_sidebar";
    }

    public final RelativeLayout LLLLLJIL() {
        RelativeLayout relativeLayout = this.LLLJL;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        return null;
    }

    public final View LLLLLJLJLL() {
        View view = this.LLLLLILLIL;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final TuxIconView LLLLLL() {
        TuxIconView tuxIconView = this.LLLLLL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    public final TuxIconView LLLLLLIL() {
        TuxIconView tuxIconView = this.LLLLL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    public final TuxIconView LLLLLLJ() {
        TuxIconView tuxIconView = this.LLLLLLIL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    public final View LLLLLLL() {
        View view = this.LLLLLIL;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final LinearLayout LLLLLLLLL() {
        LinearLayout linearLayout = this.LLLLLLJ;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final LinearLayout LLLLLLLLLL() {
        LinearLayout linearLayout = this.LLLLIIL;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final C1390410mHn LLLLLLLZIL() {
        C1390410mHn c1390410mHn = this.LLLLIILL;
        if (c1390410mHn != null) {
            return c1390410mHn;
        }
        return null;
    }

    public final VideoPublishEditModel LLLLLLZ() {
        return (VideoPublishEditModel) this.LLJLL.getValue(this, LLLZZ[2]);
    }

    public final C425240Glu LLLLLLZZ() {
        C425240Glu c425240Glu = this.LLLLIL;
        if (c425240Glu != null) {
            return c425240Glu;
        }
        return null;
    }

    public final LinearLayout LLLLLZ() {
        LinearLayout linearLayout = this.LLLLIILLL;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final FrameLayout LLLLLZL() {
        FrameLayout frameLayout = this.LLLLLLZ;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    public final TuxTextView LLLLZ() {
        TuxTextView tuxTextView = this.LLLLLLL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final InterfaceC1456910o13 LLLLZIL() {
        return (InterfaceC1456910o13) this.LLLJIL.getValue(this, LLLZZ[4]);
    }

    public final void LLLLZLL() {
        C384570F5z c384570F5z = this.LLJLIL;
        if (c384570F5z == null) {
            c384570F5z = null;
        }
        int iLLLFZ = c384570F5z.LLLFZ();
        if (iLLLFZ != -1) {
            C384570F5z c384570F5z2 = this.LLJLIL;
            CaptionUtterance captionUtterance = (CaptionUtterance) C13LP.LJJJLZIJ(iLLLFZ, (c384570F5z2 != null ? c384570F5z2 : null).LL);
            LLLLILI(iLLLFZ, captionUtterance != null ? captionUtterance.LJ().length() : -1, "click_adjust_icon");
        }
    }

    public final void LLLLZLLLI() {
        MutableLiveData<Integer> mutableLiveData;
        SafeHandler safeHandler = this.LLLFZ;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.removeCallbacksAndMessages(null);
        AbstractC2217051Bpv abstractC2217051BpvRw1 = LLLLZIL().rw1();
        if (abstractC2217051BpvRw1 != null && (mutableLiveData = abstractC2217051BpvRw1.LJIL) != null) {
            mutableLiveData.removeObservers(this);
        }
        SafeHandler safeHandler2 = this.LLLI;
        if (safeHandler2 == null) {
            safeHandler2 = null;
        }
        safeHandler2.removeCallbacksAndMessages(null);
        C786410Ut5.LLLZZIL(LLLLLLLZIL(), 8);
        LLLLLLLZIL().LIZLLL();
        C786410Ut5.LJZL(8, LLLLLLLLLL());
    }

    public final boolean LLLZIL() {
        int iIntValue;
        Integer num = this.LLLLZ;
        if (num != null && (iIntValue = num.intValue()) >= 0) {
            return iIntValue != 0;
        }
        if (u4.LJLJLJ(LLLLLLZ())) {
            if (LLLLLLZ().creativeModel.inlineCaptionModel == null) {
                CaptionCachesModel captionCachesModel = this.LLJJ.LIZ.get(this.LLLLZI);
                if (captionCachesModel == null || captionCachesModel.captionsList == null) {
                }
            }
            return false;
        }
        return true;
    }

    public final void LLLZLL() {
        MutableLiveData<C1452730nuJ> mutableLiveData = this.LLLFFI;
        if (mutableLiveData == null) {
            mutableLiveData = null;
        }
        mutableLiveData.setValue(C1452730nuJ.LIZ());
        C786410Ut5.LJLLLLLL(8, LLLLLLL());
    }

    public final void LLLZLZ() {
        if (!this.LLLLZLLLI) {
            if (!(!Intrinsics.LJFF(this.LLLIIIL, this.LLLIILIL))) {
                LLLLIILL();
                return;
            }
            if (!C296180BjE.LIZ()) {
                Context context = this.LLJLLL;
                if (context == null) {
                    context = null;
                }
                C21566919al c21566919al = new C21566919al(context);
                c21566919al.LIZ(2131828392);
                c21566919al.LJII(R.string.f1_, null, false);
                c21566919al.LJIIJ(2131826895, new C1D10(this, 1), false);
                new C21566519ah(c21566919al).LIZLLL();
                return;
            }
            if (C0DHG.LIZ()) {
                Context context2 = this.LLJLLL;
                if (context2 == null) {
                    context2 = null;
                }
                if (C1388190mED.LIZ(context2) != null) {
                    Context context3 = this.LLJLLL;
                    C632670Orh.LIZIZ(context3 != null ? context3 : null, new C19719212De(-1664504246, new AwS657S0100000_8(this, 2), true));
                    return;
                }
            }
            Context context4 = this.LLJLLL;
            C1397580mTM c1397580mTM = new C1397580mTM(context4 != null ? context4 : null);
            c1397580mTM.LIZ(2131830678);
            C985403tE.LIZ(c1397580mTM, new AwS613S0100000_34(this, 43));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        ArrayList<CaptionUtterance> arrayList = this.LLLIILIL;
        if (arrayList == null && !Intrinsics.LJFF(this.LLLIIIL, arrayList)) {
            if (C0DHG.LIZ()) {
                Context context5 = this.LLJLLL;
                if (context5 == null) {
                    context5 = null;
                }
                if (C1388190mED.LIZ(context5) != null) {
                    Context context6 = this.LLJLLL;
                    C632670Orh.LIZIZ(context6 != null ? context6 : null, new C19719212De(-1894453343, new AwS657S0100000_8(this, 3), true));
                    return;
                }
            }
            Context context7 = this.LLJLLL;
            C1397580mTM c1397580mTM2 = new C1397580mTM(context7 != null ? context7 : null);
            c1397580mTM2.LIZ(2131828392);
            C985403tE.LIZ(c1397580mTM2, new AwS613S0100000_34(this, 45));
            new C1397510mTF(c1397580mTM2).LIZLLL();
            return;
        }
        ArrayList<CaptionUtterance> arrayList2 = this.LLLIILIL;
        if (arrayList2 == null || Intrinsics.LJFF(this.LLLIIIL, arrayList2)) {
            LLLLIILL();
            return;
        }
        int i = C296180BjE.LIZ() ? 2131830678 : 2131828389;
        if (C0DHG.LIZ()) {
            Context context8 = this.LLJLLL;
            if (context8 == null) {
                context8 = null;
            }
            if (C1388190mED.LIZ(context8) != null) {
                Context context9 = this.LLJLLL;
                C632670Orh.LIZIZ(context9 != null ? context9 : null, new C19719212De(674024856, new C564040MAg(i, this), true));
                return;
            }
        }
        Context context10 = this.LLJLLL;
        C1397580mTM c1397580mTM3 = new C1397580mTM(context10 != null ? context10 : null);
        c1397580mTM3.LIZ(i);
        C985403tE.LIZ(c1397580mTM3, new AwS613S0100000_34(this, 49));
        new C1397510mTF(c1397580mTM3).LIZLLL();
    }

    public final void LLZ() {
        if (!this.LLLLZLLIL || C371890Ei3.LIZJ() == null) {
            ConstraintLayout constraintLayout = this.LLLLLJLJLL;
            C786410Ut5.LL(4, constraintLayout != null ? constraintLayout : null);
            return;
        }
        ConstraintLayout constraintLayout2 = this.LLLLLJLJLL;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        C786410Ut5.LL(0, constraintLayout2);
        C786410Ut5.LJZL(0, LLLLLLLLL());
        TuxTextView tuxTextView = this.LLLLLLLZIL;
        C786410Ut5.LLLLZLL(tuxTextView != null ? tuxTextView : null, 8);
        C786410Ut5.LLLLLLZZ(LLLLLL(), 8);
        C786410Ut5.LLLLLLZZ(LLLLLLIL(), 8);
        C786410Ut5.LLLLLLZZ(LLLLLLJ(), 8);
        C786410Ut5.LLIIL(LLLLLJIL(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    @Override // X.C0EVI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cH() {
        /*
            r5 = this;
            X.0tM6 r1 = X.C1662160tM6.LIZIZ
            java.lang.String r0 = "EditCaptionScene -> showExitView"
            X.C201955140j.LIZJ(r1, r0)
            android.app.Dialog r0 = r5.LLLZL
            if (r0 == 0) goto L65
            boolean r1 = r0.isShowing()
            r0 = 1
            if (r1 != r0) goto L65
        L12:
            r4 = 0
            if (r0 == 0) goto L21
            android.app.Dialog r0 = r5.LLLZL
            if (r0 == 0) goto L1f
            r0.dismiss()
            X.C785410UrT.LIZ(r0)
        L1f:
            r5.LLLZL = r4
        L21:
            r5.LLLLZLLLI()
            android.widget.LinearLayout r1 = r5.LLLLLZ()
            r0 = 8
            X.C786410Ut5.LJZL(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r0 = r5.LLLFZ
            if (r0 != 0) goto L32
            r0 = r4
        L32:
            r0.removeCallbacksAndMessages(r4)
            X.12Kf r3 = new X.12Kf
            android.widget.FrameLayout r2 = r5.LLLLLZL()
            android.widget.LinearLayout r1 = r5.LLLLLLLLLL()
            android.view.View r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto L44
            r0 = r4
        L44:
            r3.<init>(r1, r0, r2)
            android.view.View r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L4c
            r4 = r0
        L4c:
            r0 = 2131366497(0x7f0a1261, float:1.835289E38)
            android.view.View r2 = r4.findViewById(r0)
            Y.ACListenerS136S0200000_34 r1 = new Y.ACListenerS136S0200000_34
            r0 = 2
            r1.<init>(r3, r5, r0)
            X.C786410Ut5.I7(r1, r2)
            X.11Uv r0 = new X.11Uv
            r0.<init>()
            r3.LIZJ(r0)
            return
        L65:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.cH():void");
    }

    public final void pause() {
        MutableLiveData<C1452730nuJ> mutableLiveData = this.LLLFFI;
        if (mutableLiveData == null) {
            mutableLiveData = null;
        }
        mutableLiveData.setValue(C1452730nuJ.LIZJ());
        C786410Ut5.LJLLLLLL(0, LLLLLLL());
    }

    public final void LLLLIILL() {
        MutableLiveData<Integer> mutableLiveData;
        VideoPublishEditModel videoPublishEditModelLLLLLLZ = LLLLLLZ();
        String strLLLLJI = LLLLJI();
        String strLLLLLILLIL = LLLLLILLIL();
        C0LAB c0labLJJ = u4.LJJ(0, videoPublishEditModelLLLLLLZ, strLLLLJI);
        c0labLJJ.LJ("enter_way", strLLLLLILLIL);
        C20684815ws.LJIILLIIL("cancel_subtitle", c0labLJJ.LIZ);
        AbstractC2217051Bpv abstractC2217051BpvRw1 = LLLLZIL().rw1();
        if (abstractC2217051BpvRw1 != null) {
            abstractC2217051BpvRw1.LIZ();
        }
        SafeHandler safeHandler = this.LLLFZ;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.removeCallbacksAndMessages(null);
        AbstractC2217051Bpv abstractC2217051BpvRw12 = LLLLZIL().rw1();
        if (abstractC2217051BpvRw12 != null && (mutableLiveData = abstractC2217051BpvRw12.LJIL) != null) {
            mutableLiveData.removeObservers(this);
        }
        SafeHandler safeHandler2 = this.LLLI;
        if (safeHandler2 == null) {
            safeHandler2 = null;
        }
        safeHandler2.removeCallbacksAndMessages(null);
        LLLLZIL().Hs1(false);
        LLLLIIIILLL(C1416310mxZ.LJJLIIIJJIZ(LLLLLLZ()) ? this.LLLIILIL : C363730ENv.LIZLLL(LLLLLLZ()));
    }

    public final void LLLLIL() {
        MutableLiveData<Integer> mutableLiveData;
        C1428470nHB.LLILZ(LLLLLLZ());
        AbstractC2217051Bpv abstractC2217051BpvRw1 = LLLLZIL().rw1();
        if (abstractC2217051BpvRw1 != null) {
            abstractC2217051BpvRw1.LIZ();
        }
        SafeHandler safeHandler = this.LLLFZ;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.removeCallbacksAndMessages(null);
        AbstractC2217051Bpv abstractC2217051BpvRw12 = LLLLZIL().rw1();
        if (abstractC2217051BpvRw12 != null && (mutableLiveData = abstractC2217051BpvRw12.LJIL) != null) {
            mutableLiveData.removeObservers(this);
        }
        SafeHandler safeHandler2 = this.LLLI;
        if (safeHandler2 == null) {
            safeHandler2 = null;
        }
        safeHandler2.removeCallbacksAndMessages(null);
        LLLLZIL().Hs1(false);
        LLLLIIIILLL(null);
        LLLLLLZ().creativeModel.inlineCaptionModel = null;
        this.LLLZIIL.LIZ.storeString("last_selected_language", this.LLLLZI);
        LLLLZIL().hz();
        C1456140nzo.LIZIZ(LLLLL(), true, false, false, false, 12);
    }

    public final boolean LLLZIIL() {
        if (C371890Ei3.LIZJ() == null) {
            return true;
        }
        Context context = this.LLLLLZIL;
        if (context == null) {
            context = null;
        }
        if (C0XF1.LIZLLL(context)) {
            return ((u4.LJJIIJ(LLLLLLZ()) && LLLLLLZ().getVoiceVolume() > 0.0f) || LLLLLLZ().hadRecordWithVolume() || C366800EZq.LIZ(LLLLLLZ(), null)) ? false : true;
        }
        return true;
    }

    public final void LLLZZ() {
        if (C296180BjE.LIZ()) {
            Context context = this.LLJLLL;
            C1397580mTM c1397580mTM = new C1397580mTM(context != null ? context : null);
            c1397580mTM.LIZ(2131830683);
            C985403tE.LIZ(c1397580mTM, new AwS613S0100000_34(this, 39));
            this.LLLZL = new C1397510mTF(c1397580mTM).LJ();
            return;
        }
        Context context2 = this.LLJLLL;
        if (context2 == null) {
            context2 = null;
        }
        C21566919al c21566919al = new C21566919al(context2);
        c21566919al.LIZ(2131826904);
        c21566919al.LJII(R.string.e1d, new C1D10(this, 0), false);
        c21566919al.LJIIJ(2131826905, null, false);
        this.LLLZL = new C21566519ah(c21566919al).LJ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        AbstractC2217051Bpv abstractC2217051BpvRw1 = LLLLZIL().rw1();
        if (abstractC2217051BpvRw1 != null) {
            abstractC2217051BpvRw1.LIZ();
        }
        AnonymousClass1264 anonymousClass1264 = this.LLLLLZ;
        if (anonymousClass1264 != null) {
            anonymousClass1264.hide();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        MutableLiveData<Integer> mutableLiveData;
        super.onDestroyView();
        SafeHandler safeHandler = this.LLLFZ;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.removeCallbacksAndMessages(null);
        AbstractC2217051Bpv abstractC2217051BpvRw1 = LLLLZIL().rw1();
        if (abstractC2217051BpvRw1 != null && (mutableLiveData = abstractC2217051BpvRw1.LJIL) != null) {
            mutableLiveData.removeObservers(this);
        }
        SafeHandler safeHandler2 = this.LLLI;
        if (safeHandler2 == null) {
            safeHandler2 = null;
        }
        safeHandler2.removeCallbacksAndMessages(null);
        if (this.LLLIL != null) {
            Context context = this.LLJLLL;
            if (context == null) {
                context = null;
            }
            C790060Uyy.LJ(context);
            this.LLLIL = null;
        }
        C786410Ut5.LJLLLLLL(8, LLLLLLL());
        LLLLLLZZ().stopScroll();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C790060Uyy.LIZLLL(this.LLLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.onResume():void");
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC2216881Bpe
    public final void LJLLI(int i) {
        InterfaceC1452170ntP value;
        final InterfaceC1452170ntP interfaceC1452170ntP = this.LLJZ;
        if (interfaceC1452170ntP != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null) {
                c348100DkmLIZIZ.LIZIZ.getPlayerApi().setPlayRange(0L, ((long) this.LLJZIJLIL) * 1000);
                InterfaceC1452170ntP interfaceC1452170ntP2 = this.LLJZ;
                if (interfaceC1452170ntP2 != null) {
                    interfaceC1452170ntP2.setLoopPlay(true);
                }
                interfaceC1452170ntP.Yf(i, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC1464180oCm() { // from class: X.1Bpp
                    @Override // X.InterfaceC1464180oCm
                    public final void onSeekDone(int i2) {
                        EditCaptionScene editCaptionScene = this.LIZ;
                        SafeHandler safeHandler = editCaptionScene.LLLFZ;
                        if (safeHandler == null) {
                            safeHandler = null;
                        }
                        safeHandler.post(new ARunnableS103S0200000_34(editCaptionScene, interfaceC1452170ntP, 11));
                    }
                });
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Rect rect = this.LLLZLL;
        if (rect != null && ((rect.left > 0 || rect.top > 0 || rect.right > 0 || rect.bottom > 0) && (value = LLLLL().g().getValue()) != null)) {
            value.setDisplayPos(rect.left, rect.top, rect.right, rect.bottom);
        }
        if (LLLLLLZZ().getAdapter() != null) {
            C384570F5z c384570F5z = this.LLJLIL;
            C384570F5z c384570F5z2 = null;
            if (c384570F5z == null) {
                c384570F5z = null;
            }
            ArrayList<CaptionUtterance> arrayList = c384570F5z.LL;
            int size = arrayList.size() - 1;
            for (CaptionUtterance captionUtterance : arrayList) {
                if (((int) captionUtterance.LIZJ()) != 0 || ((int) captionUtterance.LIZ()) != this.LLJZIJLIL) {
                    long j = i;
                    if (captionUtterance.LIZJ() <= j && j <= captionUtterance.LIZ()) {
                        size = arrayList.indexOf(captionUtterance);
                    }
                }
            }
            if (size >= 0) {
                C384570F5z c384570F5z3 = this.LLJLIL;
                if (c384570F5z3 == null) {
                    c384570F5z3 = null;
                }
                if (!TextUtils.isEmpty(((CaptionUtterance) ListProtector.get(c384570F5z3.LL, size)).LJ()) || size == 0) {
                    HighLightLayoutManager highLightLayoutManager = this.LLJL;
                    if (highLightLayoutManager == null) {
                        highLightLayoutManager = null;
                    }
                    Context context = this.LLJLLL;
                    if (context == null) {
                        context = null;
                    }
                    highLightLayoutManager.scrollToPositionWithOffset(size, (int) C12ES.LIZJ(52.0f, context));
                    C384570F5z c384570F5z4 = this.LLJLIL;
                    if (c384570F5z4 != null) {
                        c384570F5z2 = c384570F5z4;
                    }
                    c384570F5z2.LLLI(size);
                }
            }
        }
        if (!this.LLLILZJ) {
            pause();
        }
        VideoPublishEditModel videoPublishEditModelLLLLLLZ = LLLLLLZ();
        if (videoPublishEditModelLLLLLLZ != null) {
            C20684815ws.LJIILLIIL("cancel_edit_subtitle", u4.LJJ(0, videoPublishEditModelLLLLLLZ, LLLLJI()).LIZ);
        }
    }

    public final void LLLLIIIILLL(List<CaptionUtterance> list) {
        LLLLZIL().eN1(list, false);
    }

    public final void LLLLZLLIL(boolean z) {
        float f;
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.B5(LLLLZ(), f);
        TuxIconView tuxIconView = this.LLLLLLLLL;
        TuxIconView tuxIconView2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.x5(tuxIconView, f);
        TuxIconView tuxIconView3 = this.LLLLLLLLLL;
        if (tuxIconView3 != null) {
            tuxIconView2 = tuxIconView3;
        }
        C786410Ut5.x5(tuxIconView2, f);
    }

    public final void LLLZ(List<CaptionUtterance> list) {
        int i = 0;
        C786410Ut5.LJZL(0, LLLLLZ());
        ConstraintLayout constraintLayout = this.LLLLLJLJLL;
        HighLightLayoutManager highLightLayoutManager = null;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(0, constraintLayout);
        C786410Ut5.w3(LLLLLLIL().getViewTreeObserver(), new ViewTreeObserver.OnDrawListener() { // from class: X.1A2s
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                int left = C444960Hcc.LIZIZ() ? this.LL.LLLLLLLLL().getLeft() - this.LL.LLLLLLIL().getRight() : this.LL.LLLLLLIL().getLeft() - this.LL.LLLLLLLLL().getRight();
                float f = left;
                C2173051A2t c2173051A2t = EditCaptionScene.LLLZLZ;
                c2173051A2t.getClass();
                float f2 = EditCaptionScene.LLZLI;
                if (f >= f2) {
                    TuxTextView tuxTextViewLLLLZ = this.LL.LLLLZ();
                    ViewGroup.LayoutParams layoutParams = this.LL.LLLLZ().getLayoutParams();
                    layoutParams.width = -2;
                    C786410Ut5.R6(tuxTextViewLLLLZ, layoutParams);
                    return;
                }
                TuxTextView tuxTextViewLLLLZ2 = this.LL.LLLLZ();
                int width = this.LL.LLLLZ().getWidth();
                float fAbs = Math.abs(left);
                c2173051A2t.getClass();
                tuxTextViewLLLLZ2.setWidth(width - ((int) (fAbs + f2)));
                this.LL.LLLLZ().setSingleLine();
                this.LL.LLLLZ().setEllipsize(TextUtils.TruncateAt.END);
                TuxTextView tuxTextViewLLLLZ3 = this.LL.LLLLZ();
                int right = this.LL.LLLLLLLLL().getRight();
                TuxIconView tuxIconView = this.LL.LLLLLLLLLL;
                if (tuxIconView == null) {
                    tuxIconView = null;
                }
                tuxTextViewLLLLZ3.setRight(right - tuxIconView.getWidth());
            }
        });
        if (!this.LLLLZLLIL && !this.LLLLZLLLI) {
            C786410Ut5.LJZL(8, LLLLLLLLL());
            TuxTextView tuxTextView = this.LLLLLLLZIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            C786410Ut5.LLLLLLZZ(LLLLLLIL(), 0);
            C786410Ut5.LLLLLLZZ(LLLLLL(), 8);
            C786410Ut5.LLLLLLZZ(LLLLLLJ(), 8);
        } else {
            if (C371890Ei3.LIZJ() != null) {
                C786410Ut5.LJZL(0, LLLLLLLLL());
            } else {
                C786410Ut5.LJZL(8, LLLLLLLLL());
            }
            if (this.LLLLZLLIL && !this.LLLLZLLLI) {
                TuxTextView tuxTextView2 = this.LLLLLLLZIL;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                C786410Ut5.LLLLLLZZ(LLLLLLIL(), 0);
                C786410Ut5.LLLLLLZZ(LLLLLL(), 8);
                C786410Ut5.LLLLLLZZ(LLLLLLJ(), 8);
            } else {
                TuxTextView tuxTextView3 = this.LLLLLLLZIL;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
                C786410Ut5.LLLLLLZZ(LLLLLLIL(), 0);
                C786410Ut5.LLLLLLZZ(LLLLLLJ(), 0);
                C786410Ut5.LLLLLLZZ(LLLLLL(), 0);
            }
        }
        FrameLayout frameLayoutLLLLLZL = LLLLLZL();
        View view = this.LLJJL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJJJZ(view, frameLayoutLLLLLZL);
        FrameLayout frameLayoutLLLLLZL2 = LLLLLZL();
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJJJZ(view2, frameLayoutLLLLLZL2);
        ArrayList arrayList = new ArrayList();
        Iterator<CaptionUtterance> it2 = list.iterator();
        while (it2.hasNext()) {
            Utterance utterance = it2.next().utterance;
            if (utterance != null) {
                arrayList.add(utterance);
            }
        }
        C786410Ut5.LJZL(0, LLLLLZ());
        C786410Ut5.W4(LLLLLZ(), 1.0f);
        TextView textView = this.LLLLIIIILLL;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LLIL(textView, 0);
        TextView textView2 = this.LLLLII;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.LLIL(textView2, 0);
        if (list.isEmpty()) {
            return;
        }
        this.LLLIIIL.clear();
        Iterator<CaptionUtterance> it3 = list.iterator();
        while (it3.hasNext()) {
            this.LLLIIIL.add(new CaptionUtterance(it3.next()));
        }
        ArrayList arrayListLIZ = C0EVG.LIZ(this.LLJZIJLIL, list);
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditCaptionScene -> initSubtitleLayout: captionWithGapList.size = ");
        sbLIZ.append(arrayListLIZ.size());
        C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        C384570F5z c384570F5z = this.LLJLIL;
        if (c384570F5z == null) {
            c384570F5z = null;
        }
        c384570F5z.setData(arrayListLIZ);
        int iLLLLJ = LLLLJ();
        if (iLLLLJ != -1) {
            i = iLLLLJ;
        }
        HighLightLayoutManager highLightLayoutManager2 = this.LLJL;
        if (highLightLayoutManager2 != null) {
            highLightLayoutManager = highLightLayoutManager2;
        }
        highLightLayoutManager.smoothScrollToPosition(LLLLLLZZ(), new C21673919s1(), i);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJZ;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.setLoopPlay(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [X.1Bpk] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.1Bpq] */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int duration;
        MutableLiveData<Integer> mutableLiveDataTk;
        MutableLiveData<Pair<String, Integer>> mutableLiveDataVn;
        MutableLiveData<Integer> mutableLiveDataGl;
        MutableLiveData<Integer> mutableLiveDataRv;
        MutableLiveData<C128A> mutableLiveDataGR1;
        LiveEvent<ArrayList<TextStickerData>> liveEventWD;
        final InterfaceC1446740nke interfaceC1446740nke;
        super.onActivityCreated(bundle);
        C201955140j.LIZJ(C1662160tM6.LIZIZ, "EditCaptionScene -> onActivityCreated");
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        this.LLJLLL = contextLIZIZ;
        C790060Uyy.LIZIZ(contextLIZIZ);
        LinearLayout linearLayout = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        InterfaceC524950KiL interfaceC524950KiLLIZ = (InterfaceC524950KiL) this.LLJILLL.LJIIL(null, InterfaceC524950KiL.class);
        if (interfaceC524950KiLLIZ == null && (interfaceC524950KiLLIZ = C0MWZ.LIZ(this)) == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        this.LLLILZLLLI = interfaceC524950KiLLIZ;
        InterfaceC1452170ntP value = LLLLL().g().getValue();
        this.LLJZ = value;
        boolean z = false;
        if (value != null) {
            duration = value.getDuration();
        } else {
            duration = 0;
        }
        this.LLJZIJLIL = duration;
        this.LLLFZ = new SafeHandler(this);
        this.LLLI = new SafeHandler(this);
        this.LLLLZLLIL = C1428520nHG.LJIIL(LLLLLLZ());
        this.LLLLZLLLI = u4.LJLJLJ(LLLLLLZ());
        this.LLLIL = new InterfaceC790070Uyz() { // from class: X.1Bpq
            @Override // X.InterfaceC790070Uyz
            public final void LIZ() {
                C201955140j.LIZJ(C1662160tM6.LIZIZ, "EditCaptionScene -> onNetDisConnect");
                this.LIZ.LLLLZLLIL(true);
            }

            @Override // X.InterfaceC790070Uyz
            public final void LIZIZ() {
                C201955140j.LIZJ(C1662160tM6.LIZIZ, "EditCaptionScene -> onNetConnected");
                EditCaptionScene editCaptionScene = this.LIZ;
                editCaptionScene.LLLLZLLIL(editCaptionScene.LLLZIIL());
            }
        };
        C1654320t9S.LIZIZ(this, AFwS283S0000000_35.get$arr$(85));
        C1664590tQ1.LIZLLL(this, "EditCaptionScene", false, AFwS281S0000000_34.get$arr$(27), 2);
        C1664600tQ2.LIZ(this, "EditCaptionScene", new AwS584S0100000_5(this, 107));
        this.LLLLLZ = (AnonymousClass1264) ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI.LJII(AnonymousClass1264.class, null);
        ViewGroup viewGroup = (ViewGroup) requireViewById(R.id.wmu);
        Context contextRequireSceneContext = requireSceneContext();
        C372580EjA c372580EjA = new C372580EjA(contextRequireSceneContext);
        c372580EjA.LJII = true;
        c372580EjA.LJ = C786410Ut5.Td(C786410Ut5.ne(contextRequireSceneContext), R.layout.ada, viewGroup, false);
        c372580EjA.LJFF = C786410Ut5.Td(C786410Ut5.ne(contextRequireSceneContext), R.layout.add, viewGroup, false);
        c372580EjA.LJI = C786410Ut5.Td(C786410Ut5.ne(contextRequireSceneContext), R.layout.ad8, viewGroup, false);
        List<C372880Eje> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C372880Eje(LLLZZIL, 2));
        c372580EjA.LIZJ = EnumC372730EjP.VARIABLE;
        listLJIILJJIL.add(new C372880Eje(C366700EZg.LIZ(425.0d), 2));
        int i = ((C2217011Bpr) this.LLLIIII.getValue()).LIZ.getInt("control_view_height", -1);
        Iterator<C372880Eje> it2 = listLJIILJJIL.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().LIZ == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        C1463700oC0.LIZJ(i2, 0, listLJIILJJIL);
        c372580EjA.LIZLLL = listLJIILJJIL;
        final C372830EjZ c372830EjZ = new C372830EjZ(c372580EjA);
        this.LLLF = c372830EjZ;
        viewGroup.addView(c372830EjZ, -1, -1);
        final InterfaceC1452170ntP interfaceC1452170ntP = this.LLJZ;
        if (interfaceC1452170ntP != null) {
            InterfaceC1455860nzM interfaceC1455860nzMLLLLL = LLLLL();
            if (interfaceC1455860nzMLLLLL instanceof InterfaceC1446740nke) {
                interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMLLLLL;
            } else {
                interfaceC1446740nke = null;
            }
            final VESize initSize = interfaceC1452170ntP.getInitSize();
            c372830EjZ.setPreviewHeightChangeListener(new InterfaceC372920Eji() { // from class: X.0Ejr
                @Override // X.InterfaceC372920Eji
                public final void LIZ(int i3) {
                    VESize vESize = initSize;
                    float f = vESize.height / vESize.width;
                    int navBarHeight = (c372830EjZ.getNavBarHeight() + C497820Jfg.LIZJ(c372830EjZ.getContext())) - c0.LIZ.n2();
                    VESize vESize2 = initSize;
                    int i4 = vESize2.width;
                    float f2 = i3;
                    float f3 = i4;
                    if (f2 / f3 > f) {
                        int i5 = vESize2.height;
                        int i6 = navBarHeight + ((i3 - i5) / 2);
                        int[] iArr = {0, i6, i4, i5};
                        interfaceC1452170ntP.setDisplayPos(0, i6, i4, i5);
                        InterfaceC1446740nke interfaceC1446740nke2 = interfaceC1446740nke;
                        if (interfaceC1446740nke2 != null) {
                            interfaceC1446740nke2.Rd0(1.0f, iArr[0], iArr[1]);
                            return;
                        }
                        return;
                    }
                    float f4 = (f2 * 1.0f) / vESize2.height;
                    int i7 = (int) (f3 * f4);
                    int i8 = (i4 - i7) / 2;
                    int[] iArr2 = {i8, navBarHeight, i7, i3};
                    interfaceC1452170ntP.setDisplayPos(i8, navBarHeight, i7, i3);
                    InterfaceC1446740nke interfaceC1446740nke3 = interfaceC1446740nke;
                    if (interfaceC1446740nke3 != null) {
                        interfaceC1446740nke3.Rd0(f4, iArr2[0], iArr2[1]);
                    }
                }
            });
        }
        c372830EjZ.setGrabberViewStateChangeListener((C2216971Bpn) this.LLJJJ.getValue());
        ViewGroup viewGroup2 = (ViewGroup) requireViewById(R.id.u18);
        this.LLL = viewGroup2;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        C786410Ut5.LJLZ(8, viewGroup2);
        ViewGroup viewGroup3 = this.LLL;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        this.LLLJL = (RelativeLayout) viewGroup3.findViewById(R.id.gxn);
        ViewGroup viewGroup4 = this.LLL;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.LLLL = (LinearLayout) viewGroup4.findViewById(R.id.ex9);
        ViewGroup viewGroup5 = this.LLL;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.LLLLLLZ = (FrameLayout) viewGroup5.findViewById(R.id.wm5);
        ViewGroup viewGroup6 = this.LLL;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        this.LLLLII = (TextView) viewGroup6.findViewById(R.id.zbp);
        ViewGroup viewGroup7 = this.LLL;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.LLLLIIIILLL = (TextView) viewGroup7.findViewById(R.id.tv_save);
        ViewGroup viewGroup8 = this.LLL;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        this.LLLLIIL = (LinearLayout) viewGroup8.findViewById(R.id.f762nla);
        ViewGroup viewGroup9 = this.LLL;
        if (viewGroup9 == null) {
            viewGroup9 = null;
        }
        this.LLLLIILL = (C1390410mHn) viewGroup9.findViewById(R.id.nne);
        ViewGroup viewGroup10 = this.LLL;
        if (viewGroup10 == null) {
            viewGroup10 = null;
        }
        this.LLLLIILLL = (LinearLayout) viewGroup10.findViewById(R.id.wmk);
        ViewGroup viewGroup11 = this.LLL;
        if (viewGroup11 == null) {
            viewGroup11 = null;
        }
        this.LLLLIL = (C425240Glu) viewGroup11.findViewById(R.id.t0q);
        ViewGroup viewGroup12 = this.LLL;
        if (viewGroup12 == null) {
            viewGroup12 = null;
        }
        this.LLLLILI = viewGroup12.findViewById(R.id.jml);
        ViewGroup viewGroup13 = this.LLL;
        if (viewGroup13 == null) {
            viewGroup13 = null;
        }
        this.LLLLLLIL = (TuxIconView) viewGroup13.findViewById(R.id.k4_);
        ViewGroup viewGroup14 = this.LLL;
        if (viewGroup14 == null) {
            viewGroup14 = null;
        }
        this.LLLLLL = (TuxIconView) viewGroup14.findViewById(R.id.k47);
        ViewGroup viewGroup15 = this.LLL;
        if (viewGroup15 == null) {
            viewGroup15 = null;
        }
        this.LLLLJ = (TextView) viewGroup15.findViewById(R.id.nn7);
        ViewGroup viewGroup16 = this.LLL;
        if (viewGroup16 == null) {
            viewGroup16 = null;
        }
        this.LLLLJI = (TextView) viewGroup16.findViewById(R.id.nmi);
        ViewGroup viewGroup17 = this.LLL;
        if (viewGroup17 == null) {
            viewGroup17 = null;
        }
        this.LLLLL = (TuxIconView) viewGroup17.findViewById(R.id.k48);
        this.LLLLLJIL = (TuxTextView) LLLLLLLLLL().findViewById(R.id.db0);
        ViewGroup viewGroup18 = this.LLL;
        if (viewGroup18 == null) {
            viewGroup18 = null;
        }
        this.LLLLLJLJLL = (ConstraintLayout) viewGroup18.findViewById(R.id.wml);
        ViewGroup viewGroup19 = this.LLL;
        if (viewGroup19 == null) {
            viewGroup19 = null;
        }
        this.LLLLLLJ = (LinearLayout) viewGroup19.findViewById(R.id.neo);
        ViewGroup viewGroup20 = this.LLL;
        if (viewGroup20 == null) {
            viewGroup20 = null;
        }
        this.LLLLLLL = (TuxTextView) viewGroup20.findViewById(R.id.zt5);
        ViewGroup viewGroup21 = this.LLL;
        if (viewGroup21 == null) {
            viewGroup21 = null;
        }
        this.LLLLLLLLL = (TuxIconView) viewGroup21.findViewById(R.id.z0n);
        ViewGroup viewGroup22 = this.LLL;
        if (viewGroup22 == null) {
            viewGroup22 = null;
        }
        this.LLLLLLLLLL = (TuxIconView) viewGroup22.findViewById(R.id.z0p);
        LLLLZ().setText(this.LLLLZI);
        ViewGroup viewGroup23 = this.LLL;
        if (viewGroup23 == null) {
            viewGroup23 = null;
        }
        this.LLLLLLLZIL = (TuxTextView) viewGroup23.findViewById(R.id.wm7);
        this.LLJJJJJIL = new AbstractViewOnClickListenerC1173120gdK() { // from class: X.1Bpk
            /* JADX WARN: Removed duplicated region for block: B:210:0x04a5  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x04ac  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r18) {
                /*
                    Method dump skipped, instruction units count: 1203
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2216941Bpk.LIZ(android.view.View):void");
            }
        };
        this.LLLLLIL = requireViewById(R.id.lr1);
        this.LLLLLILLIL = requireViewById(R.id.i8t);
        Context context = this.LLJLLL;
        if (context == null) {
            context = null;
        }
        this.LLJJL = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fis, LLLLLLLLLL(), false);
        Context context2 = this.LLJLLL;
        if (context2 == null) {
            context2 = null;
        }
        this.LLJJLIIIJLLLLLLLZ = C786410Ut5.Td(C786410Ut5.ne(context2), R.layout.fir, LLLLLLLLLL(), false);
        TextView textView = this.LLLLII;
        if (textView == null) {
            textView = null;
        }
        C2216941Bpk c2216941Bpk = this.LLJJJJJIL;
        if (c2216941Bpk == null) {
            c2216941Bpk = null;
        }
        C786410Ut5.T7(textView, c2216941Bpk);
        TextView textView2 = this.LLLLIIIILLL;
        if (textView2 == null) {
            textView2 = null;
        }
        C2216941Bpk c2216941Bpk2 = this.LLJJJJJIL;
        if (c2216941Bpk2 == null) {
            c2216941Bpk2 = null;
        }
        C786410Ut5.T7(textView2, c2216941Bpk2);
        TuxIconView tuxIconViewLLLLLLJ = LLLLLLJ();
        C2216941Bpk c2216941Bpk3 = this.LLJJJJJIL;
        if (c2216941Bpk3 == null) {
            c2216941Bpk3 = null;
        }
        C786410Ut5.a9(tuxIconViewLLLLLLJ, c2216941Bpk3);
        TuxIconView tuxIconViewLLLLLL = LLLLLL();
        C2216941Bpk c2216941Bpk4 = this.LLJJJJJIL;
        if (c2216941Bpk4 == null) {
            c2216941Bpk4 = null;
        }
        C786410Ut5.a9(tuxIconViewLLLLLL, c2216941Bpk4);
        TuxIconView tuxIconViewLLLLLLIL = LLLLLLIL();
        C2216941Bpk c2216941Bpk5 = this.LLJJJJJIL;
        if (c2216941Bpk5 == null) {
            c2216941Bpk5 = null;
        }
        C786410Ut5.a9(tuxIconViewLLLLLLIL, c2216941Bpk5);
        View viewLLLLLJLJLL = LLLLLJLJLL();
        C2216941Bpk c2216941Bpk6 = this.LLJJJJJIL;
        if (c2216941Bpk6 == null) {
            c2216941Bpk6 = null;
        }
        C786410Ut5.I7(c2216941Bpk6, viewLLLLLJLJLL);
        LinearLayout linearLayoutLLLLLLLLL = LLLLLLLLL();
        C2216941Bpk c2216941Bpk7 = this.LLJJJJJIL;
        if (c2216941Bpk7 == null) {
            c2216941Bpk7 = null;
        }
        C786410Ut5.R7(linearLayoutLLLLLLLLL, c2216941Bpk7);
        Context context3 = this.LLJLLL;
        if (context3 == null) {
            context3 = null;
        }
        this.LLJL = new HighLightLayoutManager(context3, false);
        C384570F5z c384570F5z = new C384570F5z(new ArrayList(), z, z, (C0EJ3) (objArr2 == true ? 1 : 0), (Boolean) (objArr == true ? 1 : 0), 62);
        this.LLJLIL = c384570F5z;
        c384570F5z.LLIZLLLIL = new C0F63() { // from class: X.1Bpt
            @Override // X.C0F63
            public final void LIZIZ(int i3, int i4, boolean z2) {
                this.LIZ.LLLLILI(i3, i4, "click_subtitle");
            }
        };
        TuxTextView tuxTextView = this.LLLLLJIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setBackgroundResource(R.drawable.alj);
        View view = this.LLJJL;
        if (view == null) {
            view = null;
        }
        view.findViewById(R.id.cuf).setBackgroundResource(R.drawable.alj);
        View view2 = this.LLJJL;
        if (view2 == null) {
            view2 = null;
        }
        view2.findViewById(R.id.wm9).setBackgroundResource(R.drawable.alj);
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 == null) {
            view3 = null;
        }
        view3.findViewById(R.id.dat).setBackgroundResource(R.drawable.alj);
        C425240Glu c425240GluLLLLLLZZ = LLLLLLZZ();
        HighLightLayoutManager highLightLayoutManager = this.LLJL;
        if (highLightLayoutManager == null) {
            highLightLayoutManager = null;
        }
        c425240GluLLLLLLZZ.setLayoutManager(highLightLayoutManager);
        C384570F5z c384570F5z2 = this.LLJLIL;
        if (c384570F5z2 == null) {
            c384570F5z2 = null;
        }
        c425240GluLLLLLLZZ.setAdapter(c384570F5z2);
        if (((C2217011Bpr) this.LLLIIII.getValue()).LIZ.getInt("control_view_height", -1) == LLZ) {
            c425240GluLLLLLLZZ.addItemDecoration((C0DXR) this.LLJJIJIL.getValue());
        } else {
            c425240GluLLLLLLZZ.addItemDecoration((C0DXR) this.LLJJIJIIJIL.getValue());
        }
        ((AbstractC21674919sB) c425240GluLLLLLLZZ.getItemAnimator()).LLIZ = false;
        LLLLLLZZ().addOnScrollListener(new AbstractC1585810rMx() { // from class: X.1Bpm
            public boolean LL;
            public boolean LLILLJJLI;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i3) {
                C384570F5z c384570F5z3 = null;
                SafeHandler safeHandler = null;
                if (i3 != 0) {
                    if (i3 == 1) {
                        EditCaptionScene editCaptionScene = this.LLILLL;
                        if (editCaptionScene.LLJJJJLIIL) {
                            this.LL = true;
                        }
                        editCaptionScene.pause();
                        this.LLILLJJLI = true;
                        EditCaptionScene editCaptionScene2 = this.LLILLL;
                        SafeHandler safeHandler2 = editCaptionScene2.LLLFZ;
                        if (safeHandler2 != null) {
                            safeHandler = safeHandler2;
                        }
                        safeHandler.post((C0EVF) editCaptionScene2.LLJJJJ.getValue());
                        return;
                    }
                    return;
                }
                if (!this.LLILLJJLI) {
                    return;
                }
                this.LLILLJJLI = false;
                EditCaptionScene editCaptionScene3 = this.LLILLL;
                SafeHandler safeHandler3 = editCaptionScene3.LLLFZ;
                if (safeHandler3 == null) {
                    safeHandler3 = null;
                }
                safeHandler3.removeCallbacksAndMessages(editCaptionScene3.LLJJJJ.getValue());
                C384570F5z c384570F5z4 = this.LLILLL.LLJLIL;
                if (c384570F5z4 == null) {
                    c384570F5z4 = null;
                }
                int iLLLFZ = c384570F5z4.LLLFZ();
                if (iLLLFZ != -1) {
                    EditCaptionScene editCaptionScene4 = this.LLILLL;
                    EditCaptionScene.HighLightLayoutManager highLightLayoutManager2 = editCaptionScene4.LLJL;
                    if (highLightLayoutManager2 == null) {
                        highLightLayoutManager2 = null;
                    }
                    highLightLayoutManager2.smoothScrollToPosition(editCaptionScene4.LLLLLLZZ(), new C21673919s1(), iLLLFZ);
                    EditCaptionScene editCaptionScene5 = this.LLILLL;
                    MutableLiveData<C1452730nuJ> mutableLiveData = editCaptionScene5.LLLFFI;
                    if (mutableLiveData == null) {
                        mutableLiveData = null;
                    }
                    C2217021Bps c2217021Bps = editCaptionScene5.LLLFF;
                    if (c2217021Bps == null) {
                        c2217021Bps = null;
                    }
                    C384570F5z c384570F5z5 = editCaptionScene5.LLJLIL;
                    if (c384570F5z5 != null) {
                        c384570F5z3 = c384570F5z5;
                    }
                    long jLIZJ = ((CaptionUtterance) ListProtector.get(c384570F5z3.LL, iLLLFZ)).LIZJ() + ((long) 30);
                    c2217021Bps.getClass();
                    mutableLiveData.setValue(C1452730nuJ.LIZLLL(jLIZJ));
                }
                if (!this.LL) {
                    return;
                }
                this.LL = false;
                this.LLILLL.LLLZLL();
            }
        });
        Context context4 = this.LLJLLL;
        if (context4 == null) {
            context4 = null;
        }
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context4);
        ViewGroup viewGroup24 = this.LLL;
        if (viewGroup24 == null) {
            viewGroup24 = null;
        }
        LinearLayout linearLayout2 = (LinearLayout) C786410Ut5.Td(layoutInflaterNe, R.layout.fip, viewGroup24, false);
        this.LLLLLLZZ = linearLayout2;
        ViewGroup viewGroup25 = this.LLL;
        if (viewGroup25 == null) {
            viewGroup25 = null;
        }
        C2216891Bpf c2216891Bpf = new C2216891Bpf(linearLayout2, viewGroup25, this, LLLLLLZ(), LLLLL());
        this.LLJJIII = c2216891Bpf;
        c2216891Bpf.LJ = this;
        this.LLLFF = new C2217021Bps(this);
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) this.LLJILLL.LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS608S0100000_29(this, 233));
        } else {
            ((InterfaceC1461350o8D) this.LLJLLIL.getValue(this, LLLZZ[3])).cY().observe(this, new AObserverS231S0100000_29(this, 89));
        }
        MutableLiveData<C1452730nuJ> mutableLiveDataVW1 = LLLLL().vW1();
        this.LLLFFI = mutableLiveDataVW1;
        if (mutableLiveDataVW1 == null) {
            mutableLiveDataVW1 = null;
        }
        mutableLiveDataVW1.observe(this, new AObserverS236S0100000_34(this, 20));
        LLLLZIL().EI2().LIZ(this, new AObjectS250S0100000_33(this, 5));
        LLLLZIL().vh1().observe(this, new AObserverS209S0100000_5(this, 4));
        AnonymousClass1264 anonymousClass1264 = this.LLLLLZ;
        if (anonymousClass1264 != null && (liveEventWD = anonymousClass1264.WD()) != null) {
            liveEventWD.LIZ(this, new AObjectS247S0100000_29(this, 57));
        }
        AnonymousClass1264 anonymousClass12642 = this.LLLLLZ;
        if (anonymousClass12642 != null && (mutableLiveDataGR1 = anonymousClass12642.GR1()) != null) {
            mutableLiveDataGR1.observe(this, new AObserverS231S0100000_29(this, 83));
        }
        AnonymousClass1264 anonymousClass12643 = this.LLLLLZ;
        if (anonymousClass12643 != null && (mutableLiveDataRv = anonymousClass12643.Rv()) != null) {
            mutableLiveDataRv.observe(this, new AObserverS231S0100000_29(this, 84));
        }
        AnonymousClass1264 anonymousClass12644 = this.LLLLLZ;
        if (anonymousClass12644 != null && (mutableLiveDataGl = anonymousClass12644.Gl()) != null) {
            mutableLiveDataGl.observe(this, new AObserverS231S0100000_29(this, 85));
        }
        AnonymousClass1264 anonymousClass12645 = this.LLLLLZ;
        if (anonymousClass12645 != null && (mutableLiveDataVn = anonymousClass12645.Vn()) != null) {
            mutableLiveDataVn.observe(this, new AObserverS231S0100000_29(this, 86));
        }
        AnonymousClass1264 anonymousClass12646 = this.LLLLLZ;
        if (anonymousClass12646 != null && (mutableLiveDataTk = anonymousClass12646.tk()) != null) {
            mutableLiveDataTk.observe(this, new AObserverS231S0100000_29(this, 87));
        }
        TextView textView3 = this.LLLLII;
        if (textView3 != null) {
            q0.LJIJ(textView3, new C20094213jo() { // from class: X.0l0E
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view4, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view4, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
        TextView textView4 = this.LLLLIIIILLL;
        if (textView4 != null) {
            q0.LJIJ(textView4, new C20094213jo() { // from class: X.0l0E
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view4, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view4, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
        if (this.LLLLLILLIL != null) {
            LLLLLJLJLL().setContentDescription(getString(2131823202));
            if (!this.LLJJJJLIIL) {
                q0.LJJIFFI(LLLLLJLJLL(), (String) this.LLLZIL.getValue());
            }
            final String string = getString(2131823177);
            final String string2 = getString(2131823179);
            q0.LJIJ(LLLLLJLJLL(), new C20094213jo() { // from class: X.0l0F
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view4, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    String str;
                    super.onInitializeAccessibilityNodeInfo(view4, accessibilityNodeInfoCompat);
                    if (this.LIZ.LLJJJJLIIL) {
                        str = string;
                    } else {
                        str = string2;
                    }
                    accessibilityNodeInfoCompat.addAction(new C20092413jW(16, str));
                }
            });
        }
        if (this.LLLLL != null) {
            LLLLLLIL().setContentDescription(getString(2131823174));
            q0.LJIJ(LLLLLLIL(), new C20094213jo() { // from class: X.0l0E
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view4, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view4, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
        if (this.LLLLLLIL != null) {
            LLLLLLJ().setContentDescription(getString(2131823172));
            q0.LJIJ(LLLLLLJ(), new C20094213jo() { // from class: X.0l0E
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view4, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view4, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
        if (this.LLLLLL != null) {
            LLLLLL().setContentDescription(getString(2131823162));
            q0.LJIJ(LLLLLL(), new C20094213jo() { // from class: X.0l0E
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view4, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view4, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
        TuxTextView tuxTextView2 = this.LLLLLJIL;
        if (tuxTextView2 != null) {
            q0.LJIJ(tuxTextView2, new C20094213jo() { // from class: X.0l0E
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view4, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view4, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
        View view4 = this.LLJJL;
        if (view4 != null) {
            View viewFindViewById = view4.findViewById(R.id.cuf);
            C1341080l0E c1341080l0E = new C20094213jo() { // from class: X.0l0E
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view42, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view42, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            };
            q0.LJIJ(viewFindViewById, c1341080l0E);
            View view5 = this.LLJJL;
            if (view5 == null) {
                view5 = null;
            }
            q0.LJIJ(view5.findViewById(R.id.wm9), c1341080l0E);
        }
        View view6 = this.LLJJLIIIJLLLLLLLZ;
        if (view6 != null) {
            q0.LJIJ(view6.findViewById(R.id.dat), new C20094213jo() { // from class: X.0l0E
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view42, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view42, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
        LinearLayout linearLayout3 = this.LLLLLLZZ;
        if (linearLayout3 != null) {
            View viewFindViewById2 = linearLayout3.findViewById(R.id.dat);
            C1341080l0E c1341080l0E2 = new C20094213jo() { // from class: X.0l0E
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view42, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view42, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            };
            q0.LJIJ(viewFindViewById2, c1341080l0E2);
            LinearLayout linearLayout4 = this.LLLLLLZZ;
            if (linearLayout4 == null) {
                linearLayout4 = null;
            }
            q0.LJIJ(linearLayout4.findViewById(R.id.wpw), c1341080l0E2);
            LinearLayout linearLayout5 = this.LLLLLLZZ;
            if (linearLayout5 != null) {
                linearLayout = linearLayout5;
            }
            q0.LJIJI(linearLayout.findViewById(R.id.gox), true);
        }
    }

    @Override // X.C0EVI
    public final void t4(boolean z) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        LLZ();
        SafeHandler safeHandler = null;
        if (z) {
            Runnable runnable = new Runnable() { // from class: X.0MkS
                public int LL;
                public final String[] LLILLJJLI;

                public final void LIZ() {
                    TextView textView = this.LLILLL.LLLLJI;
                    if (textView == null) {
                        textView = null;
                    }
                    String[] strArr = this.LLILLJJLI;
                    int i = this.LL;
                    this.LL = i + 1;
                    textView.setText(strArr[i]);
                    this.LL %= this.LLILLJJLI.length;
                    SafeHandler safeHandler2 = this.LLILLL.LLLI;
                    (safeHandler2 != null ? safeHandler2 : null).postDelayed(this, Mp4ScreenVideoLoadTimeout.CONTROL);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EditCaptionScene$TipsRunnable@4df0.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EditCaptionScene$TipsRunnable@4df0.run");
                }

                {
                    String[] strArr;
                    if (this.LLILLL.LLLLZLLIL) {
                        strArr = new String[]{this.LLILLL.getString(2131826908), this.LLILLL.getString(2131826909)};
                    } else {
                        strArr = new String[]{this.LLILLL.getString(2131826907, ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getCurrentI18nItem(this.LLILLL.getApplicationContext()).LIZJ()), this.LLILLL.getString(2131826908), this.LLILLL.getString(2131826909)};
                    }
                    this.LLILLJJLI = strArr;
                }
            };
            SafeHandler safeHandler2 = this.LLLI;
            if (safeHandler2 != null) {
                safeHandler = safeHandler2;
            }
            safeHandler.post(runnable);
            AbstractC2217051Bpv abstractC2217051BpvRw1 = LLLLZIL().rw1();
            if (abstractC2217051BpvRw1 != null && (mutableLiveData2 = abstractC2217051BpvRw1.LJIL) != null) {
                mutableLiveData2.observe(this, new AObserverS212S0100000_8(this, 40));
            }
            C786410Ut5.LJZL(0, LLLLLLLLLL());
            C786410Ut5.LJZL(8, LLLLLZ());
            C786410Ut5.LLLZZIL(LLLLLLLZIL(), 0);
            LLLLLLLZIL().LIZJ();
            C786410Ut5.I7(new ACListenerS168S0100000_34(this, 17), LLLLLLLLLL().findViewById(R.id.db0));
            return;
        }
        AbstractC2217051Bpv abstractC2217051BpvRw12 = LLLLZIL().rw1();
        if (abstractC2217051BpvRw12 != null && (mutableLiveData = abstractC2217051BpvRw12.LJIL) != null) {
            mutableLiveData.removeObservers(this);
        }
        SafeHandler safeHandler3 = this.LLLI;
        if (safeHandler3 == null) {
            safeHandler3 = null;
        }
        safeHandler3.removeCallbacksAndMessages(null);
        C786410Ut5.LLLZZIL(LLLLLLLZIL(), 8);
        LLLLLLLZIL().LIZLLL();
        C786410Ut5.LJZL(8, LLLLLLLLLL());
        C786410Ut5.LJZL(0, LLLLLZ());
        C786410Ut5.W4(LLLLLZ(), 1.0f);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class HighLightLayoutManager extends LinearLayoutManager {
        public final Context LL;
        public final boolean LLILLJJLI;
        public float LLILLL;
        public final DisplayMetrics LLILZ;

        public HighLightLayoutManager(Context context, boolean z) {
            DisplayMetrics displayMetrics;
            Resources resources;
            super(context, 1, false);
            this.LL = context;
            this.LLILLJJLI = z;
            this.LLILLL = 0.004f;
            if (context != null && (resources = context.getResources()) != null) {
                displayMetrics = resources.getDisplayMetrics();
            } else {
                displayMetrics = null;
            }
            this.LLILZ = displayMetrics;
        }

        public final void LJIIL(C425240Glu c425240Glu, int i, long j) {
            int childAdapterPosition;
            DisplayMetrics displayMetrics = this.LLILZ;
            if (displayMetrics != null) {
                int i2 = displayMetrics.densityDpi;
                if (c425240Glu == null || c425240Glu.getChildCount() <= 0 || (childAdapterPosition = c425240Glu.getChildAdapterPosition(c425240Glu.getChildAt(0))) < 0) {
                    return;
                }
                float fAbs = (j / (Math.abs(childAdapterPosition - i) * (c425240Glu.getHeight() / c425240Glu.getChildCount()))) * i2;
                this.LLILLL = fAbs;
                C0F71 c0f71 = new C0F71(this, c425240Glu.getContext());
                c0f71.LJIILL = fAbs;
                c0f71.LIZ = i;
                startSmoothScroll(c0f71);
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
            Context context;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            C0F71 c0f71 = new C0F71(this, context);
            c0f71.LJIILL = this.LLILLL;
            c0f71.LIZ = i;
            startSmoothScroll(c0f71);
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.1Bpo] */
    public EditCaptionScene(C1DRG c1drg, C364440EQo c364440EQo) {
        this.LLJILLL = c1drg;
        this.LLJJ = c364440EQo;
        C306660C0i.LIZ();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(126));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(125));
        this.LLJJJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 76));
        this.LLJJJIL = 0.004f;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 77));
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        C1664770tQJ.LIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJLL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1461350o8D.class, null);
        this.LLLII = C452501pT.LIZIZ(new AwS578S0100000_34(this, 78));
        this.LLLIIII = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(124));
        this.LLLIIIL = new ArrayList<>();
        this.LLLIZZ = new InterfaceC362610EJn() { // from class: X.1Bpo
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                EditCaptionScene editCaptionScene = this.LL;
                C2216891Bpf c2216891Bpf = editCaptionScene.LLJJIII;
                if (c2216891Bpf != null && c2216891Bpf.LJIIL) {
                    TextView textView = c2216891Bpf.LJIIIIZZ;
                    if (textView != null) {
                        textView.performClick();
                    }
                } else {
                    AnonymousClass1264 anonymousClass1264 = editCaptionScene.LLLLLZ;
                    if (anonymousClass1264 != null && anonymousClass1264.LJJII()) {
                        return false;
                    }
                    ViewGroup viewGroup = this.LL.LLL;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    if (viewGroup.isShown()) {
                        EditCaptionScene editCaptionScene2 = this.LL;
                        if (editCaptionScene2.LLLLLLLLLL().getVisibility() == 0) {
                            editCaptionScene2.LLLZZ();
                        } else {
                            editCaptionScene2.LLLZLZ();
                        }
                    }
                }
                return true;
            }
        };
        this.LLLJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1456910o13.class, null);
        new C1DRG(new C1DRF[0]);
        this.LLLLZ = -1;
        this.LLLLZI = "";
        this.LLLZ = true;
        this.LLLZIIL = new C384340F5c();
        this.LLLZIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 79));
    }

    public static void LLLZZIL(final EditCaptionScene editCaptionScene, boolean z) {
        int i;
        List<CaptionUtterance> list;
        NLEModel nLEModelLIZ;
        NLEModel nLEModelLIZ2;
        boolean z2;
        String str;
        FrameLayout grabberView;
        AFwS225S0000000_34 aFwS225S0000000_34 = AFwS225S0000000_34.get$arr$(129);
        editCaptionScene.LLLZI = false;
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        C201955140j.LIZJ(c1662160tM6, "EditCaptionScene -> showCaptionPreviewView");
        if (editCaptionScene.LLLLLJIL().getVisibility() == 4) {
            C786410Ut5.LLIIL(editCaptionScene.LLLLLJIL(), 0);
        }
        boolean z3 = editCaptionScene.LLLLZLLIL;
        Rect rectLLJLLIL = null;
        if (!z3) {
            ConstraintLayout constraintLayout = editCaptionScene.LLLLLJLJLL;
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            C786410Ut5.LL(8, constraintLayout);
        } else if (z3) {
            ConstraintLayout constraintLayout2 = editCaptionScene.LLLLLJLJLL;
            if (constraintLayout2 == null) {
                constraintLayout2 = null;
            }
            C786410Ut5.LL(0, constraintLayout2);
            C786410Ut5.LJZL(0, editCaptionScene.LLLLLLLLL());
        } else {
            throw new C1954807lC();
        }
        if (!z) {
            TextView textView = editCaptionScene.LLLLIIIILLL;
            if (textView == null) {
                textView = null;
            }
            C786410Ut5.LLIL(textView, 4);
            TextView textView2 = editCaptionScene.LLLLII;
            if (textView2 == null) {
                textView2 = null;
            }
            C786410Ut5.LLIL(textView2, 4);
            C786410Ut5.LJLLLLLL(8, editCaptionScene.LLLLLLL());
            AbstractC2217051Bpv abstractC2217051BpvRw1 = editCaptionScene.LLLLZIL().rw1();
            if (abstractC2217051BpvRw1 != null) {
                abstractC2217051BpvRw1.LJIIJ = null;
            }
        } else {
            AbstractC2217051Bpv abstractC2217051BpvRw12 = editCaptionScene.LLLLZIL().rw1();
            if (abstractC2217051BpvRw12 != null) {
                abstractC2217051BpvRw12.LJIIJ = editCaptionScene;
            }
        }
        C372830EjZ c372830EjZ = editCaptionScene.LLLF;
        if (c372830EjZ != null && (grabberView = c372830EjZ.getGrabberView()) != null) {
            C786410Ut5.LJZ(8, grabberView);
        }
        LinearLayout linearLayout = editCaptionScene.LLLL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        int i2 = ((C2217011Bpr) editCaptionScene.LLLIIII.getValue()).LIZ.getInt("control_view_height", -1);
        int i3 = LLZ;
        if (i2 == i3) {
            i = i3;
        } else {
            i = LLLZZIL;
        }
        ViewGroup viewGroup = editCaptionScene.LLL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C1462750oAT.LIZJ(linearLayout, z, i, viewGroup, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, new C092O() { // from class: X.1A5y
            @Override // X.C092O
            public final void accept(Object obj) {
                FrameLayout grabberView2;
                C372830EjZ c372830EjZ2 = this.LIZ.LLLF;
                if (c372830EjZ2 != null && (grabberView2 = c372830EjZ2.getGrabberView()) != null) {
                    C786410Ut5.LJZ(0, grabberView2);
                }
            }
        });
        if (z) {
            editCaptionScene.LLLZ = false;
            SystemClock.elapsedRealtime();
            LinearLayout linearLayout2 = editCaptionScene.LLLL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C786410Ut5.LJZL(0, linearLayout2);
            FrameLayout frameLayoutLLLLLZL = editCaptionScene.LLLLLZL();
            View view = editCaptionScene.LLJJL;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJJJZ(view, frameLayoutLLLLLZL);
            FrameLayout frameLayoutLLLLLZL2 = editCaptionScene.LLLLLZL();
            View view2 = editCaptionScene.LLJJLIIIJLLLLLLLZ;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJJJZ(view2, frameLayoutLLLLLZL2);
            editCaptionScene.LLJJJIL = 0.004f;
            HighLightLayoutManager highLightLayoutManager = editCaptionScene.LLJL;
            if (highLightLayoutManager == null) {
                highLightLayoutManager = null;
            }
            highLightLayoutManager.LLILLL = 0.004f;
            editCaptionScene.pause();
            MutableLiveData<C1452730nuJ> mutableLiveData = editCaptionScene.LLLFFI;
            if (mutableLiveData == null) {
                mutableLiveData = null;
            }
            C2217021Bps c2217021Bps = editCaptionScene.LLLFF;
            if (c2217021Bps == null) {
                c2217021Bps = null;
            }
            c2217021Bps.getClass();
            mutableLiveData.setValue(new C1452730nuJ(4, 0L, null));
            InterfaceC524950KiL interfaceC524950KiL = editCaptionScene.LLLILZLLLI;
            if (interfaceC524950KiL == null) {
                interfaceC524950KiL = null;
            }
            interfaceC524950KiL.kF(editCaptionScene.LLLIZZ);
            InterfaceC1455860nzM interfaceC1455860nzMLLLLL = editCaptionScene.LLLLL();
            int iLIZIZ = C19733712It.LIZIZ(true, false, false, false);
            Context context = editCaptionScene.LLJLLL;
            if (context == null) {
                context = null;
            }
            int iLIZJ = (int) C12ES.LIZJ(52.0f, context);
            Context context2 = editCaptionScene.LLJLLL;
            if (context2 == null) {
                context2 = null;
            }
            int statusBarHeight = iLIZJ + ScreenUtils.getStatusBarHeight(context2);
            if (((C2217011Bpr) editCaptionScene.LLLIIII.getValue()).LIZ.getInt("control_view_height", -1) != i3) {
                i3 = LLLZZIL;
            }
            int iLLLLLIL = editCaptionScene.LLLLLIL();
            c0.LIZ.n2();
            C1453160nv0 c1453160nv0LIZIZ = C1453170nv1.LIZIZ(iLIZIZ, statusBarHeight, i3, iLLLLLIL, false, false, 1984);
            c1453160nv0LIZIZ.LJIIL = new AwS566S0100000_22(aFwS225S0000000_34, (Function0<Boolean>) 335);
            interfaceC1455860nzMLLLLL.aM0(c1453160nv0LIZIZ);
            editCaptionScene.LLLIILIL = C363730ENv.LIZLLL(editCaptionScene.LLLLLLZ());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditCaptionScene -> doOnVideoDownloadedWhenShowing -> needRecognize() = ");
            sbLIZ.append(editCaptionScene.LLLZIL());
            C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
            if (editCaptionScene.LLLZIL()) {
                C201955140j.LIZJ(c1662160tM6, "EditCaptionScene -> doOnVideoDownloadedWhenShowing -> Recognize");
                editCaptionScene.t4(true);
                editCaptionScene.LLLIIIL.clear();
                editCaptionScene.LLLLIIIILLL(null);
                editCaptionScene.LLLLIIIILLL(null);
                editCaptionScene.pause();
                AbstractC2217051Bpv abstractC2217051BpvRw13 = editCaptionScene.LLLLZIL().rw1();
                if (abstractC2217051BpvRw13 != null) {
                    if (C1428520nHG.LJIIL(editCaptionScene.LLLLLLZ())) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("EditCaptionScene -> enableChooseLanguage = true, currentLanguage code = ");
                        sbLIZ2.append(editCaptionScene.LLLLJI());
                        C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ2));
                        abstractC2217051BpvRw13.LJIIIIZZ();
                        String strLLLLJI = editCaptionScene.LLLLJI();
                        InterfaceC1452170ntP interfaceC1452170ntP = editCaptionScene.LLJZ;
                        if (interfaceC1452170ntP != null) {
                            nLEModelLIZ2 = C352130DrH.LIZ(interfaceC1452170ntP);
                        } else {
                            nLEModelLIZ2 = null;
                        }
                        if (C294870Bh7.LIZ(editCaptionScene.LLLLLLZ()) && C0EJ1.LJFF(strLLLLJI)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (C289240BVi.LIZ(abstractC2217051BpvRw13.LIZ)) {
                            str = "big_caption";
                        } else {
                            str = null;
                        }
                        abstractC2217051BpvRw13.LJIIL(strLLLLJI, nLEModelLIZ2, Boolean.FALSE, z2, false, str);
                    } else {
                        C201955140j.LIZJ(c1662160tM6, "EditCaptionScene -> enableChooseLanguage = false");
                        InterfaceC1452170ntP interfaceC1452170ntP2 = editCaptionScene.LLJZ;
                        if (interfaceC1452170ntP2 != null) {
                            nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP2);
                        } else {
                            nLEModelLIZ = null;
                        }
                        abstractC2217051BpvRw13.LJIIJJI(nLEModelLIZ);
                    }
                }
            } else {
                C201955140j.LIZJ(c1662160tM6, "EditCaptionScene -> doOnVideoDownloadedWhenShowing -> show captions");
                editCaptionScene.t4(false);
                ArrayList<CaptionUtterance> arrayList = editCaptionScene.LLLIILIL;
                if (arrayList != null && !arrayList.isEmpty()) {
                    editCaptionScene.LLLZ(editCaptionScene.LLLIILIL);
                } else if (editCaptionScene.LLLLZLLIL) {
                    CaptionCachesModel captionCachesModel = editCaptionScene.LLJJ.LIZ.get(editCaptionScene.LLLLZI);
                    if (captionCachesModel == null || (list = captionCachesModel.captionsList) == null) {
                        list = C13BV.INSTANCE;
                    }
                    editCaptionScene.LLLZ(list);
                } else {
                    List<CaptionUtterance> list2 = editCaptionScene.LLLIIL;
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    editCaptionScene.LLLZ(list2);
                }
                editCaptionScene.LLLLIIIILLL(editCaptionScene.LLLIIIL);
                editCaptionScene.LLLZLL();
            }
        } else {
            editCaptionScene.LLLZ = true;
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) ((C0ETY) editCaptionScene.LLJILLL.LJII(C0ETY.class, null)).MY1(InterfaceC1461350o8D.class);
                if (interfaceC1461350o8D != null) {
                    MutableLiveData<Boolean> mutableLiveDataRb = interfaceC1461350o8D.rb();
                    Boolean bool = Boolean.FALSE;
                    mutableLiveDataRb.setValue(bool);
                    interfaceC1461350o8D.QE2().setValue(bool);
                }
            } else {
                C1664750tQH c1664750tQH = editCaptionScene.LLJLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLZZ;
                MutableLiveData<Boolean> mutableLiveDataRb2 = ((InterfaceC1461350o8D) c1664750tQH.getValue(editCaptionScene, interfaceC2217461BqaArr[3])).rb();
                Boolean bool2 = Boolean.FALSE;
                mutableLiveDataRb2.setValue(bool2);
                ((InterfaceC1461350o8D) editCaptionScene.LLJLLIL.getValue(editCaptionScene, interfaceC2217461BqaArr[3])).QE2().setValue(bool2);
            }
            InterfaceC524950KiL interfaceC524950KiL2 = editCaptionScene.LLLILZLLLI;
            if (interfaceC524950KiL2 == null) {
                interfaceC524950KiL2 = null;
            }
            interfaceC524950KiL2.b8(editCaptionScene.LLLIZZ);
            InterfaceC1455860nzM interfaceC1455860nzMLLLLL2 = editCaptionScene.LLLLL();
            Context context3 = editCaptionScene.LLJLLL;
            if (context3 == null) {
                context3 = null;
            }
            int iLIZ = C960203pA.LIZ(R.attr.e1, context3);
            Context context4 = editCaptionScene.LLJLLL;
            if (context4 == null) {
                context4 = null;
            }
            int iLIZJ2 = (int) C12ES.LIZJ(52.0f, context4);
            Context context5 = editCaptionScene.LLJLLL;
            if (context5 == null) {
                context5 = null;
            }
            int statusBarHeight2 = iLIZJ2 + ScreenUtils.getStatusBarHeight(context5);
            if (((C2217011Bpr) editCaptionScene.LLLIIII.getValue()).LIZ.getInt("control_view_height", -1) != i3) {
                i3 = LLLZZIL;
            }
            int iLLLLLIL2 = editCaptionScene.LLLLLIL();
            c0.LIZ.n2();
            C1453160nv0 c1453160nv0LIZ = C1453170nv1.LIZ(iLIZ, statusBarHeight2, i3, iLLLLLIL2);
            c1453160nv0LIZ.LJIIL = new AwS578S0100000_34(aFwS225S0000000_34, (Function0<Unit>) 80);
            interfaceC1455860nzMLLLLL2.aM0(c1453160nv0LIZ);
            C786410Ut5.LJLLLLLL(8, editCaptionScene.LLLLLLL());
        }
        InterfaceC1452170ntP value = editCaptionScene.LLLLL().g().getValue();
        if (value != null) {
            rectLLJLLIL = value.LLJLLIL();
        }
        editCaptionScene.LLLZLL = rectLLJLLIL;
    }

    public final void LLZIL(ArrayList<CaptionUtterance> arrayList, CaptionQueryInfo captionQueryInfo) {
        if (this.LLLLZLLIL) {
            this.LLJJ.LIZLLL(captionQueryInfo, this.LLLLZI, arrayList);
            String str = this.LLLLZIL;
            if (str != null) {
                this.LLJJ.LIZLLL(captionQueryInfo, str, arrayList);
                return;
            }
            return;
        }
        ArrayList<CaptionUtterance> arrayList2 = new ArrayList<>();
        this.LLLIIL = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // X.InterfaceC2216881Bpe
    public final void LLFZ(int i, boolean z, List list) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (!a0.LJJJIL(((CaptionUtterance) obj).LJ())) {
                    arrayList.add(obj);
                }
            }
            this.LLLIIIL.clear();
            this.LLLIIIL.addAll(arrayList);
            C384570F5z c384570F5z = this.LLJLIL;
            C384570F5z c384570F5z2 = null;
            if (c384570F5z == null) {
                c384570F5z = null;
            }
            c384570F5z.setData(C0EVG.LIZ(this.LLJZIJLIL, this.LLLIIIL));
            C384570F5z c384570F5z3 = this.LLJLIL;
            if (c384570F5z3 == null) {
                c384570F5z3 = null;
            }
            int iIndexOf = c384570F5z3.LL.indexOf(C13LP.LJJJLZIJ(i, this.LLLIIIL));
            C384570F5z c384570F5z4 = this.LLJLIL;
            if (c384570F5z4 == null) {
                c384570F5z4 = null;
            }
            if (iIndexOf == -1) {
                iIndexOf = 0;
            }
            c384570F5z4.LLLI(iIndexOf);
            ArrayList arrayList2 = new ArrayList();
            C384570F5z c384570F5z5 = this.LLJLIL;
            if (c384570F5z5 != null) {
                c384570F5z2 = c384570F5z5;
            }
            ArrayList<CaptionUtterance> arrayList3 = c384570F5z2.LL;
            int size = arrayList3.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!a0.LJJJIL(((CaptionUtterance) ListProtector.get(arrayList3, i2)).LJ())) {
                    arrayList2.add(new CaptionUtterance((CaptionUtterance) ListProtector.get(arrayList3, i2)));
                }
            }
            if (arrayList2.isEmpty() && C1428520nHG.LJIIL(LLLLLLZ())) {
                LLLLIL();
                this.LLLZIIL.LIZ.storeString("last_selected_language", this.LLLLZI);
            } else {
                LLLLIIIILLL(arrayList2);
                InterfaceC1452170ntP interfaceC1452170ntP = this.LLJZ;
                if (interfaceC1452170ntP != null) {
                    interfaceC1452170ntP.refreshCurrentFrame();
                }
            }
        }
        C1402610mbT.LJJJIL(LLLLLLZ(), z, 0, LLLLJI(), LLLLLILLIL());
    }

    public final void LLLLILI(int i, int i2, String str) {
        boolean z;
        int i3 = 0;
        if (LLLLLLL().getVisibility() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLLILZJ = z;
        MutableLiveData<C1452730nuJ> mutableLiveData = this.LLLFFI;
        C384570F5z c384570F5z = null;
        if (mutableLiveData == null) {
            mutableLiveData = null;
        }
        mutableLiveData.setValue(C1452730nuJ.LIZJ());
        C2217021Bps c2217021Bps = this.LLLFF;
        if (c2217021Bps == null) {
            c2217021Bps = null;
        }
        this.LLJJI = c2217021Bps.LIZ();
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJZ;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.setLoopPlay(false);
        }
        C1402610mbT.LJJIJIIJI(0, LLLLLLZ(), str, LLLLJI(), LLLLLILLIL());
        C2216891Bpf c2216891Bpf = this.LLJJIII;
        if (c2216891Bpf != null) {
            c2216891Bpf.LJIIJJI = str;
        }
        ArrayList<CaptionUtterance> arrayList = this.LLLIIIL;
        C384570F5z c384570F5z2 = this.LLJLIL;
        if (c384570F5z2 != null) {
            c384570F5z = c384570F5z2;
        }
        int iIndexOf = arrayList.indexOf(C13LP.LJJJLZIJ(i, c384570F5z.LL));
        if (iIndexOf != -1) {
            i3 = iIndexOf;
        }
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditCaptionScene enterEditView showPos ");
        sbLIZ.append(i3);
        sbLIZ.append(" selectIndex ");
        sbLIZ.append(i2);
        C201955140j.LJIILJJIL(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        final C2216891Bpf c2216891Bpf2 = this.LLJJIII;
        if (c2216891Bpf2 != null) {
            ArrayList<CaptionUtterance> arrayList2 = this.LLLIIIL;
            c2216891Bpf2.LJIILIIL = (int) this.LLJJI;
            c2216891Bpf2.LJIIL = true;
            c2216891Bpf2.LJIILL.clear();
            c2216891Bpf2.LJIILL.addAll(arrayList2);
            c2216891Bpf2.LJIILJJIL.clear();
            Iterator<CaptionUtterance> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c2216891Bpf2.LJIILJJIL.add(new CaptionUtterance(it2.next()));
            }
            C0F6U c0f6u = c2216891Bpf2.LIZJ;
            c0f6u.LLILZ = c2216891Bpf2.LJIIJJI;
            c0f6u.LLIZLLLIL = c2216891Bpf2.LJIILJJIL;
            c0f6u.LLJ = i3;
            c0f6u.LLJILJIL = i2;
            c0f6u.notifyDataSetChanged();
            ((LinearLayoutManager) c2216891Bpf2.LIZLLL.getLayoutManager()).scrollToPositionWithOffset(i3, (int) C12ES.LIZJ(100.0f, (Context) c2216891Bpf2.LJFF.getValue()));
            c2216891Bpf2.LJII.LIZIZ(new InterfaceC1391500mJY() { // from class: X.1Bpg
                @Override // X.InterfaceC1391500mJY
                public final void LLLL(int i4) {
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJJIIJ(int i4) {
                    C2216891Bpf c2216891Bpf3 = c2216891Bpf2;
                    if (c2216891Bpf3.LJIIIZ == null) {
                        c2216891Bpf3.LJIIIZ = new C0F6W(0, i4);
                        C2216891Bpf c2216891Bpf4 = c2216891Bpf2;
                        c2216891Bpf4.LIZLLL.addItemDecoration(c2216891Bpf4.LJIIIZ);
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c2216891Bpf2.LIZLLL.getLayoutManager();
                        C2216891Bpf c2216891Bpf5 = c2216891Bpf2;
                        linearLayoutManager.scrollToPositionWithOffset(c2216891Bpf5.LIZJ.LLJ, (int) C12ES.LIZJ(100.0f, (Context) c2216891Bpf5.LJFF.getValue()));
                    }
                    c2216891Bpf2.LJIILLIIL = true;
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJZI(int i4) {
                    C2216891Bpf c2216891Bpf3 = c2216891Bpf2;
                    C0F6W c0f6w = c2216891Bpf3.LJIIIZ;
                    if (c0f6w != null) {
                        c2216891Bpf3.LIZLLL.removeItemDecoration(c0f6w);
                        c2216891Bpf2.LJIIIZ = null;
                    }
                    c2216891Bpf2.LJIILLIIL = false;
                }
            });
            c2216891Bpf2.LJIIJ.LIZJ(new C19510311Uv() { // from class: X.0F6z
                @Override // X.C19510311Uv, X.InterfaceC19510211Uu
                public final void LIZIZ() {
                    c2216891Bpf2.LJI.toggleSoftInput(0, 2);
                }
            });
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = viewGroup.getContext();
        this.LLLLLZIL = context;
        if (context == null) {
            context = null;
        }
        this.LLLLZLL = C371890Ei3.LIZLLL(context, LLLLLLZ());
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eou, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    @Override // X.C0EVI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bO(java.util.List<com.ss.android.ugc.aweme.sticker.data.Utterance> r11, java.lang.String r12, java.lang.Boolean r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.bO(java.util.List, java.lang.String, java.lang.Boolean, java.lang.String):void");
    }

    public static void LLLZI(EditCaptionScene editCaptionScene, String str, Boolean bool, String str2, int i) {
        String str3;
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        VideoPublishEditModel videoPublishEditModelLLLLLLZ = editCaptionScene.LLLLLLZ();
        if (videoPublishEditModelLLLLLLZ != null) {
            C0LAB c0labLJJI = u4.LJJI(videoPublishEditModelLLLLLLZ, 0, 4);
            if (bool != null) {
                if (bool.booleanValue()) {
                    str3 = "1";
                } else {
                    str3 = "2";
                }
                c0labLJJI.LJ("is_select_all", str3);
            }
            if (str2 != null) {
                c0labLJJI.LJ("click_from", str2);
            }
            c0labLJJI.LJ("click", "delete");
            C20684815ws.LJIILLIIL(str, c0labLJJI.LIZ);
        }
    }
}
