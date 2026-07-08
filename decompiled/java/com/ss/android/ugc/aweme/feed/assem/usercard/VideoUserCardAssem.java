package com.ss.android.ugc.aweme.feed.assem.usercard;

import X.AbstractC1261460ivo;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C01GW;
import X.C0HHT;
import X.C0RJZ;
import X.C0RP1;
import X.C1075800e6M;
import X.C1075860e6S;
import X.C1261440ivm;
import X.C1261470ivp;
import X.C1262790ixx;
import X.C13LE;
import X.C1559990qhJ;
import X.C1560000qhK;
import X.C1560010qhL;
import X.C1637806bA;
import X.C1637906bB;
import X.C1720106oR;
import X.C19719912Dl;
import X.C20686015x4;
import X.C20686315x7;
import X.C20686415x8;
import X.C20686515x9;
import X.C20686715xB;
import X.C20686815xC;
import X.C20686915xD;
import X.C20687515xJ;
import X.C20687615xK;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1261750iwH;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.container.info.FeedInfoAreaVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS2S3000000_19;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoUserCardAssem extends FeedBaseAssem<VideoUserCardAssem> implements InterfaceC1261750iwH {
    public static final C20686315x7 LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final LinearInterpolator LLJLLL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoUserCardAssem.class, "userCardVM", "getUserCardVM()Lcom/ss/android/ugc/aweme/feed/assem/usercard/VideoUserCardVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(VideoUserCardAssem.class, "infoAreaVM", "getInfoAreaVM()Lcom/ss/android/ugc/feed/platform/container/info/FeedInfoAreaVM;", 0)};
        LLJLL = new C20686315x7();
        LLJLLL = new LinearInterpolator();
    }

    public VideoUserCardAssem() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoUserCardVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, c1637906bB, new C1559990qhJ(c19719912DlLIZ), null, new C20687515xJ());
        this.LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C20687615xK());
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedInfoAreaVM.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new C1560000qhK(c19719912DlLIZ2), null, new C1560010qhL());
    }

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bb6;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.15xE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new C20686515x9(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.15xI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new C20686415x8(), 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void so() {
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.15xF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20685815x2) obj).LLILZIL);
            }
        }, null, new C20686815xC(), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.15xG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20685815x2) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new C20686715xB(), 4);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.15xH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20685815x2) obj).LLILLL;
            }
        }, null, new C20686915xD(), 6);
    }

    public final VideoUserCardVM tp() {
        return (VideoUserCardVM) this.LLJL.getValue(this, LLJLLIL[0]);
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        VideoUserCardVM videoUserCardVMTp = tp();
        videoUserCardVMTp.getClass();
        if (abstractC1261460ivo instanceof C1261440ivm) {
            int i = videoUserCardVMTp.LLILZ + 1;
            videoUserCardVMTp.LLILZ = i;
            if (i == videoUserCardVMTp.LLILLL) {
                C23250099c.LIZLLL(videoUserCardVMTp.getAssemVMScope(), null, null, new C1075860e6S(videoUserCardVMTp, null), 3);
            }
            C20686015x4.LIZ.getClass();
            Keva keva = C20686015x4.LIZIZ;
            keva.storeInt(C20686015x4.LIZLLL(), 0);
            keva.storeInt(C20686015x4.LIZJ(), -1);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("RecMore", "reset video rec user!");
            return;
        }
        if (!(abstractC1261460ivo instanceof C1261470ivp)) {
            return;
        }
        videoUserCardVMTp.LLILZ--;
    }

    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        VideoUserCardVM videoUserCardVMTp = tp();
        videoUserCardVMTp.getClass();
        videoUserCardVMTp.withState(new AwS397S0200000_31(c1075800e6M, videoUserCardVMTp, 76));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e2);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.15xA
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 != null) {
                    VideoUserCardVM videoUserCardVMTp = this.LLILZ.tp();
                    videoUserCardVMTp.getClass();
                    videoUserCardVMTp.setStateImmediate(AFwS276S0000000_31.get$arr$(256));
                    videoUserCardVMTp.wQ2(false, EnumC1073720e30.CLICK);
                }
            }
        }, getContentView().findViewById(R.id.e1m));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String aid;
        String secUid;
        User author;
        String uid;
        User author2;
        VideoItemParams videoItemParams2 = videoItemParams;
        LLJLL.getClass();
        boolean zLIZ = C20686315x7.LIZ(videoItemParams2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind, item:");
        Aweme aweme = videoItemParams2.getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", isActive: ");
        sbLIZ.append(zLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        tp().LL = zLIZ;
        if (!zLIZ) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            return;
        }
        C1262790ixx c1262790ixx = (C1262790ixx) getContentView().findViewById(R.id.userCardLayout);
        Aweme aweme2 = videoItemParams2.getAweme();
        String str = "";
        if (aweme2 == null || (author2 = aweme2.getAuthor()) == null || (secUid = author2.getSecUid()) == null) {
            secUid = "";
        }
        Aweme aweme3 = videoItemParams2.getAweme();
        if (aweme3 != null && (author = aweme3.getAuthor()) != null && (uid = author.getUid()) != null) {
            str = uid;
        }
        String str2 = videoItemParams2.mEventType;
        if (str2 != null) {
            View viewFindViewById = c1262790ixx.findViewById(R.id.t4x);
            if (viewFindViewById != null) {
                viewFindViewById.setBackground(null);
            }
            if (!this.LLJJLIIIJLLLLLLLZ) {
                this.LLJJLIIIJLLLLLLLZ = true;
                c1262790ixx.LJLJLLL(null, C724240Sb0.LJI(this), new AwS2S3000000_19(str2, str, secUid, 1));
                c1262790ixx.Eg(this);
            } else {
                c1262790ixx.reset();
                c1262790ixx.LJJLIIIJILLIZJL(secUid, str, null);
                c1262790ixx.LLL(new AwS70S1000000_19(str, 18));
            }
        }
        C786410Ut5.LJLLLLLL(8, getContentView());
    }

    public final void up(boolean z, boolean z2) {
        float f;
        int i;
        long j;
        View contentView = getContentView();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        C786410Ut5.T4(contentView, f);
        View contentView2 = getContentView();
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, contentView2);
        View viewLJJIJL = LJJIJL();
        if (!z) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, viewLJJIJL);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLILLLLZIIL.getValue(this, LLJLLIL[1]);
        boolean z3 = !z;
        if (z2) {
            j = 150;
        } else {
            j = -1;
        }
        assemViewModel.getClass();
        assemViewModel.setStateImmediate(new C0RJZ(z3, j));
    }
}
