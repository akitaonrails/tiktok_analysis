package com.ss.android.ugc.aweme.feed.favorite;

import X.AbstractC1604130rqV;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0BBZ;
import X.C0HHT;
import X.C0O1F;
import X.C0O1G;
import X.C0O1R;
import X.C0O1S;
import X.C0O1T;
import X.C0O8Z;
import X.C0O9L;
import X.C0P0S;
import X.C0P0T;
import X.C0RRG;
import X.C0RU7;
import X.C0SXF;
import X.C0TCH;
import X.C0XQ7;
import X.C1157604fu;
import X.C1172520gcM;
import X.C1204290hRb;
import X.C1206780hVc;
import X.C1295960jpS;
import X.C1356620lPI;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1867010ygV;
import X.C189200o6;
import X.C19719912Dl;
import X.C1A5L;
import X.C1AF0;
import X.C1AV2;
import X.C1AV3;
import X.C20094213jo;
import X.C20642515q3;
import X.C2095008Iq;
import X.C2097908Jt;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C291001Au;
import X.C295070BhR;
import X.C298410Bmp;
import X.C443120HZe;
import X.C452501pT;
import X.C614440O8c;
import X.C625990Ogv;
import X.C629640Omo;
import X.C694180RKu;
import X.C695600RQg;
import X.C695610RQh;
import X.C695660RQm;
import X.C699500RcC;
import X.C700450Rdj;
import X.C715980S6q;
import X.C717590SCv;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C731280SmM;
import X.C731300SmO;
import X.C731340SmS;
import X.C731410SmZ;
import X.C731420Sma;
import X.C731440Smc;
import X.C731450Smd;
import X.C731460Sme;
import X.C731530Sml;
import X.C731610Smt;
import X.C731620Smu;
import X.C731630Smv;
import X.C731640Smw;
import X.C731670Smz;
import X.C731910SnN;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.ACListenerS146S0100000_11;
import Y.ARunnableS14S1200000_9;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.assem.desc.bottom.DescBottomViewModel;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility;
import com.ss.android.ugc.feed.platform.cell.ability.VideoFavoriteAssemAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.text.a0;
import p5a.a;
import u4.q0;

