package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.AbstractC468201s0;
import X.AnonymousClass0652;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0I08;
import X.C0NYY;
import X.C0S1B;
import X.C0ZCN;
import X.C0ZE7;
import X.C0ZH0;
import X.C0ZP4;
import X.C1076010e6h;
import X.C10EU;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C123100dR;
import X.C1243240iSQ;
import X.C1264070j01;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1336205Ku;
import X.C1355210lN1;
import X.C1355550lNZ;
import X.C1356790lPZ;
import X.C1357980lRU;
import X.C1357990lRV;
import X.C1358040lRa;
import X.C1358110lRh;
import X.C1358120lRi;
import X.C1358130lRj;
import X.C1358140lRk;
import X.C1358170lRn;
import X.C1358550lSP;
import X.C1358570lSR;
import X.C1358600lSU;
import X.C1358610lSV;
import X.C1358620lSW;
import X.C1358630lSX;
import X.C1358640lSY;
import X.C1358650lSZ;
import X.C1358690lSd;
import X.C1358770lSl;
import X.C1358940lT2;
import X.C1359030lTB;
import X.C1359720lUI;
import X.C1360460lVU;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C1402390mb7;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2211751BhN;
import X.C2215101Bmm;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C263730AVf;
import X.C298420Bmq;
import X.C298440Bms;
import X.C298730BnL;
import X.C298740BnM;
import X.C339190DRl;
import X.C416570GVb;
import X.C418440Gaw;
import X.C424430Gkb;
import X.C426020GnA;
import X.C426750GoL;
import X.C427660Gpo;
import X.C427690Gpr;
import X.C430840Guw;
import X.C431100GvM;
import X.C438710HIf;
import X.C444920HcY;
import X.C452080Ho6;
import X.C452501pT;
import X.C455830Hu9;
import X.C456970Hvz;
import X.C459530I0h;
import X.C459550I0j;
import X.C736680Sv4;
import X.C737760Swo;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.C897520ZIw;
import X.C946803n0;
import X.EnumC1606080rte;
import X.EnumC1606090rtf;
import X.EnumC1910440zoY;
import X.EnumC896890ZGl;
import X.InterfaceC0148002o;
import X.InterfaceC1358050lRb;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnLongClickListenerC1401890maJ;
import X.ViewOnLongClickListenerC1401960maQ;
import Y.AObserverS224S0100000_21;
import Y.ARunnableS0S3500000_21;
import Y.ARunnableS8S0102000_21;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.im.IMAIMojiSticker;
import com.ss.android.ugc.aweme.feed.model.upvote.CommentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostSharePanel;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import irm.AkS17S0000000_21;
import irm.AkS52S0200000_6;
import irm.AkS59S0200000_21;
import irm.AkS89S0100000_21;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvotePanelListCell extends PowerCell<C1358130lRj> implements InterfaceC724530SbT {
    public static final C1358640lSY LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final List<String> LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 909));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 910));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 912));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 926));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 923));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 927));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 907));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 924));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 932));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 936));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 931));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 919));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 908));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 934));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 933));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 847));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(350));
    public final AssemVMLazy LLJJIJI;
    public UpvotePanelListViewModel LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final String LLJJJ;
    public boolean LLJJJIL;
    public C1358600lSU LLJJJJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0lSY] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UpvotePanelListCell.class, "affinityVM", "getAffinityVM()Lcom/ss/android/ugc/aweme/upvote/detail/panel/RepostAffinityViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(UpvotePanelListCell.class, "panelVm", "getPanelVm()Lcom/ss/android/ugc/aweme/upvote/detail/panel/RepostPanelViewModel;", 0)};
        LLJJJJJIL = new Object() { // from class: X.0lSY
        };
        LLJJL = C1697810uHb.LJIIJJI("ar", "en", "en-GB", "es", "es-419", "fr", "fr-CA", "ja-JP", "ko-KR", "sq", "th-TH", "vi-VN", "ca", "ceb-PH", "fil-PH", "he-IL", "hu-HU", "is", "jv-ID", "kk", "nl-NL", "ro-RO", "zh-Hant-TW", "zh-Hans");
        LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
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

    public UpvotePanelListCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostAffinityViewModel.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 846);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(248);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 917), awS550S0100000_6, AFwS209S0000000_21.get$arr$(356), new AwS550S0100000_6((C03K6) this, 830), new AwS550S0100000_6((C03K6) this, 839), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 918), aFwS259S0000000_21, new AwS550S0100000_6((C03K6) this, 844), null, new AwS550S0100000_6((C03K6) this, 845));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6((C03K6) this, 827);
            AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 914);
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(c19719912DlLIZ, 915);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS550S0100000_62, 60));
            AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 833);
            AwS550S0100000_6 awS550S0100000_64 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 835);
            AwS550S0100000_6 awS550S0100000_65 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 838);
            AwS550S0100000_6 awS550S0100000_66 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 840);
            AwS550S0100000_6 awS550S0100000_67 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 842);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_212, awS550S0100000_6, new C452080Ho6(), awS550S0100000_63, awS550S0100000_64, awS565S0100000_21, aFwS259S0000000_21, awS550S0100000_65, awS550S0100000_66, awS550S0100000_67);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 920), awS550S0100000_6, AFwS209S0000000_21.get$arr$(354), new AwS550S0100000_6((C03K6) this, 848), new AwS550S0100000_6((C03K6) this, 850), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 928), aFwS259S0000000_21, new AwS550S0100000_6((C03K6) this, 853), null, new AwS550S0100000_6((C03K6) this, 855));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 929), awS550S0100000_6, AFwS209S0000000_21.get$arr$(357), new AwS550S0100000_6((C03K6) this, 857), new AwS550S0100000_6((C03K6) this, 858), new AwS550S0100000_6((C03K6) this, 861), aFwS259S0000000_21, null, null, new AwS550S0100000_6((C03K6) this, 823));
        }
        this.LLJJIJI = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RepostPanelViewModel.class);
        AwS550S0100000_6 awS550S0100000_68 = new AwS550S0100000_6(c19719912DlLIZ2, 825);
        AFwS259S0000000_21 aFwS259S0000000_212 = AFwS259S0000000_21.get$arr$(247);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ2, 913), awS550S0100000_68, AFwS209S0000000_21.get$arr$(353), new AwS550S0100000_6((C03K6) this, 829), new AwS550S0100000_6((C03K6) this, 831), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 916), aFwS259S0000000_212, new AwS550S0100000_6((C03K6) this, 836), null, new AwS550S0100000_6((C03K6) this, 841));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_69 = new AwS550S0100000_6((C03K6) this, 843);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 921);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ2, 922);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS550S0100000_69, 62));
            AwS550S0100000_6 awS550S0100000_610 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 849);
            AwS550S0100000_6 awS550S0100000_611 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 851);
            AwS550S0100000_6 awS550S0100000_612 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 852);
            AwS550S0100000_6 awS550S0100000_613 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 854);
            AwS550S0100000_6 awS550S0100000_614 = new AwS550S0100000_6(c01gwLIZIZ2, (C01GW<C456970Hvz>) 856);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS565S0100000_214, awS550S0100000_68, new C452080Ho6(), awS550S0100000_610, awS550S0100000_611, awS565S0100000_213, aFwS259S0000000_212, awS550S0100000_612, awS550S0100000_613, awS550S0100000_614);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ2, 930), awS550S0100000_68, AFwS209S0000000_21.get$arr$(358), new AwS550S0100000_6((C03K6) this, 859), new AwS550S0100000_6((C03K6) this, 860), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 935), aFwS259S0000000_212, new AwS550S0100000_6((C03K6) this, 824), null, new AwS550S0100000_6((C03K6) this, 826));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ2, 911), awS550S0100000_68, AFwS209S0000000_21.get$arr$(352), new AwS550S0100000_6((C03K6) this, 828), new AwS550S0100000_6((C03K6) this, 832), new AwS550S0100000_6((C03K6) this, 834), aFwS259S0000000_212, null, null, new AwS550S0100000_6((C03K6) this, 837));
        }
        this.LLJJIJIL = assemVMLazy2;
        this.LLJJJ = "repost_list";
    }

    public final void C6() {
        C1358130lRj item;
        UpvoteStruct upvoteStruct;
        User user;
        C19EG c19egLIZIZ;
        String strLIZLLL;
        String str;
        String string;
        String string2;
        VideoItemParams videoItemParams;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        String tabName;
        UpvoteStruct upvoteStruct2;
        List<? extends TextExtraStruct> list;
        String string3;
        UpvoteStruct upvoteStruct3;
        List<? extends TextExtraStruct> list2;
        UpvoteStruct upvoteStruct4;
        VideoItemParams videoItemParams2;
        UpvoteStruct upvoteStruct5;
        User user2;
        UpvoteStruct upvoteStruct6;
        UpvoteStruct upvoteStruct7;
        VideoItemParams videoItemParams3;
        Aweme awemeA6 = a6();
        if (awemeA6 == null || (item = getItem()) == null || (upvoteStruct = item.LL) == null || (user = upvoteStruct.user) == null || (c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext())) == null) {
            return;
        }
        FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
        C1358130lRj item2 = getItem();
        String str2 = (item2 == null || (videoItemParams3 = item2.LLILLJJLI) == null) ? null : videoItemParams3.mEventType;
        String strF6 = f6();
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParamsB6 = b6();
        String str3 = videoItemParamsB6 != null ? videoItemParamsB6.mEventType : null;
        String uid = user.getUid();
        String str4 = "";
        if (uid == null) {
            uid = "";
        }
        C1358130lRj item3 = getItem();
        if (item3 == null || (upvoteStruct7 = item3.LL) == null || (strLIZLLL = C1359720lUI.LIZLLL(upvoteStruct7)) == null) {
            strLIZLLL = "";
        }
        C1358130lRj item4 = getItem();
        IMAIMojiSticker iMAIMojiStickerLIZJ = (item4 == null || (upvoteStruct6 = item4.LL) == null) ? null : C1359720lUI.LIZJ(upvoteStruct6);
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("enter_method", "recommend_panel");
        c2344009Gk.LJIIIIZZ("group_id", awemeA6.getAid());
        User author = awemeA6.getAuthor();
        c2344009Gk.LJIIIIZZ("author_id", author != null ? author.getUid() : null);
        c2344009Gk.LIZJ(0, "input_style");
        c2344009Gk.LIZJ(C424430Gkb.LIZ() ? 1 : 0, "is_ai_emoji");
        c2344009Gk.LJIIIIZZ("repost_user_id", uid);
        c2344009Gk.LIZJ(strLIZLLL.length(), "repost_length");
        C1358170lRn.LIZIZ(c2344009Gk, iMAIMojiStickerLIZJ);
        C20684815ws.LJIILLIIL("enter_repost_dm_input", c2344009Gk.LIZ);
        Aweme awemeA62 = a6();
        String aid = awemeA62 != null ? awemeA62.getAid() : null;
        C1358130lRj item5 = getItem();
        String str5 = C1358620lSW.LIZ(aid, (item5 == null || (upvoteStruct5 = item5.LL) == null || (user2 = upvoteStruct5.user) == null) ? null : user2.getUid()) ? "quick_reply_to_im" : "im";
        C1358130lRj item6 = getItem();
        C1358550lSP.LJIILIIL(c1358550lSP, (item6 == null || (videoItemParams2 = item6.LLILLJJLI) == null) ? null : videoItemParams2.mEventType, f6(), a6(), str5, null, null, null, null, null, null, d6(), 1008);
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        VideoItemParams videoItemParamsB62 = b6();
        if (videoItemParamsB62 == null || (str = videoItemParamsB62.mEventType) == null) {
            str = "";
        }
        C1355550lNZ c1355550lNZ = new C1355550lNZ(str2, strF6, user, awemeA6, this);
        EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_REPOST_PANEL;
        C0I08 c0i08 = new C0I08() { // from class: X.0I0i
            @Override // X.C0I08
            public final void YO(C0I0E c0i0e, String str6) {
            }

            @Override // X.C0I08
            public final void TG() {
                C19EG c19egLIZIZ2;
                FragmentManager supportFragmentManager2;
                Fragment fragmentLJJJJZI;
                Context context = this.LL.itemView.getContext();
                if (context == null || (c19egLIZIZ2 = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager2 = c19egLIZIZ2.getSupportFragmentManager()) == null || (fragmentLJJJJZI = supportFragmentManager2.LJJJJZI("UpvotePanel")) == null || !(fragmentLJJJJZI instanceof DialogFragment)) {
                    return;
                }
                ((DialogFragment) fragmentLJJJJZI).dismiss();
            }
        };
        C0ZH0 c0zh0 = C0ZH0.REPOST;
        C459530I0h c459530I0h = new C459530I0h(C455830Hu9.LIZ);
        AttachmentTypeComponent attachmentTypeComponent = AttachmentTypeComponent.ATTACHMENT_TYPE_REPLY_REPOST;
        C1358130lRj item7 = getItem();
        String str6 = CardStruct.IStatusCode.DEFAULT;
        if (item7 == null || (upvoteStruct4 = item7.LL) == null || (string = Integer.valueOf(C1359720lUI.LJ(upvoteStruct4) ? 1 : 0).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        C1358130lRj item8 = getItem();
        if (item8 == null || (upvoteStruct3 = item8.LL) == null || (list2 = upvoteStruct3.textExtra) == null || (string2 = Integer.valueOf(list2.size()).toString()) == null) {
            string2 = CardStruct.IStatusCode.DEFAULT;
        }
        C1358130lRj item9 = getItem();
        if (item9 != null && (upvoteStruct2 = item9.LL) != null && (list = upvoteStruct2.textExtra) != null && (string3 = Integer.valueOf(C1358170lRn.LJ(list)).toString()) != null) {
            str6 = string3;
        }
        C1358130lRj item10 = getItem();
        if (item10 != null && (videoItemParams = item10.LLILLJJLI) != null && (baseFeedPageParams = videoItemParams.baseFeedPageParams) != null && (c2189821An6 = baseFeedPageParams.param) != null && (tabName = c2189821An6.getTabName()) != null) {
            str4 = tabName;
        }
        imChatService.LJIILL(c19egLIZIZ, supportFragmentManager, user, awemeA6, str, null, c1355550lNZ, null, enumC896890ZGl, null, c0i08, c0zh0, null, null, c459530I0h, attachmentTypeComponent, new C0ZCN(string, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, string2, str6, str4, i6()));
    }

    public final C0ZE7 V5() {
        String str;
        UpvoteStruct upvoteStruct;
        User user;
        VideoItemParams videoItemParams;
        C0ZE7 c0ze7 = new C0ZE7(this);
        c0ze7.LIZIZ(EnumC1910440zoY.REPOST_PANEL);
        C1358130lRj item = getItem();
        if (item == null || (videoItemParams = item.LLILLJJLI) == null || (str = videoItemParams.mEventType) == null) {
            str = "";
        }
        c0ze7.LIZLLL = str;
        c0ze7.LJII = Boolean.valueOf(this.LLJJJIL);
        C1358130lRj item2 = getItem();
        c0ze7.LIZJ = (item2 == null || (upvoteStruct = item2.LL) == null || (user = upvoteStruct.user) == null) ? null : user.getUid();
        c0ze7.LJFF = "profile";
        return c0ze7;
    }

    public final List<String> W5() {
        MutableLiveData<UpvoteList> mutableLiveDataWQ2;
        UpvoteList value;
        UpvotePanelListViewModel upvotePanelListViewModel = this.LLJJIJIIJIL;
        List<String> list = (upvotePanelListViewModel == null || (mutableLiveDataWQ2 = upvotePanelListViewModel.wQ2()) == null || (value = mutableLiveDataWQ2.getValue()) == null) ? null : value.emojis;
        return (list == null || list.isEmpty()) ? C424430Gkb.LIZ : list;
    }

    public final String f6() {
        String str;
        UpvotePanelListViewModel upvotePanelListViewModel = this.LLJJIJIIJIL;
        return (upvotePanelListViewModel == null || (str = upvotePanelListViewModel.LL) == null) ? "click_recommend_avatar" : str;
    }

    public final RepostPanelViewModel h6() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (RepostPanelViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        UpvotePanelListViewModel upvotePanelListViewModel;
        LiveData liveData;
        C19EG c19egLIZIZ;
        super.onItemViewCreated();
        int i = 0;
        if (C263730AVf.LIZ()) {
            r6().setTuxFont(41);
            TuxTextView tuxTextViewR6 = r6();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1i, r6().getContext());
            tuxTextViewR6.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        }
        ((TuxTextView) this.itemView.findViewById(R.id.zym)).setTuxFont(102);
        if (!C1358690lSd.LIZ() && (c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext())) != null) {
            UpvotePanelListViewModel.LLJJIJI.getClass();
            this.LLJJIJIIJIL = C1358120lRi.LIZ(c19egLIZIZ);
        }
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            TuxTextView tuxTextView = new TuxTextView(this.itemView.getContext(), null, 6, i);
            tuxTextView.setTuxFont(91);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388659;
            ViewGroup viewGroup = (ViewGroup) this.LLIZ.getValue();
            if ((viewGroup instanceof ViewGroup) && viewGroup != null) {
                viewGroup.addView(tuxTextView, layoutParams);
            }
            AssemVMLazy assemVMLazy = this.LLJJIJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0196
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C00XF) obj).LL);
                }
            }, null, new AwS456S0200000_21(tuxTextView, this, 12), 6);
        }
        C2211751BhN.LIZ(this.itemView, new C1402390mb7(this, 3));
        C427690Gpr.LIZLLL(this.itemView, 0);
        C897520ZIw c897520ZIwU5 = U5();
        if (c897520ZIwU5 != null) {
            c897520ZIwU5.LIZIZ(true, new C0NYY() { // from class: X.0lQf
                @Override // X.C0NYY
                public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    String uid;
                    C1358130lRj item = this.LL.getItem();
                    if (item != null) {
                        User user = item.LL.user;
                        if (user != null) {
                            uid = user.getUid();
                        } else {
                            uid = null;
                        }
                        C595660NXw c595660NXw = map.get(uid);
                        if (c595660NXw != null) {
                            this.LL.LLJJJIL = C896480ZEw.LIZJ(c595660NXw);
                            return Unit.LIZ;
                        }
                    }
                    return Unit.LIZ;
                }
            });
        }
        AvatarComponentView avatarComponentViewQ6 = q6();
        C1608750rxx config = avatarComponentViewQ6.getConfig();
        config.LIZLLL(new C737760Swo(new C1606750ruj(EnumC1606080rte.REPOST_PANEL, new C1606770rul(null, null, null, null, new AwS565S0100000_21(this, 1221), null, null, null, null, 495), 4)), new C1607280rva(new C1607310rvd(EnumC1606090rtf.REPOST_PANEL, V5(), false, false, U5(), 110)));
        config.LIZ(AFwS259S0000000_21.get$arr$(333));
        new AwS600S0100000_21(this, 248).invoke(config.LIZJ);
        avatarComponentViewQ6.LJFF(avatarComponentViewQ6.getConfig());
        this.LLJJJJ = new C1358600lSU((C1358650lSZ) this.LLJJ.getValue(), (RelationButton) this.LLJIJIL.getValue(), (TuxTextView) this.LLJILLL.getValue(), (TuxIconView) this.LLJILJIL.getValue(), (TuxIconView) this.LLJILJILJ.getValue());
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        if (fragmentLIZ == null || (upvotePanelListViewModel = this.LLJJIJIIJIL) == null || (liveData = (LiveData) upvotePanelListViewModel.LLILZLL.getValue()) == null) {
            return;
        }
        liveData.observe(fragmentLIZ, new AObserverS224S0100000_21(this, 48));
    }

    public final AvatarComponentView q6() {
        return (AvatarComponentView) this.LLILLJJLI.getValue();
    }

    public final TuxTextView r6() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    public final C897520ZIw U5() {
        if (C1358690lSd.LIZ()) {
            return (C897520ZIw) h6().LLJ.getValue();
        }
        UpvotePanelListViewModel upvotePanelListViewModel = this.LLJJIJIIJIL;
        if (upvotePanelListViewModel != null) {
            return (C897520ZIw) upvotePanelListViewModel.LLJ.getValue();
        }
        return null;
    }

    public final String X5() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        UpvoteStruct upvoteStruct;
        User user;
        UpvoteStruct upvoteStruct2;
        User user2;
        UpvoteStruct upvoteStruct3;
        User user3;
        C1358130lRj item = getItem();
        String uid = null;
        Integer numValueOf = (item == null || (upvoteStruct3 = item.LL) == null || (user3 = upvoteStruct3.user) == null) ? null : Integer.valueOf(user3.getFollowStatus());
        C1358130lRj item2 = getItem();
        Integer numValueOf2 = (item2 == null || (upvoteStruct2 = item2.LL) == null || (user2 = upvoteStruct2.user) == null) ? null : Integer.valueOf(user2.getFollowerStatus());
        C1358130lRj item3 = getItem();
        if (item3 != null && (upvoteStruct = item3.LL) != null && (user = upvoteStruct.user) != null) {
            uid = user.getUid();
        }
        String str = "";
        if (C10EU.LJIIZILJ(uid)) {
            List<String> list = LLJJL;
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
            if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
                C844470XAv.LIZ.getClass();
                String strLJIJJ = i18nManagerServiceApiLIZ.LJIJJ(C844470XAv.LIZ());
                if (strLJIJJ != null) {
                    str = strLJIJJ;
                }
            }
            return !list.contains(str) ? "dot" : "reposted";
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return "plane";
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 1) {
                return "plane";
            }
            if (numValueOf.intValue() == 4) {
                return "follow_requested";
            }
        }
        return (numValueOf2 == null || numValueOf2.intValue() != 1) ? "" : "follow_back";
    }

    public final Aweme a6() {
        if (C1358690lSd.LIZ()) {
            return h6().LLILLJJLI;
        }
        UpvotePanelListViewModel upvotePanelListViewModel = this.LLJJIJIIJIL;
        if (upvotePanelListViewModel != null) {
            return upvotePanelListViewModel.LLJIJIL;
        }
        return null;
    }

    public final VideoItemParams b6() {
        if (C1358690lSd.LIZ()) {
            return h6().LLILLL;
        }
        UpvotePanelListViewModel upvotePanelListViewModel = this.LLJJIJIIJIL;
        if (upvotePanelListViewModel != null) {
            return upvotePanelListViewModel.LLJI;
        }
        return null;
    }

    public final UpvoteList c6() {
        MutableLiveData<UpvoteList> mutableLiveDataWQ2;
        if (C1358690lSd.LIZ()) {
            return h6().LL;
        }
        UpvotePanelListViewModel upvotePanelListViewModel = this.LLJJIJIIJIL;
        if (upvotePanelListViewModel == null || (mutableLiveDataWQ2 = upvotePanelListViewModel.wQ2()) == null) {
            return null;
        }
        return mutableLiveDataWQ2.getValue();
    }

    public final String d6() {
        UpvoteStruct upvoteStruct;
        CommentInfoStruct commentInfoStruct;
        Comment comment;
        C1358130lRj item = getItem();
        String cid = null;
        return (item == null || !item.LIZ() || (upvoteStruct = item.LLILZ) == null || !((commentInfoStruct = upvoteStruct.commentInfo) == null || (comment = commentInfoStruct.comment) == null || (cid = comment.getCid()) == null || cid.length() <= 0)) ? cid : upvoteStruct.carrierId;
    }

    public final ILightInteractionPlatformService e6() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    public final String i6() {
        C1358130lRj item = getItem();
        UpvoteStruct upvoteStruct = item != null ? item.LL : null;
        C1358130lRj item2 = getItem();
        boolean z = false;
        if (item2 != null && item2.LIZ()) {
            z = true;
        }
        return C1356790lPZ.LIZ(upvoteStruct, z);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C897520ZIw c897520ZIwU5 = U5();
        if (c897520ZIwU5 != null) {
            c897520ZIwU5.destroy();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Integer numLIZJ;
        super.onViewAttachedToWindow();
        C1358130lRj item = getItem();
        if (item == null || !item.LLILLL || (numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, this.itemView.getContext())) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.uk, this.itemView.getContext());
        if (numLIZJ2 != null) {
            HandlerHook.viewPostDelay(this.itemView, new ARunnableS8S0102000_21(this, iIntValue, numLIZJ2.intValue(), 3), 150L);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C897520ZIw c897520ZIwU5 = U5();
        if (c897520ZIwU5 != null) {
            c897520ZIwU5.LJII();
        }
    }

    public final void D6(String str) {
        UpvoteStruct upvoteStruct;
        boolean z;
        String str2;
        boolean z2;
        VideoItemParams videoItemParams;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        String tabName;
        VideoItemParams videoItemParams2;
        List<UpvoteStruct> list;
        C1358130lRj item = getItem();
        if (item != null && (upvoteStruct = item.LL) != null) {
            C1355210lN1 c1355210lN1 = RepostSharePanel.LLJLILLLLZIIL;
            Aweme awemeA6 = a6();
            UpvoteList upvoteListC6 = c6();
            if (upvoteListC6 != null && (list = upvoteListC6.upvotes) != null && list.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            C1358130lRj item2 = getItem();
            String str3 = "";
            if (item2 == null || (videoItemParams2 = item2.LLILLJJLI) == null || (str2 = videoItemParams2.mEventType) == null) {
                str2 = "";
            }
            C1358130lRj item3 = getItem();
            if (item3 != null && (videoItemParams = item3.LLILLJJLI) != null && (baseFeedPageParams = videoItemParams.baseFeedPageParams) != null && (c2189821An6 = baseFeedPageParams.param) != null && (tabName = c2189821An6.getTabName()) != null) {
                str3 = tabName;
            }
            Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
            C1358130lRj item4 = getItem();
            if (item4 != null && item4.LIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1355210lN1.getClass();
            C1355210lN1.LIZ(awemeA6, upvoteStruct, null, z, str2, str3, str, null, null, null, fragmentLIZ, z2);
        }
    }

    public final void I5(UpvoteStruct upvoteStruct) {
        boolean z;
        UpvoteStruct upvoteStruct2;
        IMAIMojiSticker iMAIMojiStickerLIZJ;
        StickerUrlStruct stickerUrlStruct;
        UrlModel urlModel;
        List<String> urlList;
        C1358130lRj item;
        UpvoteStruct upvoteStruct3;
        StickerUrlStruct stickerUrlStruct2;
        UrlModel urlModel2;
        if (C1359030lTB.LIZ() != 3) {
            z = true;
        } else {
            z = false;
        }
        if (z && (iMAIMojiStickerLIZJ = C1359720lUI.LIZJ(upvoteStruct)) != null && (stickerUrlStruct = iMAIMojiStickerLIZJ.stickerUrl) != null && (urlModel = stickerUrlStruct.midResolutionUrl) != null && AnonymousClass0652.LIZ(urlModel.getUri()) && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty()) && (item = getItem()) != null && (upvoteStruct3 = item.LL) != null) {
            C1358770lSl.LIZ.getClass();
            if (!C1358770lSl.LJ(upvoteStruct3)) {
                C786410Ut5.g(q6(), 8);
                C786410Ut5.K1((C426020GnA) this.LLILLL.getValue(), 0);
                IMAIMojiSticker iMAIMojiSticker = upvoteStruct.aiMojiSticker;
                if (iMAIMojiSticker != null && (stickerUrlStruct2 = iMAIMojiSticker.stickerUrl) != null && (urlModel2 = stickerUrlStruct2.midResolutionUrl) != null) {
                    ((C426020GnA) this.LLILLL.getValue()).LJIIIIZZ(C438710HIf.LIZ(urlModel2));
                    C786410Ut5.I7(new AkS52S0200000_6(this, upvoteStruct, 7), (View) this.LLILLL.getValue());
                    ((View) this.LLILLL.getValue()).setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 3));
                    return;
                }
                return;
            }
        }
        C786410Ut5.g(q6(), 0);
        C786410Ut5.K1((C426020GnA) this.LLILLL.getValue(), 8);
        User user = upvoteStruct.user;
        C897520ZIw c897520ZIwU5 = U5();
        if (c897520ZIwU5 != null) {
            c897520ZIwU5.LJ();
        }
        if (user != null) {
            AvatarComponentView avatarComponentViewQ6 = q6();
            String uid = user.getUid();
            if (uid == null) {
                uid = "";
            }
            C0S1B.LIZ(avatarComponentViewQ6, uid, user, this, false, null, 56);
            C427660Gpo.LJIIJJI(q6().getAvatar(), C438710HIf.LIZ(user.getAvatarThumb()), false, null, null, false, false, null, null, false, null, 1022);
            C1358130lRj item2 = getItem();
            if (item2 != null && (upvoteStruct2 = item2.LL) != null) {
                C1358770lSl.LIZ.getClass();
                if (C1358770lSl.LJ(upvoteStruct2)) {
                    C1358550lSP.LIZ.getClass();
                    C20684815ws.LJIJI("ttk_upvote_panel_has_maf", new Pair(1, "has_maf"));
                }
            }
        }
        C786410Ut5.I7(new AkS89S0100000_21(this, 20), q6());
        q6().setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 3));
    }

    public final void N5(C1358130lRj c1358130lRj) {
        UpvoteStruct upvoteStruct;
        if (C1358690lSd.LIZ() && (C1358690lSd.LIZIZ() & 2) != 2) {
            C1358770lSl c1358770lSl = C1358770lSl.LIZ;
            UpvoteStruct upvoteStruct2 = c1358130lRj.LL;
            c1358770lSl.getClass();
            if (C1358770lSl.LJ(upvoteStruct2)) {
                C339190DRl.LIZIZ(r6());
                return;
            }
        }
        if (C263730AVf.LIZ()) {
            C1358770lSl c1358770lSl2 = C1358770lSl.LIZ;
            UpvoteStruct upvoteStruct3 = c1358130lRj.LL;
            c1358770lSl2.getClass();
            L5(c1358130lRj.LL, C1358770lSl.LJ(upvoteStruct3));
            return;
        }
        getItem();
        C1358130lRj item = getItem();
        if (item != null && (upvoteStruct = item.LL) != null) {
            long j = upvoteStruct.createTime;
            if (j <= 1514736000) {
                r6().getVisibility();
            } else {
                if (r6().getVisibility() != 0) {
                    C786410Ut5.LLLLZLL(r6(), 0);
                }
                C426750GoL.LJIIL(r6(), 0, null, 0, null, 26);
                r6().setText(C2215101Bmm.LJ(TimeUnit.SECONDS.toMillis(j)));
            }
        } else {
            C786410Ut5.LLLLZLL(r6(), 8);
        }
        r6().setBackground(null);
    }

    public final void P5(C1358130lRj c1358130lRj) {
        String string;
        Comment comment;
        final String strLIZ;
        UrlModel avatarThumb;
        UpvoteStruct upvoteStruct;
        List<? extends TextExtraStruct> list;
        int iLJJJ;
        int iIntValue;
        UpvoteStruct upvoteStruct2 = c1358130lRj.LLILZ;
        if (upvoteStruct2 == null) {
            View view = (View) this.LLJJI.getValue();
            if (view != null) {
                C339190DRl.LIZIZ(view);
                return;
            }
            return;
        }
        String str = upvoteStruct2.text;
        boolean zLIZ = C1360460lVU.LIZIZ.LIZ();
        C339190DRl.LIZLLL(r6());
        int iIntValue2 = 0;
        if (C123100dR.LIZ(str) && zLIZ) {
            string = this.itemView.getContext().getString(2131846407, str);
        } else {
            string = this.itemView.getContext().getString(2131846408);
        }
        C430840Guw c430840Guw = C430840Guw.LIZ;
        Context context = this.itemView.getContext();
        Long lValueOf = Long.valueOf(upvoteStruct2.createTime);
        c430840Guw.getClass();
        CharSequence charSequenceLIZ = C430840Guw.LIZ(context, lValueOf, string);
        if (zLIZ && C123100dR.LIZ(str) && (list = upvoteStruct2.textExtra) != null && !list.isEmpty() && C298740BnM.LIZ() && (iLJJJ = a0.LJJJ(string, str, 0, false, 6)) >= 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceLIZ);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ba, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            InterfaceC1358050lRb interfaceC1358050lRb = new InterfaceC1358050lRb() { // from class: X.0lRd
                @Override // X.InterfaceC1358050lRb
                public final void LIZ(TextExtraStruct textExtraStruct) {
                    String userId;
                    UpvoteStruct upvoteStruct3;
                    String tabName;
                    VideoItemParams videoItemParams;
                    BaseFeedPageParams baseFeedPageParams;
                    C2189821An6 c2189821An6;
                    C1358110lRh c1358110lRh = C1358110lRh.LIZ;
                    Activity activityLIZ = C1388190mED.LIZ(this.LIZ.itemView.getContext());
                    String str2 = null;
                    if (textExtraStruct != null) {
                        userId = textExtraStruct.getUserId();
                    } else {
                        userId = null;
                    }
                    C1358130lRj item = this.LIZ.getItem();
                    if (item != null) {
                        upvoteStruct3 = item.LL;
                    } else {
                        upvoteStruct3 = null;
                    }
                    VideoItemParams videoItemParamsB6 = this.LIZ.b6();
                    if (videoItemParamsB6 != null) {
                        str2 = videoItemParamsB6.mEventType;
                    }
                    C1358130lRj item2 = this.LIZ.getItem();
                    if (item2 == null || (videoItemParams = item2.LLILLJJLI) == null || (baseFeedPageParams = videoItemParams.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
                        tabName = "";
                    }
                    c1358110lRh.getClass();
                    C1358110lRh.LIZ(activityLIZ, userId, upvoteStruct3, str2, "repost_panel_mention", tabName);
                    this.LIZ.u6("mention");
                }
            };
            List<? extends TextExtraStruct> list2 = upvoteStruct2.textExtra;
            if (list2 != null) {
                for (TextExtraStruct textExtraStruct : list2) {
                    int start = textExtraStruct.getStart() + iLJJJ;
                    int end = textExtraStruct.getEnd() + iLJJJ;
                    if (start >= 0 && end <= spannableStringBuilder.length() && start < end) {
                        C786410Ut5.q2(spannableStringBuilder, new C1358040lRa(interfaceC1358050lRb, iIntValue, textExtraStruct), start, end, 33);
                    }
                }
            }
            r6().setText(spannableStringBuilder);
        } else {
            r6().setText(charSequenceLIZ);
        }
        if (c1358130lRj.LIZ()) {
            r6().setMovementMethod(new C431100GvM(new AwS422S0200000_21(this, c1358130lRj, 61), new AwS387S0200000_21(this, c1358130lRj, 39)));
        }
        r6().setTuxFont(51);
        TuxTextView tuxTextViewR6 = r6();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1i, r6().getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        tuxTextViewR6.setTextColor(iIntValue2);
        r6().setBackground(null);
        final TuxTextView tuxTextView = (TuxTextView) this.LLJJI.getValue();
        if (tuxTextView == null) {
            return;
        }
        C339190DRl.LIZLLL(tuxTextView);
        CommentInfoStruct commentInfoStruct = upvoteStruct2.commentInfo;
        if (commentInfoStruct != null && (comment = commentInfoStruct.comment) != null) {
            User user = comment.getUser();
            if (user != null) {
                C1243240iSQ.LIZ.getClass();
                strLIZ = C1243240iSQ.LIZ(user, true);
            } else {
                strLIZ = null;
            }
            final String str2 = "";
            if (strLIZ == null) {
                strLIZ = "";
            }
            String text = comment.getText();
            if (text != null) {
                str2 = text;
            }
            final List<String> list3 = commentInfoStruct.contentTypeTags;
            final List<TextExtraStruct> textExtra = comment.getTextExtra();
            final String str3 = null;
            C1360500lVY c1360500lVYS5 = S5(strLIZ, str2, null, list3, textExtra);
            C430840Guw c430840Guw2 = C430840Guw.LIZ;
            Context context2 = this.itemView.getContext();
            c430840Guw2.getClass();
            C430840Guw.LIZLLL(tuxTextView, c1360500lVYS5, context2);
            User user2 = comment.getUser();
            if (user2 != null && (avatarThumb = user2.getAvatarThumb()) != null) {
                C1358130lRj item = getItem();
                if (item != null && (upvoteStruct = item.LL) != null) {
                    str3 = upvoteStruct.upvoteId;
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
                int iIntValue3 = ((Number) this.LLJJIII.getValue()).intValue();
                int iIntValue4 = ((Number) this.LLJJIII.getValue()).intValue();
                c1331670kl3LJIIIIZZ.LJIIIIZZ = iIntValue3;
                c1331670kl3LJIIIIZZ.LJIIIZ = iIntValue4;
                c1331670kl3LJIIIIZZ.LJJII(new AbstractC468201s0() { // from class: X.0lRf
                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        if (bitmap == null) {
                            return;
                        }
                        TuxTextView tuxTextView2 = tuxTextView;
                        HandlerHook.viewPost(tuxTextView2, new ARunnableS0S3500000_21(this, str3, strLIZ, str2, bitmap, list3, textExtra, tuxTextView2, 1));
                    }
                });
            }
            C786410Ut5.I7(new AkS59S0200000_21(upvoteStruct2, this, 2), tuxTextView);
            tuxTextView.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 3));
            return;
        }
        tuxTextView.setText(this.itemView.getContext().getString(2131846406));
        C786410Ut5.I7(new AkS17S0000000_21(1), tuxTextView);
        tuxTextView.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 3));
    }

    public final void R5(C1358130lRj c1358130lRj) {
        MatchedFriendStruct matchedFriendStruct;
        User user = c1358130lRj.LL.user;
        if (user != null) {
            matchedFriendStruct = user.getMatchedFriendStruct();
        } else {
            matchedFriendStruct = null;
        }
        C1358770lSl c1358770lSl = C1358770lSl.LIZ;
        UpvoteStruct upvoteStruct = c1358130lRj.LL;
        c1358770lSl.getClass();
        if (C1358770lSl.LJ(upvoteStruct) && matchedFriendStruct != null && (C1358690lSd.LIZIZ() & 1) == 1) {
            C339190DRl.LIZLLL((View) this.LLJ.getValue());
            RelationLabelTextView.LJJJJL((RelationLabelTextView) this.LLJ.getValue(), matchedFriendStruct, C1264070j01.LJII);
        } else {
            C339190DRl.LIZIZ((View) this.LLJ.getValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        float f;
        LiveData liveData;
        C1358600lSU c1358600lSU;
        String str;
        C1358130lRj c1358130lRj = (C1358130lRj) interfaceC1891350zJl;
        User user = c1358130lRj.LL.user;
        if (user != null) {
            user.getNickname();
        }
        User user2 = c1358130lRj.LL.user;
        C786410Ut5.I7(new AkS59S0200000_21(c1358130lRj, this, 3), this.itemView);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1401890maJ(this, c1358130lRj, 0));
        if (user2 != null) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.zym);
            C1243240iSQ.LIZ.getClass();
            textView.setText(C1243240iSQ.LIZ(user2, true));
        }
        String uid = null;
        if (C263730AVf.LIZ()) {
            View viewFindViewById = this.itemView.findViewById(R.id.zym);
            C786410Ut5.I7(new AkS89S0100000_21(this, 19), viewFindViewById);
            C427690Gpr.LJI(viewFindViewById, null);
            viewFindViewById.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 3));
        }
        R5(c1358130lRj);
        N5(c1358130lRj);
        I5(c1358130lRj.LL);
        C1358600lSU c1358600lSU2 = this.LLJJJJ;
        if (c1358600lSU2 != null) {
            Context context = this.itemView.getContext();
            Aweme awemeA6 = a6();
            UpvotePanelListViewModel upvotePanelListViewModel = this.LLJJIJIIJIL;
            if (upvotePanelListViewModel != null) {
                str = upvotePanelListViewModel.LL;
            } else {
                str = null;
            }
            LifecycleOwner parent = getParent();
            C1358570lSR c1358570lSR = new C1358570lSR(this);
            C459550I0j c459550I0j = new C459550I0j(this);
            C1358610lSV c1358610lSV = new C1358610lSV(this);
            C1357980lRU c1357980lRU = new C1357980lRU(this);
            C1357990lRV c1357990lRV = new C1357990lRV(this);
            C1358630lSX c1358630lSX = new C1358630lSX(this);
            c1358600lSU2.LJII = context;
            c1358600lSU2.LJFF = c1358130lRj;
            c1358600lSU2.LJIILIIL = str;
            c1358600lSU2.LJI = awemeA6;
            c1358600lSU2.LJIIIIZZ = parent;
            c1358600lSU2.LJIIIZ = c1358570lSR;
            c1358600lSU2.LJIIJ = c459550I0j;
            c1358600lSU2.LJIIL = c1358610lSV;
            c1358600lSU2.LJIIJJI = c1358630lSX;
            C786410Ut5.I7(new AkS89S0100000_21(c1357980lRU, 21), c1358600lSU2.LIZJ);
            C786410Ut5.I7(new AkS89S0100000_21(c1357990lRV, 22), c1358600lSU2.LJ);
            c1358600lSU2.LIZJ.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(c1358600lSU2, 2));
            c1358600lSU2.LJ.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(c1358600lSU2, 2));
        }
        LifecycleOwner parent2 = getParent();
        if (parent2 != null && (c1358600lSU = this.LLJJJJ) != null) {
            C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(parent2, new AObserverS224S0100000_21(c1358600lSU, 59));
        }
        C1358600lSU c1358600lSU3 = this.LLJJJJ;
        if (c1358600lSU3 != null) {
            c1358600lSU3.LJ();
        }
        P5(c1358130lRj);
        if (user2 != null) {
            uid = user2.getUid();
        }
        if (C10EU.LJIIZILJ(uid)) {
            TuxTextView tuxTextView = (TuxTextView) this.LLJILLL.getValue();
            UpvotePanelListViewModel upvotePanelListViewModel2 = this.LLJJIJIIJIL;
            if (upvotePanelListViewModel2 != null && (liveData = (LiveData) upvotePanelListViewModel2.LLILZLL.getValue()) != null && Intrinsics.LJFF(liveData.getValue(), Boolean.TRUE)) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.B5(tuxTextView, f);
        }
        UpvotePanelListViewModel upvotePanelListViewModel3 = this.LLJJIJIIJIL;
        if (upvotePanelListViewModel3 != null && upvotePanelListViewModel3.LLILZ) {
            upvotePanelListViewModel3.LLILZ = false;
            ((LiveData) upvotePanelListViewModel3.LLILZIL.getValue()).postValue(Boolean.TRUE);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (C298440Bms.LIZ()) {
            return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.i6q, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i6q, viewGroup, false);
    }

    public final void u6(String str) {
        UpvoteStruct upvoteStruct;
        String str2;
        boolean z;
        VideoItemParams videoItemParams;
        C1358130lRj item = getItem();
        User user = null;
        if (item != null) {
            upvoteStruct = item.LL;
        } else {
            upvoteStruct = null;
        }
        String strI6 = i6();
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        C1358130lRj item2 = getItem();
        if (item2 != null && (videoItemParams = item2.LLILLJJLI) != null) {
            str2 = videoItemParams.mEventType;
        } else {
            str2 = null;
        }
        String strF6 = f6();
        if (upvoteStruct != null) {
            user = upvoteStruct.user;
        }
        if (((View) this.LLILZLL.getValue()).getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        C1358550lSP.LJIILJJIL(c1358550lSP, str2, strF6, upvoteStruct, user, str, z, null, null, strI6, Boolean.valueOf(C298420Bmq.LIZ()), 384);
    }

    public final void v6(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("recommend_panel_cancel", c2344009Gk.LIZ);
    }

    public final void w6(UpvoteStruct upvoteStruct) {
        User user;
        UpvoteStruct upvoteStruct2;
        String tabName;
        VideoItemParams videoItemParams;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        UpvoteStruct upvoteStruct3;
        if (C263730AVf.LIZ() && (!C1336205Ku.LIZJ().LIZJ())) {
            C1358770lSl.LIZ.getClass();
            if (!C1358770lSl.LJ(upvoteStruct) && !C10EU.LJIILLIIL(upvoteStruct.user)) {
                C6();
                return;
            }
        }
        C1358110lRh c1358110lRh = C1358110lRh.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
        C1358130lRj item = getItem();
        String str = null;
        if (item != null && (upvoteStruct3 = item.LL) != null) {
            user = upvoteStruct3.user;
        } else {
            user = null;
        }
        C1358130lRj item2 = getItem();
        if (item2 != null) {
            upvoteStruct2 = item2.LL;
        } else {
            upvoteStruct2 = null;
        }
        VideoItemParams videoItemParamsB6 = b6();
        if (videoItemParamsB6 != null) {
            str = videoItemParamsB6.mEventType;
        }
        C1358130lRj item3 = getItem();
        if (item3 == null || (videoItemParams = item3.LLILLJJLI) == null || (baseFeedPageParams = videoItemParams.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        C1358110lRh.LIZIZ(c1358110lRh, activityLIZ, user, upvoteStruct2, str, "cell", null, false, tabName, 96);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[PHI: r6
      0x009d: PHI (r6v9 java.lang.String) = (r6v7 java.lang.String), (r6v10 java.lang.String) binds: [B:42:0x009b, B:40:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148 A[PHI: r6
      0x0148: PHI (r6v4 androidx.fragment.app.FragmentManager) = 
      (r6v2 androidx.fragment.app.FragmentManager)
      (r6v3 androidx.fragment.app.FragmentManager)
      (r6v5 androidx.fragment.app.FragmentManager)
     binds: [B:85:0x0145, B:82:0x013d, B:76:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z6(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r23) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell.z6(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct):boolean");
    }

    public final void L5(UpvoteStruct upvoteStruct, boolean z) {
        String strLIZLLL;
        Spannable spannableString;
        int length;
        int iIntValue;
        int i;
        int iIntValue2;
        String strLJIIIZ = "";
        if (z || (strLIZLLL = C1359720lUI.LIZLLL(upvoteStruct)) == null) {
            strLIZLLL = "";
        }
        long j = upvoteStruct.createTime;
        if (j > 1514736000) {
            strLJIIIZ = C2215101Bmm.LJIIIZ(TimeUnit.SECONDS.toMillis(j));
        }
        String strLJJIFFI = u.LJJIFFI(strLJIIIZ, " ", " ", false);
        if (C298740BnM.LIZ()) {
            r6().setOnLongClickListener(null);
            r6().setMovementMethod(new C431100GvM(new AwS422S0200000_21(upvoteStruct, this, 59), new AwS387S0200000_21(upvoteStruct, this, 38)));
        } else {
            r6().setMovementMethod(null);
        }
        if (C123100dR.LIZ(strLIZLLL)) {
            TuxTextView tuxTextViewR6 = r6();
            if (C298730BnL.LIZIZ()) {
                i = 51;
            } else {
                i = 41;
            }
            tuxTextViewR6.setTuxFont(i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZLLL);
            List<? extends TextExtraStruct> list = upvoteStruct.textExtra;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ba, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            C1358940lT2.LIZ(spannableStringBuilder, list, iIntValue2, new InterfaceC1358050lRb() { // from class: X.0lRe
                @Override // X.InterfaceC1358050lRb
                public final void LIZ(TextExtraStruct textExtraStruct) {
                    String userId;
                    UpvoteStruct upvoteStruct2;
                    String tabName;
                    VideoItemParams videoItemParams;
                    BaseFeedPageParams baseFeedPageParams;
                    C2189821An6 c2189821An6;
                    C1358110lRh c1358110lRh = C1358110lRh.LIZ;
                    Activity activityLIZ = C1388190mED.LIZ(this.LIZ.itemView.getContext());
                    String str = null;
                    if (textExtraStruct != null) {
                        userId = textExtraStruct.getUserId();
                    } else {
                        userId = null;
                    }
                    C1358130lRj item = this.LIZ.getItem();
                    if (item != null) {
                        upvoteStruct2 = item.LL;
                    } else {
                        upvoteStruct2 = null;
                    }
                    VideoItemParams videoItemParamsB6 = this.LIZ.b6();
                    if (videoItemParamsB6 != null) {
                        str = videoItemParamsB6.mEventType;
                    }
                    C1358130lRj item2 = this.LIZ.getItem();
                    if (item2 == null || (videoItemParams = item2.LLILLJJLI) == null || (baseFeedPageParams = videoItemParams.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
                        tabName = "";
                    }
                    c1358110lRh.getClass();
                    C1358110lRh.LIZ(activityLIZ, userId, upvoteStruct2, str, "repost_panel_mention", tabName);
                    this.LIZ.u6("mention");
                }
            });
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (C298420Bmq.LIZ()) {
                String string = this.itemView.getContext().getString(2131846409, "\u200b\u200b");
                int iLJJJ = a0.LJJJ(string, "\u200b\u200b", 0, false, 6);
                spannableStringBuilder2.append((CharSequence) string.substring(0, iLJJJ)).append((CharSequence) spannableStringBuilder).append((CharSequence) string.substring(iLJJJ + 2));
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableString = spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) strLJJIFFI);
        } else {
            r6().setTuxFont(71);
            spannableString = new SpannableString(strLJJIFFI);
        }
        if (C123100dR.LIZ(strLIZLLL)) {
            if (C298420Bmq.LIZ()) {
                length = this.itemView.getContext().getString(2131846409, strLIZLLL).length();
            } else {
                length = strLIZLLL.length();
            }
        } else {
            length = 0;
        }
        if (length < spannableString.length()) {
            Spannable spannable = spannableString;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, r6().getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            C786410Ut5.o2(spannable, new ForegroundColorSpan(iIntValue), length, spannableString.length(), 33);
            C786410Ut5.o2(spannable, new C444920HcY(71, false), length, spannableString.length(), 33);
        }
        if (spannableString.length() == 0) {
            C786410Ut5.LLLLZLL(r6(), 8);
        } else {
            C786410Ut5.LLLLZLL(r6(), 0);
            r6().setText(spannableString);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1358130lRj c1358130lRj = (C1358130lRj) interfaceC1891350zJl;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ instanceof C1358140lRk) {
            C1358140lRk c1358140lRk = (C1358140lRk) objLJJJLZIJ;
            if (c1358140lRk.LIZ) {
                N5(c1358130lRj);
                this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1401890maJ(this, c1358130lRj, 1));
            }
            if (c1358140lRk.LIZIZ) {
                L5(c1358130lRj.LL, false);
            }
            if (c1358140lRk.LIZJ) {
                I5(c1358130lRj.LL);
            }
            if (c1358140lRk.LIZLLL) {
                P5(c1358130lRj);
                this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1401890maJ(this, c1358130lRj, 2));
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    public static void T5(UpvotePanelListCell upvotePanelListCell, String str, String str2, boolean z, int i) {
        User user;
        UpvoteStruct upvoteStruct;
        UpvoteStruct upvoteStruct2;
        boolean z2 = z;
        String str3 = str2;
        String str4 = str;
        String str5 = null;
        if ((i & 1) != 0) {
            str4 = null;
        }
        if ((i & 2) != 0) {
            str3 = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        upvotePanelListCell.getClass();
        C1358110lRh c1358110lRh = C1358110lRh.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(upvotePanelListCell.itemView.getContext());
        C1358130lRj item = upvotePanelListCell.getItem();
        if (item != null && (upvoteStruct2 = item.LL) != null) {
            user = upvoteStruct2.user;
        } else {
            user = null;
        }
        C1358130lRj item2 = upvotePanelListCell.getItem();
        if (item2 != null) {
            upvoteStruct = item2.LL;
        } else {
            upvoteStruct = null;
        }
        VideoItemParams videoItemParamsB6 = upvotePanelListCell.b6();
        if (videoItemParamsB6 != null) {
            str5 = videoItemParamsB6.mEventType;
        }
        if (str3 == null) {
            str3 = "repost_panel_avatar";
        }
        C1358110lRh.LIZIZ(c1358110lRh, activityLIZ, user, upvoteStruct, str5, str3, str4, z2, null, 128);
    }

    public final C1360500lVY S5(String str, String str2, Bitmap bitmap, List list, List list2) {
        boolean z;
        String strLIZIZ;
        int iIntValue;
        int iIntValue2;
        Bitmap bitmapCreateBitmap = bitmap;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(C13LP.LJJLIIIJ(list, " ", null, null, 0, null, null, 62));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" ");
        sbLIZ2.append(str);
        sbLIZ2.append(' ');
        sbLIZ2.append(str2);
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZLLL(strLIZIZ2);
        C1360500lVY c1360500lVY = c1360520lVa.LIZ;
        int iIntValue3 = ((Number) this.LLJJIII.getValue()).intValue();
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(iIntValue3, iIntValue3, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(1);
            paint.setColor(-2500135);
            float f = iIntValue3 / 2.0f;
            canvas.drawCircle(f, f, f, paint);
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iIntValue3, iIntValue3, true);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iIntValue3, iIntValue3, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Paint paint2 = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateScaledBitmap, tileMode, tileMode));
        float f2 = iIntValue3 / 2.0f;
        canvas2.drawCircle(f2, f2, f2, paint2);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.itemView.getContext().getResources(), bitmapCreateBitmap2);
        bitmapDrawable.setBounds(0, 0, iIntValue3, iIntValue3);
        C786410Ut5.r2(c1360500lVY, new C416570GVb(bitmapDrawable), 0, 1, 33);
        int length = str.length() + 1;
        c1360500lVY.LIZJ(1, length, new C444920HcY(42, false));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1360500lVY.LIZJ(1, length, new ForegroundColorSpan(iIntValue));
        int i = length + 1;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ba, this.itemView.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) it2.next();
                int start = textExtraStruct.getStart() + i;
                int end = textExtraStruct.getEnd() + i;
                if (start >= 0 && end <= c1360500lVY.length() && start < end) {
                    c1360500lVY.LIZJ(start, end, new C1358040lRa(null, iIntValue2, textExtraStruct));
                }
            }
        }
        if (list != null && !list.isEmpty() && strLIZIZ.length() > 0) {
            c1360500lVY.LIZJ((strLIZIZ2.length() - strLIZIZ.length()) + 1, strLIZIZ2.length(), new ForegroundColorSpan(iIntValue2));
        }
        return c1360500lVY;
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
