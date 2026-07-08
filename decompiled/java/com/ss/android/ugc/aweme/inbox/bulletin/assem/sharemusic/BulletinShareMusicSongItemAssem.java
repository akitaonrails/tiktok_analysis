package com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic;

import X.C019F;
import X.C09R3;
import X.C0OPX;
import X.C0OY0;
import X.C1324840ka2;
import X.C1360520lVa;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1637906bB;
import X.C1841350y17;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C621040OXm;
import X.C621110OXt;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC621120OXu;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.publishpanel.BulletinPublishPanelViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicPlayViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AFwS333S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class BulletinShareMusicSongItemAssem extends ReusedUISlotAssem<BulletinShareMusicSongItemAssem> implements InterfaceC712990Rxx<C621040OXm> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public RemoteImageView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public C1841350y17 LLJLLL;
    public TuxIconView LLJZ;
    public C621040OXm LLJZIJLIL;
    public EnumC621120OXu LLL;
    public final AssemVMLazy LLLF;
    public final AssemVMLazy LLLFF;
    public final AssemVMLazy LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinShareMusicSongItemAssem.class, "playVM", "getPlayVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/sharemusic/BulletinShareMusicPlayViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinShareMusicSongItemAssem.class, "bulletinPublishPanelVM", "getBulletinPublishPanelVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/publishpanel/BulletinPublishPanelViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BulletinShareMusicSongItemAssem.class, "bulletinShareMusicListVM", "getBulletinShareMusicListVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/sharemusic/BulletinShareMusicListViewModel;", 0);
        c09r3.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public BulletinShareMusicSongItemAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinShareMusicPlayViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 492), AFwS240S0000000_9.get$arr$(278), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinPublishPanelViewModel.class);
        this.LLLFF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 493), AFwS240S0000000_9.get$arr$(279), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BulletinShareMusicListViewModel.class);
        this.LLLFFI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 494), AFwS240S0000000_9.get$arr$(280), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.a8d;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final BulletinShareMusicListViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLLFFI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        return (BulletinShareMusicListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (LinearLayout) view.findViewById(R.id.d4v);
        this.LLJL = (FrameLayout) view.findViewById(R.id.d4x);
        this.LLJLIL = (RemoteImageView) view.findViewById(R.id.d4w);
        this.LLJZ = (TuxIconView) view.findViewById(R.id.d4z);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.d4y);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.d51);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.d52);
        this.LLJLLL = (C1841350y17) view.findViewById(R.id.d50);
        FrameLayout frameLayout = this.LLJL;
        if (frameLayout != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 4, 42), frameLayout);
        }
        LinearLayout linearLayout = this.LLJJLIIIJLLLLLLLZ;
        if (linearLayout != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 5, 42), linearLayout);
        }
        C1841350y17 c1841350y17 = this.LLJLLL;
        if (c1841350y17 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 6, 42), c1841350y17);
        }
        AssemVMLazy assemVMLazy = this.LLLF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OXq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C621100OXs) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0OXr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C621100OXs) obj).LLILLJJLI;
            }
        }, null, AFwS333S0000000_9.get$arr$(4), 12);
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0OXk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618880OPe) obj).LLILLJJLI;
            }
        }, null, AFwS292S0000000_9.get$arr$(63), 6);
    }

    public final void op(EnumC621120OXu enumC621120OXu) {
        if (this.LLL == enumC621120OXu) {
            return;
        }
        this.LLL = enumC621120OXu;
        TuxIconView tuxIconView = this.LLJZ;
        if (tuxIconView != null) {
            int i = C621110OXt.LIZ[enumC621120OXu.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_color_play;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                        c419910GdJ.LJFF = true;
                        tuxIconView.setTuxIcon(c419910GdJ);
                        tuxIconView.clearAnimation();
                        return;
                    }
                    throw new C1954807lC();
                }
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_spinner_normal;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.zi);
                c419910GdJ2.LJFF = true;
                tuxIconView.setTuxIcon(c419910GdJ2);
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(tuxIconView.getContext(), R.anim.fc);
                    animationLoadAnimation.setInterpolator(new LinearInterpolator());
                    tuxIconView.startAnimation(animationLoadAnimation);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0OPX.LJII("BulletinShareMusicSongItemAssem play status Loading ani error");
                    return;
                }
            }
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_pause_fill1;
            c419910GdJ3.LJ = Integer.valueOf(R.attr.zi);
            c419910GdJ3.LJFF = true;
            tuxIconView.setTuxIcon(c419910GdJ3);
            tuxIconView.clearAnimation();
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C621040OXm c621040OXm) {
        String quantityString;
        Resources resources;
        List<String> urlList;
        String str;
        RemoteImageView remoteImageView;
        C621040OXm c621040OXm2 = c621040OXm;
        this.LLJZIJLIL = c621040OXm2;
        UrlModel coverMedium = c621040OXm2.LL.getCoverMedium();
        if (coverMedium != null && (urlList = coverMedium.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null && (remoteImageView = this.LLJLIL) != null) {
            C1324840ka2.LJIIJ(remoteImageView, str, -1, -1);
        }
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        String strK4 = "";
        if (tuxTextView != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            String musicName = c621040OXm2.LL.getMusicName();
            if (musicName == null) {
                musicName = "";
            }
            c1360520lVa.LIZ.append((CharSequence) musicName);
            tuxTextView.setText(c1360520lVa.LIZ);
        }
        int userCount = c621040OXm2.LL.getUserCount();
        TuxTextView tuxTextView2 = this.LLJLL;
        if (tuxTextView2 != null) {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                quantityString = resources.getQuantityString(2131755122, userCount, C0OY0.LIZIZ(Integer.valueOf(userCount)));
            } else {
                quantityString = null;
            }
            tuxTextView2.setText(quantityString);
        }
        int duration = c621040OXm2.LL.getDuration() * LSPassThroughRecordSizeConfig.DEFAULT;
        TuxTextView tuxTextView3 = this.LLJLLIL;
        if (tuxTextView3 != null) {
            if (duration > 0) {
                int i = duration / LSPassThroughRecordSizeConfig.DEFAULT;
                int i2 = i % 60;
                int i3 = i / 60;
                int i4 = i3 / 60;
                int i5 = i3 % 60;
                if (i4 == 0) {
                    strK4 = C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
                } else {
                    strK4 = C786410Ut5.k4(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
                }
            }
            tuxTextView3.setText(strK4);
        }
        AssemVMLazy assemVMLazy = this.LLLF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        C736680Sv4.LJIJJ(assemVMLazy.getValue(), new AwS375S0200000_9(this, c621040OXm2, 148));
        C736680Sv4.LJIJJ(sp(), new AwS375S0200000_9(this, c621040OXm2, 149));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C621040OXm c621040OXm) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C621040OXm c621040OXm) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
