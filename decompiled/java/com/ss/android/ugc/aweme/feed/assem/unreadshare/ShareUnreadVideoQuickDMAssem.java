package com.ss.android.ugc.aweme.feed.assem.unreadshare;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C07PH;
import X.C0I0B;
import X.C0S1H;
import X.C0S1X;
import X.C0S1Z;
import X.C0S2R;
import X.C0S2S;
import X.C0S2U;
import X.C0Y8T;
import X.C0Y8Y;
import X.C0YSQ;
import X.C0ZH1;
import X.C1220000hqw;
import X.C127G;
import X.C1336205Ku;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C700100RdA;
import X.C714540S1c;
import X.C714560S1e;
import X.C723700Sa8;
import X.C723830SaL;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC2172611A1b;
import X.EnumC714710S1t;
import X.EnumC913010Zrn;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC714600S1i;
import X.InterfaceC876950Yaj;
import Y.AObjectS64S0000000_11;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.quickreply.QuickDMViewModel;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.ContentIMConversation;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.IMInfo;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics;
import com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class ShareUnreadVideoQuickDMAssem extends BaseCellSlotComponent<ShareUnreadVideoQuickDMAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(99));
    public final C736950SvV LLJLLL = new C736950SvV(C13LE.LIZ(MessageDraftViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(100), new AwS555S0100000_11((AbstractC738140SxQ) this, 272), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final InterfaceC1731706qJ LLJZ;
    public String LLJZIJLIL;
    public C0S2R LLL;
    public C127G LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShareUnreadVideoQuickDMAssem.class, "quickDMViewModel", "getQuickDMViewModel()Lcom/ss/android/ugc/aweme/feed/assem/quickreply/QuickDMViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b71;
    }

    public ShareUnreadVideoQuickDMAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickDMViewModel.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 271), null, AFwS243S0000000_11.get$arr$(98));
        this.LLL = C0S2R.UNKNOWN;
    }

    public final void Bp() {
        StandardBusinessModel standardBusinessModel;
        IMInfo imInfo;
        ContentIMConversation contentIMConversation;
        Integer numValueOf;
        String str;
        C724270Sb3 c724270Sb3 = this.LLJI;
        ContentModel contentModel = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getContentModel();
        if (contentModel == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (imInfo = standardBusinessModel.getImInfo()) == null || (contentIMConversation = imInfo.contentIMConversation) == null || (numValueOf = Integer.valueOf(contentIMConversation.conversationType)) == null) {
            return;
        }
        if (numValueOf.intValue() == 1) {
            str = "unread_share";
        } else if (numValueOf.intValue() != 2) {
            return;
        } else {
            str = "group_unread_share";
        }
        InterfaceC714600S1i quickReplyAnalytics = C1336205Ku.LIZ(false).getQuickReplyAnalytics();
        C724270Sb3 c724270Sb32 = this.LLJI;
        quickReplyAnalytics.LJII(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType, str, C0I0B.LJFF.LIZIZ());
    }

    public final QuickDMViewModel Ep() {
        return (QuickDMViewModel) this.LLJZ.getValue(this, LLLFF[0]);
    }

    public final void Gp() {
        String str = this.LLJZIJLIL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (Intrinsics.LJFF(str, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid())) {
            return;
        }
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            C0S2S c0s2s = EnumC2172611A1b.Companion;
            C724270Sb3 c724270Sb32 = this.LLJI;
            String str2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType;
            c0s2s.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str2);
            C0S2U c0s2u = C0S2U.MUF_SHARE_VIDEO;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            C724270Sb3 c724270Sb33 = this.LLJI;
            String aid = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, C0ZH1.POST, this.LLL, "", C0I0B.LJFF.LIZIZ());
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        this.LLJZIJLIL = ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme().getAid();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLF;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLF;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MessageDraftViewModel.class, new AObjectS64S0000000_11(this, 1)}, defaultViewModelProviderFactory);
                    this.LLLF = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void Fp(EnumC714710S1t enumC714710S1t) {
        Object obj;
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            C0S2S c0s2s = EnumC2172611A1b.Companion;
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str = ((VideoItemParams) obj).mEventType;
            c0s2s.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str);
            C0S2U c0s2u = C0S2U.MUF_SHARE_VIDEO;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            String aid = ((VideoItemParams) obj2).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, C0ZH1.POST, this.LLL, enumC714710S1t, C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            LJJIJL().setTag(C700100RdA.LJIILIIL, "ShareUnreadVideoQuickDMAssem");
        } else {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS111S0100000_11(this, 29));
        }
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 111));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        StandardBusinessModel standardBusinessModel;
        IMInfo imInfo;
        User sharer;
        Integer numValueOf;
        String str;
        C714560S1e c714560S1e;
        String string;
        String uniqueId;
        String string2;
        StandardBusinessModel standardBusinessModel2;
        IMInfo imInfo2;
        VideoItemParams videoItemParams2 = videoItemParams;
        ContentModel contentModel = videoItemParams2.getAweme().getContentModel();
        if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (imInfo = standardBusinessModel.getImInfo()) != null) {
            ContentModel contentModel2 = videoItemParams2.getAweme().getContentModel();
            if ((contentModel2 == null || (standardBusinessModel2 = contentModel2.standardBusinessModel) == null || (imInfo2 = standardBusinessModel2.getImInfo()) == null || (sharer = imInfo2.user) == null) && (sharer = AwemeBizExtKt.getSharer(videoItemParams2.getAweme())) == null) {
                return;
            }
            AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 390);
            AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(174);
            List<String> listLIZ = C07PH.LIZ();
            ContentIMConversation contentIMConversation = imInfo.contentIMConversation;
            String name = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (contentIMConversation != null) {
                numValueOf = Integer.valueOf(contentIMConversation.conversationType);
            } else {
                numValueOf = null;
            }
            String str2 = "";
            if (numValueOf == null) {
                return;
            }
            if (numValueOf.intValue() == 1) {
                C0S1X c0s1x = new C0S1X(sharer, new AwS412S0200000_11(this, sharer, 50));
                String nickname = sharer.getNickname();
                if (nickname != null && nickname.length() != 0) {
                    uniqueId = sharer.getNickname();
                } else {
                    uniqueId = sharer.getUniqueId();
                }
                Context context = getContext();
                if (context != null && (string2 = context.getString(2131831562)) != null) {
                    str2 = string2;
                }
                C714560S1e c714560S1e2 = new C714560S1e(c0s1x, new C714540S1c(listLIZ, C786410Ut5.j4(str2, Arrays.copyOf(new Object[]{uniqueId}, 1)), aFwS232S0000000_4, 8, awS590S0100000_11, 12), EnumC913010Zrn.AUTO.getEtString(), C0S2U.MUF_SHARE_VIDEO.getEtString(), 28);
                C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0S1N
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C714560S1e) obj).LLILZIL;
                    }
                }, C736820SvI.LIZLLL(), new AwS625S0100000_11(c0s1x, 104), 4);
                Ep().wQ2(c714560S1e2);
                this.LLL = C0S2R.PRIVATE;
                Gp();
                return;
            }
            if (numValueOf.intValue() != 2) {
                return;
            }
            InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
            ContentIMConversation contentIMConversation2 = imInfo.contentIMConversation;
            if (contentIMConversation2 != null) {
                str = contentIMConversation2.conversationId;
            } else {
                str = null;
            }
            C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ(str);
            if (c0y8tLIZ != null) {
                C0S1Z c0s1z = new C0S1Z(sharer, c0y8tLIZ, new AwS412S0200000_11(this, sharer, 51));
                Context context2 = getContext();
                if (context2 != null && (string = context2.getString(2131831562)) != null) {
                    str2 = string;
                }
                Object[] objArr5 = new Object[1];
                C0Y8Y coreInfo = c0y8tLIZ.getCoreInfo();
                if (coreInfo != null) {
                    name = coreInfo.getName();
                }
                objArr5[0] = name;
                c714560S1e = new C714560S1e(c0s1z, new C714540S1c(listLIZ, C786410Ut5.j4(str2, Arrays.copyOf(objArr5, 1)), aFwS232S0000000_4, 8, awS590S0100000_11, 12), EnumC913010Zrn.AUTO.getEtString(), C0S2U.MUF_SHARE_VIDEO.getEtString(), 28);
            } else {
                c714560S1e = new C714560S1e(objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 127);
            }
            Ep().wQ2(c714560S1e);
            this.LLL = C0S2R.GROUP;
            Gp();
        }
    }
}
