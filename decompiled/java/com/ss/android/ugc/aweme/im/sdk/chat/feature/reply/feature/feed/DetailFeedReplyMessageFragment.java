package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import X.C01GW;
import X.C03H5;
import X.C069P;
import X.C098200Yq;
import X.C0I08;
import X.C0I0B;
import X.C0I0E;
import X.C0IAN;
import X.C0IAO;
import X.C0IAS;
import X.C0IAT;
import X.C0IAU;
import X.C0IAV;
import X.C0OBG;
import X.C0PEM;
import X.C0S1H;
import X.C0S2R;
import X.C0S2T;
import X.C0S2U;
import X.C0SZG;
import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C0ZG8;
import X.C0ZG9;
import X.C0ZGA;
import X.C0ZGS;
import X.C0ZH0;
import X.C0ZH1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C127G;
import X.C1308910kAL;
import X.C1336205Ku;
import X.C1360460lVU;
import X.C1375880luM;
import X.C13LE;
import X.C1557990qe5;
import X.C1575980r76;
import X.C1599690rjL;
import X.C1636506ax;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1A1M;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C23250099c;
import X.C286560BLa;
import X.C300660BqS;
import X.C338520DOw;
import X.C339190DRl;
import X.C419820GdA;
import X.C424370GkV;
import X.C444960Hcc;
import X.C451250Hml;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C721360SRi;
import X.C724750Sbp;
import X.C729510SjV;
import X.C736680Sv4;
import X.C736950SvV;
import X.C740740T3w;
import X.C786410Ut5;
import X.C800330VaR;
import X.C817503Hh;
import X.C866950Xzh;
import X.C869590Y9l;
import X.C892470Yzl;
import X.C892500Yzo;
import X.C896400ZEo;
import X.C897000ZGw;
import X.C913020Zro;
import X.C913060Zrs;
import X.C913380ZsO;
import X.EnumC2172611A1b;
import X.EnumC461080I6g;
import X.EnumC714710S1t;
import X.EnumC714720S1u;
import X.EnumC896890ZGl;
import X.EnumC896910ZGn;
import X.EnumC913010Zrn;
import X.InterfaceC0148002o;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC714600S1i;
import X.InterfaceC714750S1x;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC876950Yaj;
import X.InterfaceC913270ZsD;
import Y.AObjectS67S0000000_14;
import Y.AObserverS216S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.BaseHeader;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.assem.DetailFeedDMViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.assem.viewmodel.QuickReplyEmojiViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel;
import com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeDMService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class DetailFeedReplyMessageFragment extends BaseFragment implements C0I08, View.OnClickListener, InterfaceC913270ZsD, InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw3I2svIS4nZiMpKDsmOiBiOyojHELIOSJDxiLyoyPDA+LGE1LSAoZws2PCQlJQk2LSEeLD8/MQgpOjwyLyAKOy40JSAiPQ==";
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C424370GkV LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public final C736950SvV LLJILLL;
    public final C736950SvV LLJJ;
    public final C736950SvV LLJJI;
    public final C736950SvV LLJJIII;
    public final C01GW LLJJIJI;
    public C869590Y9l LLJJIJIIJIL;
    public String LLJJIJIL;
    public long LLJJJ;
    public C0SZG LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public Aweme LLJLIL;
    public String LLJLILLLLZIIL;
    public AObserverS216S0100000_12 LLJLL;
    public C0S2R LLJLLIL;
    public C0ZH1 LLJLLL;
    public C0S2U LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public C127G LLLFF;

    public final String LJJLIIIJJI() {
        switch (oS(this, false).ordinal()) {
            case 0:
            case 1:
                String enterFrom = getEnterFrom();
                if (enterFrom != null) {
                    return enterFrom;
                }
                Bundle arguments = getArguments();
                if (arguments != null) {
                    return arguments.getString("video_from");
                }
                return null;
            case 2:
            case 7:
                return this.LLJJL ? "repost_feed" : "others_homepage";
            case 3:
            case 4:
            case 5:
            case 6:
                DetailFeedDMViewModel detailFeedDMViewModelBS = bS();
                String strSS = sS();
                detailFeedDMViewModelBS.getClass();
                return Intrinsics.LJFF(strSS, "from_auto_message") ? "link_auto_message" : "chat_video_detail";
            case 8:
                return getEnterFrom();
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.C0I08
    public final void TG() {
    }

    public final String WR() {
        return C892500Yzo.LIZ[oS(this, false).ordinal()] == 3 ? "profile_reposttab" : LJJLIIIJJI();
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GS() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment.GS():void");
    }

    public final void VR() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        if (this.LLJJL) {
            if (uS()) {
                nS().setEnabled(false);
                C786410Ut5.B5(nS(), 0.4f);
                C339190DRl.LIZIZ(kS());
                View view = getView();
                if (view != null && (viewFindViewById3 = view.findViewById(R.id.kqv)) != null) {
                    viewFindViewById3.setBackground(null);
                }
                View view2 = getView();
                if (view2 == null || (viewFindViewById2 = view2.findViewById(R.id.gq2)) == null) {
                    return;
                }
                C339190DRl.LIZIZ(viewFindViewById2);
                return;
            }
            nS().setEnabled(true);
            C786410Ut5.B5(nS(), 1.0f);
            Bundle arguments = getArguments();
            if (zS(arguments != null ? arguments.getString("video_from") : null)) {
                C339190DRl.LIZLLL(kS());
            } else {
                C339190DRl.LIZIZ(kS());
            }
            UR(getView());
            View view3 = getView();
            if (view3 == null || (viewFindViewById = view3.findViewById(R.id.gq2)) == null) {
                return;
            }
            C339190DRl.LIZLLL(viewFindViewById);
        }
    }

    public final String ZR() {
        String str = this.LLJILJIL;
        return str == null ? C1336205Ku.LIZ(false).getImUserService().LIZLLL(this.LLJLILLLLZIIL) : str;
    }

    public final DetailFeedDMViewModel bS() {
        return (DetailFeedDMViewModel) this.LLJJ.getValue();
    }

    public final C424370GkV cS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h0_) : null;
            this.LLJ = (C424370GkV) viewFindViewById;
        }
        return (C424370GkV) viewFindViewById;
    }

    public final MessageDraftViewModel hS() {
        return (MessageDraftViewModel) this.LLJJIII.getValue();
    }

    public final TuxIconView kS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.so2) : null;
            this.LLIZ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxTextView nS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t7o) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final SendMessageViewModel qS() {
        return (SendMessageViewModel) this.LLJILLL.getValue();
    }

    public final TuxIconView rS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uq2) : null;
            this.LLJI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final boolean uS() {
        if (!this.LLJJL) {
            return false;
        }
        String str = this.LLJLILLLLZIIL;
        return str == null || str.length() == 0 || !C1A1M.LIZIZ.LIZ(this.LLJLILLLLZIIL);
    }

    public final boolean yS() {
        return ((Boolean) this.LLJL.getValue()).booleanValue();
    }

    public DetailFeedReplyMessageFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SendMessageViewModel.class);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(159);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJILLL = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS248S0000000_14, c451460Hn6, c451620HnM, c338520DOw);
        this.LLJJ = new C736950SvV(C13LE.LIZ(DetailFeedDMViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS248S0000000_14.get$arr$(160), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJI = new C736950SvV(C13LE.LIZ(QuickReplyEmojiViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS248S0000000_14.get$arr$(161), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJIII = new C736950SvV(C13LE.LIZ(MessageDraftViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS248S0000000_14.get$arr$(162), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 625));
        this.LLJJJ = -1L;
        this.LLJJJJ = -1;
        this.LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 624));
        this.LLJLLIL = C0S2R.UNKNOWN;
        this.LLJLLL = C0ZH1.UNKNOWN;
        this.LLJZ = C0S2U.UNKNOWN;
    }

    public final void JS() {
        C0S2U c0s2uLIZ;
        Aweme awemeAS = aS();
        String aid = null;
        if (Intrinsics.LJFF(this.LLLF, awemeAS != null ? awemeAS.getAid() : null)) {
            return;
        }
        this.LLLF = awemeAS != null ? awemeAS.getAid() : null;
        String str = this.LLJZIJLIL;
        Aweme awemeAS2 = aS();
        if (Intrinsics.LJFF(str, awemeAS2 != null ? awemeAS2.getAid() : null)) {
            c0s2uLIZ = C0S2U.SHARE_LINK;
        } else {
            C0S2T c0s2t = C0S2U.Companion;
            String str2 = this.LLL;
            c0s2t.getClass();
            c0s2uLIZ = C0S2T.LIZ(str2);
        }
        this.LLJZ = c0s2uLIZ;
        C869590Y9l c869590Y9l = this.LLJJIJIIJIL;
        String string = c869590Y9l != null ? Long.valueOf(c869590Y9l.getSender()).toString() : null;
        String str3 = "";
        if (C1375880luM.LIZLLL(awemeAS)) {
            aid = "";
        } else if (awemeAS != null) {
            aid = awemeAS.getAid();
        }
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            EnumC2172611A1b enumC2172611A1bLIZ = C897000ZGw.LIZ(WR());
            C0S2U c0s2u = this.LLJZ;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            if (aid == null) {
                aid = "";
            }
            C0ZH1 c0zh1 = this.LLJLLL;
            C0S2R c0s2r = this.LLJLLIL;
            if (!yS() && string != null) {
                str3 = string;
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, c0zh1, c0s2r, str3, C0I0B.LJFF.LIZIZ());
        }
    }

    public final Aweme aS() {
        return C740740T3w.LJFF(requireActivity());
    }

    public final EnumC896890ZGl dS() {
        return C286560BLa.LIZ() ? EnumC896890ZGl.TYPE_FRIENDS_HOMEPAGE_MUF_ENTRANCE : EnumC896890ZGl.TYPE_DEFAULT;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLFF;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLFF;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MessageDraftViewModel.class, new AObjectS67S0000000_14(this, 10)}, defaultViewModelProviderFactory);
                    this.LLLFF = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final String getEnterFrom() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("enter_from");
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (C300660BqS.LIZ()) {
            if (getActivity() != null) {
                AObserverS216S0100000_12 aObserverS216S0100000_12 = this.LLJLL;
                if (aObserverS216S0100000_12 != null) {
                    C740740T3w.LJIIIIZZ(this, aObserverS216S0100000_12);
                }
                hS().resetState();
            }
            this.LLIZ = null;
            this.LLIZLLLIL = null;
            this.LLJ = null;
            this.LLJI = null;
            this.LLJIJIL = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        PS(aS(), "");
    }

    public final String sS() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("video_from");
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean wS() {
        String string;
        if (yS()) {
            return true;
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("video_from")) != null) {
            switch (string.hashCode()) {
                case -386960448:
                    if (string.equals("from_repost_feed_entrance")) {
                        return true;
                    }
                    break;
                case -233309204:
                    if (string.equals("from_auto_message")) {
                        return true;
                    }
                    break;
                case -185728731:
                    if (string.equals("from_profile_other")) {
                        return true;
                    }
                    break;
                case 80178893:
                    if (string.equals("from_chat")) {
                        return true;
                    }
                    break;
                case 724168938:
                    if (string.equals("REPOSTED_LIST_ENTRANCE")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0SRi] */
    public static C721360SRi iS(Aweme aweme) {
        final String str;
        List<UpvoteStruct> list;
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        UpvoteList upvoteListLJIIIIZZ = c1360460lVU.LJIIIIZZ(aid);
        if (upvoteListLJIIIIZZ != null && (list = upvoteListLJIIIIZZ.upvotes) != null && list.size() > 1) {
            str = "quick_reply_repost_multiple";
        } else {
            str = "quick_reply_repost_single";
        }
        return new InterfaceC714750S1x(str) { // from class: X.0SRi
            public final String LIZ;
            public final String LIZIZ = "repost_history";

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C721360SRi)) {
                    return false;
                }
                C721360SRi c721360SRi = (C721360SRi) obj;
                return Intrinsics.LJFF(this.LIZ, c721360SRi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c721360SRi.LIZIZ);
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("QuickDMProfileRepostTabEventParam(interactionType=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", tabName=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC714750S1x
            public final Map<String, String> LIZ() {
                C13DA c13da = new C13DA();
                c13da.put("interaction_type", this.LIZ);
                c13da.put("tab_name", this.LIZIZ);
                return c13da.build();
            }

            {
                this.LIZ = str;
            }
        };
    }

    public static String mS(EnumC461080I6g enumC461080I6g) {
        int i = C892500Yzo.LIZIZ[enumC461080I6g.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "activity_repost_card";
            }
            throw new C1954807lC();
        }
        return "activity_post_card";
    }

    public static boolean zS(String str) {
        if ((!C286560BLa.LIZ() || !Intrinsics.LJFF(str, "from_profile_other")) && !Intrinsics.LJFF(str, "REPOSTED_LIST_ENTRANCE") && !Intrinsics.LJFF(str, "from_repost_feed_entrance")) {
            return false;
        }
        return true;
    }

    public final void BS(EnumC714720S1u enumC714720S1u) {
        if (this.LLJJJJJIL) {
            String enterFrom = getEnterFrom();
            if (enterFrom != null && C286560BLa.LIZ()) {
                C1336205Ku.LIZ(false).getQuickReplyAnalytics().LJ(enterFrom, "quick_reply_auto", "", null, C0I0B.LJFF.LIZIZ());
                return;
            }
            return;
        }
        if (this.LLJJJJLIIL) {
            C1336205Ku.LIZ(false).getQuickReplyAnalytics().LJ("profile_reposttab", "quick_reply_auto", "", null, C0I0B.LJFF.LIZIZ());
            return;
        }
        if (this.LLJJL) {
            C1336205Ku.LIZ(false).getQuickReplyAnalytics().LJ("repost_feed", "quick_reply_auto", "", null, C0I0B.LJFF.LIZIZ());
            return;
        }
        if (!yS()) {
            return;
        }
        InterfaceC714600S1i quickReplyAnalytics = C1336205Ku.LIZ(false).getQuickReplyAnalytics();
        String enterFrom2 = getEnterFrom();
        if (enterFrom2 == null) {
            enterFrom2 = "";
        }
        quickReplyAnalytics.LJ(enterFrom2, "quick_reply_auto", "", enumC714720S1u, C0I0B.LJFF.LIZIZ());
    }

    public final void HS(EnumC714710S1t enumC714710S1t) {
        String aid;
        Aweme awemeAS = aS();
        String str = "";
        if (C1375880luM.LIZLLL(awemeAS)) {
            aid = "";
        } else if (awemeAS != null) {
            aid = awemeAS.getAid();
        } else {
            aid = null;
        }
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            EnumC2172611A1b enumC2172611A1bLIZ = C897000ZGw.LIZ(WR());
            C0S2U c0s2u = this.LLJZ;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            if (aid != null) {
                str = aid;
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, str, this.LLJLLL, this.LLJLLIL, enumC714710S1t, C0I0B.LJFF.LIZIZ());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3 A[PHI: r2
      0x00e3: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v4 java.lang.String), (r2v4 java.lang.String), (r2v7 java.lang.String) binds: [B:8:0x0033, B:10:0x0037, B:12:0x003d, B:16:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NS(X.C0Y8T r12) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment.NS(X.0Y8T):void");
    }

    public final void SR(String str) {
        String string;
        int i;
        int i2;
        int i3;
        boolean z;
        TuxIconView tuxIconViewRS = rS();
        if (tuxIconViewRS == null) {
            return;
        }
        int iIntValue = 0;
        if (str != null) {
            int length = str.length() - 1;
            int i4 = 0;
            boolean z2 = false;
            while (i4 <= length) {
                if (!z2) {
                    i3 = i4;
                } else {
                    i3 = length;
                }
                if (Intrinsics.LJI(str.charAt(i3), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i4++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            string = str.subSequence(i4, length + 1).toString();
        } else {
            string = null;
        }
        boolean z3 = !TextUtils.isEmpty(string);
        boolean zIsActivated = tuxIconViewRS.isActivated();
        tuxIconViewRS.setActivated(z3);
        tuxIconViewRS.setEnabled(z3);
        Context context = getContext();
        if (context != null) {
            if (z3) {
                i2 = R.attr.a04;
            } else {
                i2 = R.attr.a2o;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(i2, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
        }
        if (z3) {
            i = R.attr.ee;
        } else {
            i = R.attr.c3;
        }
        tuxIconViewRS.getBackground().setTint(iIntValue);
        tuxIconViewRS.setTintColorRes(i);
        if (z3 && !zIsActivated) {
            C419820GdA.LIZ(tuxIconViewRS);
        }
    }

    public final void UR(View view) {
        int i;
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        if (C444960Hcc.LIZIZ()) {
            i = R.drawable.c_1;
        } else {
            i = R.drawable.c_0;
        }
        view.findViewById(R.id.kqv).setBackground(C800330VaR.LIZIZ(context, i));
    }

    @Override // X.InterfaceC913270ZsD
    public final void nm(String str) {
        long jLongValue;
        Long lLJIILIIL;
        this.LLJLILLLLZIIL = str;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null && lLJIILIIL.longValue() > 0) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = -1;
        }
        this.LLJJJ = jLongValue;
        NS(null);
        VR();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence text;
        if (!C1636506ax.LIZ(this) || C0OBG.LIZ(500L, view)) {
            return;
        }
        if (Intrinsics.LJFF(view, rS())) {
            if (C1636506ax.LIZ(this) && (text = nS().getText()) != null) {
                ES(text, false, false);
                nS().setText("");
                SR("");
                return;
            }
            return;
        }
        View viewFindViewById = null;
        EnumC714720S1u enumC714720S1u = null;
        if (Intrinsics.LJFF(view, nS())) {
            if (yS()) {
                enumC714720S1u = EnumC714720S1u.CLICK_INPUT_BOX;
            }
            BS(enumC714720S1u);
            GS();
            HS(EnumC714710S1t.CLICK_INPUT_BOX);
            return;
        }
        View view2 = this.LLJIJIL;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.h0n);
            }
            this.LLJIJIL = (TuxIconView) viewFindViewById;
            view2 = viewFindViewById;
        }
        if (!Intrinsics.LJFF(view, view2)) {
            return;
        }
        GS();
    }

    @Override // X.InterfaceC913270ZsD
    public final void wL(String str) {
        Long lLJIILIIL;
        this.LLJJIJIL = str;
        String str2 = this.LLJILJIL;
        if (str2 != null && str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            SendMessageViewModel sendMessageViewModelQS = qS();
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SendMessageViewModel.LLIZ;
            sendMessageViewModelQS.vQ2(jLongValue, str2, null);
        }
    }

    public static final String gS(DetailFeedReplyMessageFragment detailFeedReplyMessageFragment, C0ZGS c0zgs) {
        String string;
        switch (oS(detailFeedReplyMessageFragment, false).ordinal()) {
            case 0:
            case 1:
                IMSharePanelApi.LIZ.getClass();
                return C1599690rjL.LIZ().getShareService().LJ(detailFeedReplyMessageFragment.dS());
            case 2:
            case 7:
                DetailFeedDMViewModel detailFeedDMViewModelBS = detailFeedReplyMessageFragment.bS();
                Bundle arguments = detailFeedReplyMessageFragment.getArguments();
                if (arguments != null) {
                    string = arguments.getString("friends_v3_track_scene");
                } else {
                    string = null;
                }
                detailFeedDMViewModelBS.getClass();
                return DetailFeedDMViewModel.zQ2(c0zgs, string);
            case 3:
                return "quick_reply_auto";
            case 4:
                DetailFeedDMViewModel detailFeedDMViewModelBS2 = detailFeedReplyMessageFragment.bS();
                C869590Y9l c869590Y9l = detailFeedReplyMessageFragment.LLJJIJIIJIL;
                detailFeedDMViewModelBS2.getClass();
                if (C896400ZEo.LJI(c869590Y9l)) {
                    return "quick_reply_photoswap";
                }
                return "cell";
            case 5:
                return mS(EnumC461080I6g.RECENT_ACTIVITY_POST);
            case 6:
                return mS(EnumC461080I6g.RECENT_ACTIVITY_REPOST);
            case 8:
                IMSharePanelApi.LIZ.getClass();
                return C1599690rjL.LIZ().getShareService().LJ(EnumC896890ZGl.TYPE_SHARED_FEED);
            default:
                throw new C1954807lC();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        if (r1.equals("click_center_aweme_card") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0064, code lost:
    
        if (r1.equals("click_feed_dm_reply_msg") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006d, code lost:
    
        if (r1.equals("click_inline_dm_reply_msg") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        return X.EnumC896910ZGn.LLILZ;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC896910ZGn oS(com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment r3, boolean r4) {
        /*
            android.os.Bundle r2 = r3.getArguments()
            r1 = 0
            if (r2 == 0) goto Ld
            java.lang.String r0 = "enter_method"
            java.lang.String r1 = r2.getString(r0, r1)
        Ld:
            if (r4 == 0) goto L15
            r3.getClass()
            X.0ZGn r0 = X.EnumC896910ZGn.LL
            return r0
        L15:
            boolean r0 = r3.LLJJJJLIIL
            if (r0 == 0) goto L1c
            X.0ZGn r0 = X.EnumC896910ZGn.LLILLL
            return r0
        L1c:
            boolean r0 = r3.LLJJL
            if (r0 == 0) goto L23
            X.0ZGn r0 = X.EnumC896910ZGn.LLIZLLLIL
            return r0
        L23:
            boolean r0 = r3.LLJJJJJIL
            if (r0 == 0) goto L2a
            X.0ZGn r0 = X.EnumC896910ZGn.LLILLJJLI
            return r0
        L2a:
            boolean r0 = r3.yS()
            if (r0 == 0) goto L33
            X.0ZGn r0 = X.EnumC896910ZGn.LLJ
            return r0
        L33:
            if (r1 == 0) goto L3c
            int r0 = r1.hashCode()
            switch(r0) {
                case -1455774177: goto L3f;
                case -1442194651: goto L67;
                case -1271308613: goto L4a;
                case 1589472588: goto L53;
                case 1602520704: goto L5e;
                default: goto L3c;
            }
        L3c:
            X.0ZGn r0 = X.EnumC896910ZGn.LLILZIL
            return r0
        L3f:
            java.lang.String r0 = "activity_post_card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
            X.0ZGn r0 = X.EnumC896910ZGn.LLILZLL
            return r0
        L4a:
            java.lang.String r0 = "click_center_aweme_card"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6f
            goto L3c
        L53:
            java.lang.String r0 = "activity_repost_card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
            X.0ZGn r0 = X.EnumC896910ZGn.LLIZ
            return r0
        L5e:
            java.lang.String r0 = "click_feed_dm_reply_msg"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6f
            goto L3c
        L67:
            java.lang.String r0 = "click_inline_dm_reply_msg"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
        L6f:
            X.0ZGn r0 = X.EnumC896910ZGn.LLILZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment.oS(com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment, boolean):X.0ZGn");
    }

    public final void PS(Aweme aweme, String str) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLJILJIL);
        if (c0y8tLIZ != null && c0y8tLIZ.isSingleChat()) {
            if (Intrinsics.LJFF("", str)) {
                if (aweme != null) {
                    AwemeBizExtKt.setDmSenderUid(aweme, null);
                }
            } else {
                if (aweme == null) {
                    return;
                }
                AwemeBizExtKt.setDmSenderUid(aweme, str);
            }
        }
    }

    @Override // X.C0I08
    public final void YO(C0I0E c0i0e, String str) {
        String str2;
        if (C1636506ax.LIZ(this) && str != null) {
            if (wS()) {
                nS().setText("");
                SR("");
            } else {
                nS().setText(str);
            }
            SR(str);
        }
        if (!C300660BqS.LIZ()) {
            return;
        }
        if (c0i0e.isEligibleForDraft()) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLJILJIL);
            if (c0y8tLIZ == null) {
                return;
            }
            if (c0y8tLIZ.isSingleChat()) {
                hS().wQ2(String.valueOf(C0YNP.LJII(this.LLJILJIL)), str);
                return;
            } else {
                if (!c0y8tLIZ.isGroupChat() || (str2 = this.LLJILJIL) == null) {
                    return;
                }
                hS().wQ2(str2, str);
                return;
            }
        }
        hS().resetState();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011d A[PHI: r2
      0x011d: PHI (r2v47 boolean) = (r2v3 boolean), (r2v48 boolean) binds: [B:167:0x032a, B:69:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0185  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void ES(CharSequence charSequence, boolean z, boolean z2) {
        String string;
        String authorUid;
        String str;
        Integer numValueOf;
        String string2;
        IMContact iMContactLJI;
        int i;
        BaseHeader baseHeaderLIZ;
        String aid;
        Long lLJIILIIL;
        String uid;
        String strOptString;
        String authorUid2;
        C0ZGS c0zgs;
        String str2;
        String string3;
        C0ZGS c0zgs2;
        C0SZG c0szg;
        if (!z2 && (c0szg = this.LLJJJIL) != null) {
            c0szg.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.identityHashCode(this));
        sbLIZ.append('_');
        sbLIZ.append(this.LLJLILLLLZIIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean zLJJIJIL = false;
        EnumC896910ZGn enumC896910ZGnOS = oS(this, false);
        if (this.LLJJL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(System.identityHashCode(this));
            sbLIZ2.append('_');
            sbLIZ2.append(this.LLJLILLLLZIIL);
            if (!Intrinsics.LJFF(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2))) {
                return;
            }
        }
        int iOrdinal = enumC896910ZGnOS.ordinal();
        Long lLJIILIIL2 = null;
        String string4 = null;
        String secAuthorUid = null;
        String str3 = "";
        switch (iOrdinal) {
            case 0:
                return;
            case 1:
                Aweme awemeAS = aS();
                if (awemeAS == null) {
                    return;
                }
                DetailFeedDMViewModel detailFeedDMViewModelBS = bS();
                if (z) {
                    c0zgs2 = C0ZGS.EMOJI;
                } else {
                    c0zgs2 = C0ZGS.NONE;
                }
                boolean zWS = wS();
                String enterFrom = getEnterFrom();
                if (enterFrom == null) {
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        string4 = arguments.getString("video_from");
                    }
                } else {
                    string4 = enterFrom;
                }
                IMSharePanelApi.LIZ.getClass();
                String strLJ = C1599690rjL.LIZ().getShareService().LJ(dS());
                EnumC896890ZGl enumC896890ZGlDS = dS();
                detailFeedDMViewModelBS.getClass();
                InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                String string5 = charSequence.toString();
                User author = awemeAS.getAuthor();
                if (string4 != null) {
                    str3 = string4;
                }
                shareService.LJJJI(string5, author, awemeAS, str3, enumC896890ZGlDS, null, null, null, false, DetailFeedDMViewModel.yQ2(string4, strLJ, awemeAS, c0zgs2, enumC896890ZGlDS), null);
                if (!zWS || !c0zgs2.isQuickReply()) {
                    return;
                }
                detailFeedDMViewModelBS.setState(new AwS593S0100000_14(charSequence, 221));
                return;
            case 2:
            case 7:
                Aweme awemeAS2 = aS();
                if (awemeAS2 == null) {
                    return;
                }
                DetailFeedDMViewModel detailFeedDMViewModelBS2 = bS();
                if (z) {
                    c0zgs = C0ZGS.EMOJI;
                } else {
                    c0zgs = C0ZGS.NONE;
                }
                String str4 = this.LLJLILLLLZIIL;
                if (str4 != null) {
                    str3 = str4;
                }
                boolean zWS2 = wS();
                if (this.LLJJL) {
                    str2 = "repost_feed";
                } else {
                    str2 = "others_homepage";
                }
                C721360SRi c721360SRiIS = iS(awemeAS2);
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    string3 = arguments2.getString("friends_v3_track_scene");
                } else {
                    string3 = null;
                }
                String str5 = str3;
                C0ZG9 c0zg9 = new C0ZG9(charSequence, c0zgs, awemeAS2, str3, zWS2, str2, c721360SRiIS, string3);
                detailFeedDMViewModelBS2.getClass();
                IMContactApi.LIZ.getClass();
                IMUser iMUserLIZLLL = C069P.LIZ().LJ().LIZLLL(str3, null, "quick_dm_box");
                if (iMUserLIZLLL == null) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(detailFeedDMViewModelBS2), null, null, new C0ZGA(C23250099c.LIZIZ(C817503Hh.LL, C0PEM.LIZJ, null, new C0ZG8(c0zg9, null), 2), c0zg9, detailFeedDMViewModelBS2, null), 3);
                    return;
                }
                IMSharePanelApi.LIZ.getClass();
                InterfaceC1365380ldQ shareService2 = C1599690rjL.LIZ().getShareService();
                String string6 = charSequence.toString();
                EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_FRIENDS_PROFILE_REPOST_TAB;
                C0ZH0 c0zh0 = C0ZH0.REPOST;
                shareService2.LJJJIL(string6, iMUserLIZLLL, awemeAS2, str2, enumC896890ZGl, null, c0zh0, null, false, c721360SRiIS, null, DetailFeedDMViewModel.AQ2(detailFeedDMViewModelBS2, str2, c721360SRiIS, str5, c0zgs, awemeAS2, enumC896890ZGl, c0zh0, string3), null, null);
                if (!zWS2 || !c0zgs.isQuickReply()) {
                    return;
                }
                detailFeedDMViewModelBS2.setState(new AwS593S0100000_14(charSequence, 221));
                return;
            case 3:
                Aweme awemeAS3 = aS();
                if (awemeAS3 == null) {
                    return;
                }
                DetailFeedDMViewModel detailFeedDMViewModelBS3 = bS();
                C19EG c19egRequireActivity = requireActivity();
                String str6 = this.LLJILJIL;
                boolean zWS3 = wS();
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    authorUid2 = arguments3.getString("to_uid");
                } else {
                    authorUid2 = null;
                }
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    secAuthorUid = arguments4.getString("to_sec_uid");
                }
                detailFeedDMViewModelBS3.getClass();
                if (!C866950Xzh.LIZ(authorUid2)) {
                    authorUid2 = AwemeExtKt.getAuthorUid(awemeAS3);
                    secAuthorUid = AwemeExtKt.getSecAuthorUid(awemeAS3);
                }
                detailFeedDMViewModelBS3.setState(new AwS593S0100000_14((C0IAV) new C0IAU(charSequence, awemeAS3, authorUid2, secAuthorUid, str6, z), 222));
                detailFeedDMViewModelBS3.vQ2(c19egRequireActivity, charSequence, z, zWS3);
                return;
            case 4:
                DetailFeedDMViewModel detailFeedDMViewModelBS4 = bS();
                C19EG c19egRequireActivity2 = requireActivity();
                C869590Y9l c869590Y9l = this.LLJJIJIIJIL;
                String str7 = this.LLJILJIL;
                String str8 = this.LLJJIJIL;
                Bundle arguments5 = getArguments();
                if (arguments5 != null) {
                    string = arguments5.getString("video_from", null);
                } else {
                    string = null;
                }
                boolean zWS4 = wS();
                Aweme awemeAS4 = aS();
                if (awemeAS4 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(awemeAS4);
                } else {
                    authorUid = null;
                }
                Aweme awemeAS5 = aS();
                if (awemeAS5 != null) {
                    zLJJIJIL = C729510SjV.LJJIJIL(awemeAS5);
                }
                Aweme awemeAS6 = aS();
                detailFeedDMViewModelBS4.getClass();
                Map mapXQ2 = DetailFeedDMViewModel.xQ2(c869590Y9l, string, authorUid);
                if (C896400ZEo.LJI(c869590Y9l)) {
                    str = "quick_reply_photoswap";
                } else {
                    str = "cell";
                }
                if (awemeAS6 != null) {
                    numValueOf = Integer.valueOf(awemeAS6.getAwemeType());
                } else {
                    numValueOf = null;
                }
                if (!C1375880luM.LIZJ(numValueOf) && Intrinsics.LJFF(String.valueOf(C0YNP.LJII(str7)), authorUid)) {
                    str3 = zLJJIJIL ? z ? "story_reaction" : "story_reply" : z ? "post_reaction" : "post_reply";
                }
                if (str8 == null) {
                    detailFeedDMViewModelBS4.setState(new AwS593S0100000_14((C0IAV) new C0IAS(charSequence, str7, mapXQ2, str, new C0IAO(null), str3), 222));
                } else {
                    detailFeedDMViewModelBS4.setState(new AwS593S0100000_14((C0IAV) new C0IAT(charSequence, str7, str8, mapXQ2, str, str3), 222));
                }
                detailFeedDMViewModelBS4.vQ2(c19egRequireActivity2, charSequence, z, zWS4);
                return;
            case 5:
                FS(charSequence, EnumC461080I6g.RECENT_ACTIVITY_POST, z);
                return;
            case 6:
                FS(charSequence, EnumC461080I6g.RECENT_ACTIVITY_REPOST, z);
                return;
            case 8:
                Aweme awemeAS7 = aS();
                if (awemeAS7 == null) {
                    return;
                }
                DetailFeedDMViewModel detailFeedDMViewModelBS5 = bS();
                String str9 = this.LLJLILLLLZIIL;
                if (str9 == null) {
                    str9 = "";
                }
                String str10 = this.LLJILJIL;
                boolean zWS5 = wS();
                String enterFrom2 = getEnterFrom();
                String refreshTimeForSharedFeed = AwemeBizExtKt.getRefreshTimeForSharedFeed(awemeAS7);
                Bundle arguments6 = getArguments();
                if (arguments6 != null) {
                    string2 = arguments6.getString("vibe_feed_extra");
                } else {
                    string2 = null;
                }
                detailFeedDMViewModelBS5.getClass();
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str10);
                if (c0y8tLIZ == null) {
                    return;
                }
                boolean zLIZLLL = C1575980r76.LIZLLL(Boolean.valueOf(c0y8tLIZ.isGroupChat()));
                IMContactApi.LIZ.getClass();
                IMUser iMUserLIZLLL2 = C069P.LIZ().LJ().LIZLLL(str9, null, "quick_dm_box");
                if (iMUserLIZLLL2 == null && !zLIZLLL) {
                    return;
                }
                IIMContactUtilService.LIZ.getClass();
                IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                if (iIMContactUtilServiceLIZ == null || (iMContactLJI = iIMContactUtilServiceLIZ.LJI(c0y8tLIZ)) == null) {
                    return;
                }
                if (Intrinsics.LJFF(enterFrom2, "shared_feed_like_history")) {
                    i = 12;
                } else {
                    i = 11;
                }
                IVibeDMService iVibeDMService = (IVibeDMService) C1557990qe5.LIZLLL.getValue();
                if (iVibeDMService == null || (baseHeaderLIZ = iVibeDMService.LIZ(enterFrom2, zLIZLLL)) == null) {
                    return;
                }
                if (Intrinsics.LJFF(enterFrom2, "shared_feed_like_history")) {
                    if (string2 == null || (strOptString = new JSONObject(string2).optString("feed_id")) == null) {
                        strOptString = "";
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(awemeAS7.getAid());
                    sbLIZ3.append(',');
                    sbLIZ3.append(strOptString);
                    aid = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    aid = awemeAS7.getAid();
                }
                if (iMUserLIZLLL2 != null && (uid = iMUserLIZLLL2.getUid()) != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(uid);
                } else {
                    lLJIILIIL = null;
                }
                if (refreshTimeForSharedFeed != null) {
                    lLJIILIIL2 = C2095008Iq.LJIILIIL(refreshTimeForSharedFeed);
                }
                FeatureAttachmentContent featureAttachmentContent = new FeatureAttachmentContent(i, aid, lLJIILIIL, lLJIILIIL2, null);
                IMSharePanelApi.LIZ.getClass();
                InterfaceC1365380ldQ shareService3 = C1599690rjL.LIZ().getShareService();
                String string7 = charSequence.toString();
                if (enterFrom2 != null) {
                    str3 = enterFrom2;
                }
                shareService3.LJIILL(string7, iMUserLIZLLL2, iMContactLJI, awemeAS7, str3, EnumC896890ZGl.TYPE_SHARED_FEED, null, C0ZH0.SHARED_FEED, null, true, null, null, new LinkedHashMap(), featureAttachmentContent, baseHeaderLIZ);
                if (!zWS5 || !z) {
                    return;
                }
                detailFeedDMViewModelBS5.setState(new AwS593S0100000_14(charSequence, 221));
                return;
            default:
                throw new C1954807lC();
        }
    }

    public final void FS(CharSequence charSequence, EnumC461080I6g enumC461080I6g, boolean z) {
        LinkedHashMap linkedHashMap;
        BaseContent.ReferenceSceneType referenceSceneType;
        Map mapWQ2;
        Aweme awemeAS = aS();
        if (awemeAS == null) {
            return;
        }
        DetailFeedDMViewModel detailFeedDMViewModelBS = bS();
        C19EG c19egRequireActivity = requireActivity();
        String str = this.LLJILJIL;
        Bundle arguments = getArguments();
        String string = null;
        if (arguments != null) {
            string = arguments.getString("video_from", null);
        }
        String strMS = mS(enumC461080I6g);
        AwemeExtKt.getAuthorUid(awemeAS);
        boolean zWS = wS();
        detailFeedDMViewModelBS.getClass();
        if (string != null && (mapWQ2 = DetailFeedDMViewModel.wQ2(string)) != null) {
            linkedHashMap = new LinkedHashMap(mapWQ2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        int i = C892470Yzl.LIZ[enumC461080I6g.ordinal()];
        if (i != 1) {
            if (i == 2) {
                referenceSceneType = BaseContent.ReferenceSceneType.RECENT_ACTIVITY_REPOST;
            } else {
                throw new C1954807lC();
            }
        } else {
            referenceSceneType = BaseContent.ReferenceSceneType.RECENT_ACTIVITY_POST;
        }
        detailFeedDMViewModelBS.setState(new AwS593S0100000_14((C0IAV) new C0IAS(charSequence, str, linkedHashMap, strMS, new C0IAN(awemeAS, referenceSceneType), null), 222));
        detailFeedDMViewModelBS.vQ2(c19egRequireActivity, charSequence, z, zWS);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C19GS c19gs;
        long jUptimeMillis = SystemClock.uptimeMillis();
        DurationPerfMon.LIZ.LIZIZ(C451250Hml.LJ, true);
        if (wS()) {
            i = R.id.t7y;
        } else {
            i = R.id.t7w;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.chl, viewGroup, false);
        C786410Ut5.LJLLLL((ViewStub) viewTd.findViewById(i));
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        C913020Zro c913020Zro = C913060Zrs.LIZ;
        if (c913020Zro != null) {
            c913020Zro.LJIIL = jUptimeMillis2;
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