/* JADX INFO: loaded from: classes12.dex */
public class VideoFavoriteAssem extends BaseCellSlotComponent<VideoFavoriteAssem> implements ComponentPriorityProtocol, VideoFavoriteAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C0RRG(this));
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public Drawable LLLFF;
    public C731340SmS LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public ARunnableS14S1200000_9 LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public WeakReference<C0P0T> LLLIIL;
    public final C01GW LLLIILIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoFavoriteAssem.class, "favoriteVM", "getFavoriteVM()Lcom/ss/android/ugc/aweme/feed/favorite/VideoFavoriteVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoFavoriteAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        c09r3.getClass();
        LLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoFavoriteAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoFavoriteVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new C695600RQg(c19719912DlLIZ), null, new C731610Smt());
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C731630Smv());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RightAreaContainerVM.class);
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new C695610RQh(c19719912DlLIZ2), null, new C731620Smu());
        this.LLL = C452501pT.LIZIZ(new C715980S6q(this));
        this.LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C731640Smw());
        this.LLLIIII = C452501pT.LIZIZ(new C0RU7());
        this.LLLIIIIL = C452501pT.LIZIZ(new C1204290hRb(this));
        this.LLLIIIL = C452501pT.LIZIZ(new C1172520gcM());
        this.LLLIILIL = C452501pT.LIZIZ(new C731460Sme(this));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_favorite";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return R.layout.b9x;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    public void Tp() {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(this, LLLIL[1]), new C2217381BqS() { // from class: X.0SmP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C695520RPy) obj).LL;
            }
        }, null, new C731280SmM(), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -751325392) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public final VideoFavoriteVM Bp() {
        return (VideoFavoriteVM) this.LLJLLL.getValue(this, LLLIL[0]);
    }

    public final C731340SmS Ep() {
        if (this.LLLFFI == null) {
            C731340SmS c731340SmS = new C731340SmS();
            this.LLLFFI = c731340SmS;
            Context context = getContext();
            boolean z = false;
            if (context != null && !C0SXF.LJIL(context)) {
                z = true;
            }
            c731340SmS.LIZ = z;
        }
        return this.LLLFFI;
    }

    public final Handler Fp() {
        return (Handler) this.LLLIIII.getValue();
    }

    public final AbstractC1604130rqV Gp() {
        return (AbstractC1604130rqV) this.LLLIIIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.ability.VideoFavoriteAssemAbility
    public final long Jw1() {
        return Bp().LL;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        boolean zLJI = MethodIDManager.LJI(202363);
        super.onCreate();
        Gp().LJ("VideoFavoriteAssem onCreate");
        if (!C1157604fu.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Smg
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C731530Sml) obj).LL;
                }
            }, null, new AwS625S0100000_11(this, 29), 6);
        }
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Smh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILLJJLI;
            }
        }, null, new C731410SmZ(), 6);
        if (!C298410Bmp.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0Smi
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1ELP) obj).LLJJJIL;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(75), 4);
        }
        Tp();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0O1I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new C731300SmO(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0O1J
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new C625990Ogv(), 4);
        if (((Boolean) C0BBZ.LIZ.getValue()).booleanValue()) {
            C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0SlL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLJIJIL;
                }
            }, null, new C731440Smc(), 6);
            C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0SlN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLJILJIL;
                }
            }, null, new C731450Smd(), 6);
        }
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Smm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZ;
            }
        }, null, new C0O1T(), 6);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Smn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZIL;
            }
        }, null, new C0O1S(), 6);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Smo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZLL;
            }
        }, null, new C0P0S(), 6);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Smk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILLL;
            }
        }, null, new C0O1G(), 6);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Smp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLIZ;
            }
        }, null, new C0O1R(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0Sms
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLLF;
            }
        }, C736820SvI.LIZLLL(), new C0O8Z(), 4);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0Smq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LL;
            }
        }, null, new C0O1F(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0Smr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLLFFI;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(7), 4);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void wr() {
        C0P0T c0p0t;
        C717590SCv c717590SCv = Bp().LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoFavoriteVM.LLJIJIL;
        c717590SCv.LIZIZ(null);
        WeakReference<C0P0T> weakReference = this.LLLIIL;
        if (weakReference != null && (c0p0t = weakReference.get()) != null) {
            c0p0t.dismiss();
        }
        WeakReference<C0P0T> weakReference2 = this.LLLIIL;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.LLLIIL = null;
        Fp().removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        if (C1157604fu.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Smf
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C731530Sml) obj).LL;
                }
            }, null, new C731420Sma(this), 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ip(C291001Au<? extends VideoItemParams> c291001Au) {
        Aweme aweme;
        if (c291001Au == null) {
            return;
        }
        VideoFavoriteVM videoFavoriteVMBp = Bp();
        VideoItemParams videoItemParams = (VideoItemParams) c291001Au.LIZ;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        videoFavoriteVMBp.getClass();
        videoFavoriteVMBp.setState(new AwS377S0200000_11(videoFavoriteVMBp, aweme, 182));
    }

    public final void Jp(String str) {
        Object obj;
        String aid;
        Gp().LJ("VideoFavoriteAssem handleFavoriteClick");
        Object[] objArr = new Object[2];
        objArr[0] = "feed";
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        objArr[1] = aid;
        C1206780hVc.LIZ(C786410Ut5.j4("click favorite button in %s, aid is %s", Arrays.copyOf(objArr, 2)));
        Bp().yQ2(str);
    }

    public void Qp(C731910SnN c731910SnN) {
        Object obj;
        VideoDiggAssemAbility videoDiggAssemAbility;
        Long lIA0;
        CharSequence text;
        String string;
        Long lLJIILIIL;
        Object obj2;
        DescBottomViewModel descBottomViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        Aweme aweme;
        String aid;
        Object obj3;
        WeakReference<C0P0T> weakReference;
        C0P0T c0p0t;
        AbstractC1604130rqV abstractC1604130rqVGp = Gp();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoFavoriteAssem showFavoriteState ");
        sbLIZ.append(c731910SnN);
        abstractC1604130rqVGp.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c731910SnN == null) {
            return;
        }
        if (!c731910SnN.LIZIZ && (weakReference = this.LLLIIL) != null && (c0p0t = weakReference.get()) != null) {
            c0p0t.LJIIL(new C731670Smz());
        }
        VideoItemParams item = Bp().getItem();
        Object obj4 = null;
        if (item != null && (aweme = item.getAweme()) != null && (aid = aweme.getAid()) != null) {
            C0O9L.LIZ.getClass();
            Map<String, C443120HZe<String, Boolean, Boolean>> map = C0O9L.LIZIZ;
            String string2 = toString();
            Boolean boolValueOf = Boolean.valueOf(c731910SnN.LIZLLL);
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            map.put(string2, new C443120HZe<>(aid, boolValueOf, Boolean.valueOf(((VideoItemParams) obj3).getAweme().isAd())));
        }
        if (c731910SnN.LIZLLL) {
            int i = 0;
            C786410Ut5.LJZL(0, (LinearLayout) getContentView().findViewById(R.id.hqz));
            C786410Ut5.LJZ(0, (FrameLayout) getContentView().findViewById(R.id.hpv));
            View viewFindViewById = getContentView().findViewById(R.id.hpx);
            if (!c731910SnN.LIZJ) {
                i = 4;
            }
            C1AV2 c1av2LIZ = C1AV3.LIZ("1", "Feed", null, "favorite_assem");
            c1av2LIZ.LJI = true;
            C2180521AVm.LIZLLL(viewFindViewById, i, c1av2LIZ);
        } else {
            C1AV2 c1av2LIZ2 = C1AV3.LIZ("2", "Feed", null, "favorite_assem");
            c1av2LIZ2.LJI = true;
            C2180521AVm.LIZLLL(getContentView().findViewById(R.id.hqz), 8, c1av2LIZ2);
            C2180521AVm.LIZLLL(getContentView().findViewById(R.id.hpv), 8, c1av2LIZ2);
            C2180521AVm.LIZLLL(getContentView().findViewById(R.id.hpx), 8, c1av2LIZ2);
            C0O9L c0o9l = C0O9L.LIZ;
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj = c724270Sb32.LL;
            } else {
                obj = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj).getAweme();
            c0o9l.getClass();
            C0O9L.LIZ(aweme2);
        }
        ((ImageView) getContentView().findViewById(R.id.hpp)).setSelected(c731910SnN.LIZIZ);
        ((TextView) getContentView().findViewById(R.id.hpx)).setText(c731910SnN.LIZ);
        if (getContentView().findViewById(R.id.hpp).isSelected()) {
            q0.LJJIFFI(getContentView().findViewById(R.id.hqz), C1356620lPI.LIZ(C20642515q3.LJI(2131823207), C2097908Jt.LIZJ(new Pair("number", String.valueOf(c731910SnN.LIZ)))));
        } else {
            q0.LJJIFFI(getContentView().findViewById(R.id.hqz), C1356620lPI.LIZ(C20642515q3.LJI(2131823208), C2097908Jt.LIZJ(new Pair("number", String.valueOf(c731910SnN.LIZ)))));
        }
        if (!C0SXF.LJIL(getContext())) {
            ((C1295960jpS) getContentView().findViewById(R.id.hpp)).setImageDrawable(Ep().LJ());
        }
        if (this.LLLFZ && (descBottomViewModel = (DescBottomViewModel) this.LLL.getValue()) != null && (mutableLiveData = descBottomViewModel.LLILLJJLI) != null) {
            mutableLiveData.postValue(Boolean.valueOf(c731910SnN.LIZIZ));
        }
        if (c731910SnN.LIZLLL && ((Boolean) C1867010ygV.LIZIZ.getValue()).booleanValue() && (videoDiggAssemAbility = (VideoDiggAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), VideoDiggAssemAbility.class, null)) != null && (lIA0 = videoDiggAssemAbility.IA0()) != null) {
            long jLongValue = lIA0.longValue();
            AppCompatTextView appCompatTextView = (AppCompatTextView) getContentView().findViewById(R.id.hpx);
            if (appCompatTextView != null && (text = appCompatTextView.getText()) != null && (string = text.toString()) != null) {
                if (TextUtils.isDigitsOnly(string)) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(string);
                } else if (a0.LJJJIL(string)) {
                    return;
                } else {
                    lLJIILIIL = 10000L;
                }
                if (lLJIILIIL != null) {
                    long jLongValue2 = lLJIILIIL.longValue();
                    if (jLongValue > ((Number) C1867010ygV.LIZJ.getValue()).intValue() && jLongValue2 == 0) {
                        AbstractC1604130rqV abstractC1604130rqVGp2 = Gp();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("checkDisplayState fail - aid: ");
                        C724270Sb3 c724270Sb33 = this.LLJI;
                        if (c724270Sb33 != null) {
                            obj2 = c724270Sb33.LL;
                        } else {
                            obj2 = null;
                        }
                        sbLIZ2.append(((VideoItemParams) obj2).getAweme().getAid());
                        sbLIZ2.append(", diggCount: ");
                        sbLIZ2.append(jLongValue);
                        sbLIZ2.append(", state: ");
                        sbLIZ2.append(c731910SnN);
                        abstractC1604130rqVGp2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("checkDisplayState fail - aid: ");
                        C724270Sb3 c724270Sb34 = this.LLJI;
                        if (c724270Sb34 != null) {
                            obj4 = c724270Sb34.LL;
                        }
                        sbLIZ3.append(((VideoItemParams) obj4).getAweme().getAid());
                        sbLIZ3.append(", diggCount: ");
                        sbLIZ3.append(jLongValue);
                        sbLIZ3.append(", state: ");
                        sbLIZ3.append(c731910SnN);
                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.ability.VideoFavoriteAssemAbility
    public final void TX(String str) {
        if (str == null) {
            str = "click_fav_button";
        }
        Jp(str);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Gp().LJ("VideoFavoriteAssem onViewCreated");
        C614440O8c.LIZIZ = true;
        C731340SmS c731340SmSEp = Ep();
        c731340SmSEp.LIZJ = getContentView();
        c731340SmSEp.LIZLLL = getContentView().findViewById(R.id.hqz);
        c731340SmSEp.LJ = getContentView().findViewById(R.id.hpv);
        c731340SmSEp.LJFF = getContentView().findViewById(R.id.hpp);
        c731340SmSEp.LJI = (TuxTextView) getContentView().findViewById(R.id.hpx);
        this.LLLFF = c731340SmSEp.LJ();
        ((C1295960jpS) getContentView().findViewById(R.id.hpp)).setImageDrawable(this.LLLFF);
        q0.LJIJ(getContentView().findViewById(R.id.hqz), new C20094213jo() { // from class: X.0Smb
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(C20642515q3.LJI(2131823209));
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
            }
        });
        C2271391DvN.LIZ(getContentView(), (C1A5L) C2271381DvM.LJIILLIIL.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams item;
        VideoItemParams item2;
        Aweme aweme;
        Aweme aweme2;
        PublishPreviewInfo previewData;
        InteractAreaCommonAbility interactAreaCommonAbility;
        VideoItemParams videoItemParams2 = videoItemParams;
        C731910SnN c731910SnN = ((C731530Sml) Bp().getState()).LL;
        if (c731910SnN != null && c731910SnN.LIZLLL && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLIL.getValue()) != null) {
            interactAreaCommonAbility.zB1(this);
        }
        Gp().LJ("VideoFavoriteAssem onBind");
        View contentView = getContentView();
        Handler handlerFp = Fp();
        contentView.setOnTouchListener(null);
        Context context = contentView.getContext();
        if ((context != null && C0SXF.LJIL(context)) || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || (((item = Bp().getItem()) != null && (aweme2 = item.getAweme()) != null && (previewData = AwemeBizExtKt.getPreviewData(aweme2)) != null && previewData.inPublishing) || ((item2 = Bp().getItem()) != null && (aweme = item2.getAweme()) != null && AwemeExtKt.isScheduleVideo(aweme)))) {
            C786410Ut5.I7(new ACListenerS146S0100000_11(this, 104), contentView);
        } else {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Smy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            }, contentView);
            final a aVar = new a(0.6f, 150L);
            C786410Ut5.LJJZZIII(handlerFp, new Runnable() { // from class: X.0SnH
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoFavoriteAssem@4c1e.configClickListener$3");
                    try {
                        VideoFavoriteAssem videoFavoriteAssem = this.LL;
                        a aVar2 = aVar;
                        videoFavoriteAssem.getClass();
                        aVar2.LLILLL = ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIILJJIL(new C731840SnG(videoFavoriteAssem), new C0O1H(videoFavoriteAssem));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoFavoriteAssem@4c1e.configClickListener$3");
                }
            });
            contentView.setOnTouchListener(aVar);
        }
        VideoFavoriteVM videoFavoriteVMBp = Bp();
        videoFavoriteVMBp.getClass();
        try {
            if (videoFavoriteVMBp.BQ2(videoItemParams2.getAweme()) && C295070BhR.LIZ()) {
                C0TCH.LIZ(C0TCH.LIZ, C629640Omo.LIZ);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
        vr((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: zp */
    public final void vr(VideoItemParams videoItemParams) {
        VideoFavoriteVM videoFavoriteVMBp = Bp();
        Context context = getContext();
        C717590SCv c717590SCv = videoFavoriteVMBp.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoFavoriteVM.LLJIJIL;
        c717590SCv.LIZIZ(context);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.ability.VideoFavoriteAssemAbility
    public final boolean Ja2(float f, float f2) {
        VideoItemParams item;
        Object c098200Yq;
        Aweme aweme;
        Aweme aweme2;
        PublishPreviewInfo previewData;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        VideoItemParams item2 = Bp().getItem();
        if ((item2 != null && (aweme2 = item2.getAweme()) != null && (previewData = AwemeBizExtKt.getPreviewData(aweme2)) != null && previewData.inPublishing) || (((item = Bp().getItem()) != null && (aweme = item.getAweme()) != null && AwemeExtKt.isScheduleVideo(aweme)) || getContentView().getVisibility() != 0 || !getContentView().isAttachedToWindow())) {
            return false;
        }
        try {
            C695660RQm c695660RQm = C695660RQm.LIZ;
            View contentView = getContentView();
            c695660RQm.getClass();
            c098200Yq = C695660RQm.LIZIZ(contentView);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Rect rect = (Rect) c098200Yq;
        Objects.toString(rect);
        if (rect != null) {
            rect.contains((int) f, (int) f2);
            if (rect.contains((int) f, (int) f2)) {
                return true;
            }
        }
        return false;
    }
}
