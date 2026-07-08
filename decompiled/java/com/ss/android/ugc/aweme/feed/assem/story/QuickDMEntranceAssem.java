package com.ss.android.ugc.aweme.feed.assem.story;

import X.C01GW;
import X.C0I08;
import X.C0I0B;
import X.C0I0E;
import X.C0RF0;
import X.C0RJN;
import X.C0RP1;
import X.C0S1H;
import X.C0S1J;
import X.C0S1K;
import X.C0S1M;
import X.C0S2R;
import X.C0S2S;
import X.C0S2U;
import X.C0ZH1;
import X.C1388190mED;
import X.C1389300mG0;
import X.C13LE;
import X.C1440005kM;
import X.C1578630rBN;
import X.C1618440sDa;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C1A1H;
import X.C2097608Jq;
import X.C2189821An6;
import X.C2217381BqS;
import X.C281310B0v;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C453940Hr6;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729510SjV;
import X.C735840Sti;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC2172611A1b;
import X.EnumC700430Rdh;
import X.EnumC714710S1t;
import X.EnumC896890ZGl;
import X.EnumC913010Zrn;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC438360HGw;
import X.InterfaceC706770Rnv;
import X.InterfaceC714600S1i;
import Y.ACListenerS12S1101000_11;
import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class QuickDMEntranceAssem extends BaseCellSlotComponent<QuickDMEntranceAssem> implements C0I08 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public TuxTextView LLJLLIL;
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 249));
    public final InterfaceC1731706qJ LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public String LLLFFI;
    public Aweme LLLFZ;
    public boolean LLLI;
    public final C01GW LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuickDMEntranceAssem.class, "sharerInfoVM", "getSharerInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/sharer/VideoExposeSharerInformationVM;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public QuickDMEntranceAssem() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoExposeSharerInformationVM.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 250), null, AFwS243S0000000_11.get$arr$(86));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(87));
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(88));
        this.LLLF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(95));
        this.LLLFF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(98));
        this.LLLII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(96));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d27;
    }

    public final EnumC896890ZGl Ep() {
        return C729510SjV.LJJIJIL(this.LLLFZ) ? EnumC896890ZGl.TYPE_STORY_QUICK_ENTRANCE : EnumC896890ZGl.TYPE_DEFAULT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final QuickDMEventParam Fp() {
        String str;
        C0RJN c0rjnLIZIZ;
        C0RJN c0rjnLIZIZ2;
        Map<String, String> extra;
        C2189821An6 c2189821An6Xp0 = xp0();
        if (c2189821An6Xp0 == null || (extra = c2189821An6Xp0.getExtra()) == null || (str = extra.get("enter_position")) == null) {
            str = "feed";
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str2 = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
        C724270Sb3 c724270Sb32 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid();
        C724270Sb3 c724270Sb33 = this.LLJI;
        String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme());
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C724270Sb3 c724270Sb34 = this.LLJI;
        User author = ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme().getAuthor();
        c735840Sti.getClass();
        String strValueOf = String.valueOf(C735840Sti.LJIIIIZZ(author));
        C0S1J c0s1j = null;
        Object[] objArr = 0;
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL = c1618440sDa.LJJLIIIJL();
        C724270Sb3 c724270Sb35 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb35 != null ? c724270Sb35.LL : null)).getAweme();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        boolean z = false;
        String str3 = interfaceC438360HGwLJJLIIIJL.LIZ(aweme, false, false, fragmentLJI != null && (c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragmentLJI)) != null && C1389300mG0.LJII(c0rjnLIZIZ2)) ? "1" : CardStruct.IStatusCode.DEFAULT;
        C724270Sb3 c724270Sb36 = this.LLJI;
        String str4 = ((VideoItemParams) (c724270Sb36 != null ? c724270Sb36.LL : null)).mFrom;
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = c1618440sDa.LJJIIJ();
        C0RF0 c0rf0 = jm().LIZLLL;
        boolean zLJJIIJZLJL = interfaceC706770RnvLJJIIJ.LJJIIJZLJL(c0rf0 != null ? c0rf0.LIZJ : null);
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI2)) != null && C1389300mG0.LJII(c0rjnLIZIZ)) {
            z = true;
        }
        return new QuickDMEventParam(str, str2, aid, authorUid, strValueOf, c0s1j, str3, str4, true, zLJJIIJZLJL, objArr == true ? 1 : 0, z, 6240);
    }

    public final C0ZH1 Gp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (C729510SjV.LJJIJIL(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
            return C0ZH1.STORY;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        return C1A1H.LIZLLL(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme()) ? C0ZH1.REPOST : C0ZH1.POST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0S1K] */
    /* JADX WARN: Type inference failed for: r31v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Jp() {
        Aweme aweme;
        User author;
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        Map<String, String> extra;
        String str;
        String str2;
        C19EG c19egLIZIZ3;
        Map<String, String> extra2;
        String str3;
        String str4;
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        ?? r11 = C0S1K.LIZIZ;
        String strLJII = r11.LJII(getContext(), false);
        QuickDMEventParam quickDMEventParamFp = Fp();
        String str5 = "feed";
        String str6 = "";
        if (C281310B0v.LIZ() && C729510SjV.LJJIJIL(aweme)) {
            Context context = getContext();
            if (context != null && (c19egLIZIZ3 = C1388190mED.LIZIZ(context)) != null) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                FragmentManager supportFragmentManager = c19egLIZIZ3.getSupportFragmentManager();
                QuickDMEventParam quickDMEventParamLIZ = QuickDMEventParam.LIZ(quickDMEventParamFp, null, C0S1J.CLICK, null, 16319);
                C724270Sb3 c724270Sb32 = this.LLJI;
                VideoItemParams videoItemParams2 = (VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null);
                if (videoItemParams2 != null && (str4 = videoItemParams2.mEventType) != null) {
                    str6 = str4;
                }
                C2189821An6 c2189821An6Xp0 = xp0();
                if (c2189821An6Xp0 != null && (extra2 = c2189821An6Xp0.getExtra()) != null && (str3 = extra2.get("enter_position")) != null) {
                    str5 = str3;
                }
                View viewFindViewById = this.LLJLLIL;
                if (viewFindViewById == null) {
                    View viewLJJIJL = LJJIJL();
                    viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.so1) : null;
                    this.LLJLLIL = (TuxTextView) viewFindViewById;
                }
                String string = ((AppCompatTextView) viewFindViewById).getText().toString();
                AFwS198S0000000_11 aFwS198S0000000_11 = AFwS198S0000000_11.get$arr$(97);
                C0RF0 c0rf0 = jm().LIZLLL;
                r11.LIZLLL(c19egLIZ, null, supportFragmentManager, quickDMEventParamLIZ, aweme, author, str6, str5, string, true, null, aFwS198S0000000_11, null, null, null, null, false, false, false, c0rf0 != null ? c0rf0.LIZJ : null, null);
            }
        } else if (C729510SjV.LJJIJIL(aweme)) {
            Context context2 = getContext();
            if (context2 != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context2)) != null) {
                IIMChatService imChatService = ((IIMService) this.LLLF.getValue()).getImChatService();
                FragmentManager supportFragmentManager2 = c19egLIZIZ2.getSupportFragmentManager();
                C724270Sb3 c724270Sb33 = this.LLJI;
                VideoItemParams videoItemParams3 = (VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null);
                if (videoItemParams3 != null && (str2 = videoItemParams3.mEventType) != null) {
                    str6 = str2;
                }
                C2189821An6 c2189821An6Xp02 = xp0();
                if (c2189821An6Xp02 != null && (extra = c2189821An6Xp02.getExtra()) != null && (str = extra.get("enter_position")) != null) {
                    str5 = str;
                }
                imChatService.LIZIZ(c19egLIZIZ2, supportFragmentManager2, author, aweme, str6, str5, new AwS590S0100000_11(this, 105), null, true, false, Ep(), strLJII, null, "", Fp(), this, null, null, null, null, false, null, null);
            }
        } else {
            Context context3 = getContext();
            if (context3 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context3)) != null) {
                IIMChatService imChatService2 = ((IIMService) this.LLLF.getValue()).getImChatService();
                FragmentManager supportFragmentManager3 = c19egLIZIZ.getSupportFragmentManager();
                C724270Sb3 c724270Sb34 = this.LLJI;
                String str7 = ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).mEventType;
                if (str7 == null) {
                    str7 = "";
                }
                imChatService2.LJIL(c19egLIZIZ, supportFragmentManager3, aweme, str7, EnumC896890ZGl.TYPE_MUF_QUICK_ENTRANCE, QuickDMEventParam.LIZ(Fp(), "quick_reply_cell", null, null, 16351), null, null, null);
            }
        }
        if (Ep() == EnumC896890ZGl.TYPE_MUF_QUICK_ENTRANCE) {
            Vp();
        } else {
            Ip("click_story_dm_input_box", "click_input_box");
            Tp(EnumC714710S1t.CLICK_INPUT_BOX);
        }
    }

    @Override // X.C0I08
    public final void TG() {
        C1440005kM.LIZ(new C453940Hr6(true, false, 4));
    }

    public final void Up() {
        String aid;
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            C0S2S c0s2s = EnumC2172611A1b.Companion;
            C2189821An6 c2189821An6Xp0 = xp0();
            String eventType = c2189821An6Xp0 != null ? c2189821An6Xp0.getEventType() : null;
            c0s2s.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(eventType);
            C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            Aweme aweme = this.LLLFZ;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, Gp(), C0S2R.PRIVATE, "", C0I0B.LJFF.LIZIZ());
        }
    }

    public final void Vp() {
        String aid;
        String authorUid;
        InterfaceC714600S1i quickReplyAnalytics = ((IIMService) this.LLLF.getValue()).getQuickReplyAnalytics();
        String str = this.LLLFFI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Aweme aweme = this.LLLFZ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        Aweme aweme2 = this.LLLFZ;
        if (aweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme2)) != null) {
            str2 = authorUid;
        }
        quickReplyAnalytics.LIZ(str, "click", aid, str2, C0I0B.LJFF.LIZIZ());
    }

    public final C2189821An6 xp0() {
        return (C2189821An6) this.LLJLLL.getValue();
    }

    public final void Bp() {
        String aid;
        C2189821An6 c2189821An6Xp0;
        ConcurrentHashMap<String, List<String>> emojiDisplaySet;
        C0RJN c0rjnLIZIZ;
        C0RJN c0rjnLIZIZ2;
        LinearLayout linearLayout = (LinearLayout) LJJIJL().findViewById(R.id.gzl);
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL = c1618440sDa.LJJLIIIJL();
        C724270Sb3 c724270Sb3 = this.LLJI;
        AttributeSet attributeSet = null;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        int i = 0;
        boolean z = (fragmentLJI == null || (c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragmentLJI)) == null || !C1389300mG0.LJIIIZ(c0rjnLIZIZ2)) ? false : true;
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (interfaceC438360HGwLJJLIIIJL.LIZ(aweme, false, z, (fragmentLJI2 == null || (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI2)) == null || !C1389300mG0.LJII(c0rjnLIZIZ)) ? false : true)) {
            if (linearLayout != null) {
                C786410Ut5.LJJJJJL(linearLayout);
            }
            InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL2 = c1618440sDa.LJJLIIIJL();
            C724270Sb3 c724270Sb32 = this.LLJI;
            List<String> listLIZIZ = interfaceC438360HGwLJJLIIIJL2.LIZIZ(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
            if (listLIZIZ != null) {
                int i2 = 0;
                for (String str : listLIZIZ) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    String str2 = str;
                    ACListenerS12S1101000_11 aCListenerS12S1101000_11 = new ACListenerS12S1101000_11(this, str2, i2, 0);
                    Context context = LJJIJL().getContext();
                    FrameLayout frameLayout = new FrameLayout(context);
                    TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, i);
                    tuxTextView.setText(str2);
                    tuxTextView.LJJJJI(25.0f);
                    tuxTextView.setGravity(17);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0);
                    frameLayout.addView(tuxTextView, layoutParams);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                    layoutParams2.gravity = 17;
                    ViewGroup viewGroup = (ViewGroup) LJJIJL().findViewById(R.id.gzl);
                    if (viewGroup != null) {
                        viewGroup.addView(frameLayout, layoutParams2);
                    }
                    setComponentClickStatusExperimental(tuxTextView, EnumC700430Rdh.POSITIVE);
                    C786410Ut5.h9(tuxTextView, aCListenerS12S1101000_11);
                    i2 = i3;
                }
            }
            Aweme aweme2 = this.LLLFZ;
            if (aweme2 == null || (aid = aweme2.getAid()) == null || listLIZIZ == null || (c2189821An6Xp0 = xp0()) == null || (emojiDisplaySet = c2189821An6Xp0.getEmojiDisplaySet()) == null) {
                return;
            }
            emojiDisplaySet.put(aid, listLIZIZ);
        }
    }

    public final void Qp(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Map<String, String> extra;
        String str2;
        Object obj5;
        Object obj6;
        Object obj7;
        Map<String, String> extra2;
        String str3;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        User author = aweme.getAuthor();
        if (author == null) {
            return;
        }
        String str4 = "story";
        String str5 = "feed";
        if (Ep() == EnumC896890ZGl.TYPE_STORY_QUICK_ENTRANCE) {
            InterfaceC1365380ldQ interfaceC1365380ldQ = (InterfaceC1365380ldQ) this.LLLFF.getValue();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj5 = c724270Sb32.LL;
            } else {
                obj5 = null;
            }
            String str6 = ((VideoItemParams) obj5).mEventType;
            if (str6 == null) {
                str6 = "";
            }
            EnumC896890ZGl enumC896890ZGlEp = Ep();
            C2189821An6 c2189821An6Xp0 = xp0();
            if (c2189821An6Xp0 != null && (extra2 = c2189821An6Xp0.getExtra()) != null && (str3 = extra2.get("enter_position")) != null) {
                str5 = str3;
            }
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("dm_reply_type", "emoji");
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj6 = c724270Sb33.LL;
            } else {
                obj6 = null;
            }
            if (!C729510SjV.LJJIJIL(((VideoItemParams) obj6).getAweme())) {
                str4 = "post";
            }
            pairArr[1] = new Pair("story_type", str4);
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj7 = c724270Sb34.LL;
            } else {
                obj7 = null;
            }
            pairArr[2] = new Pair("use_story_gid", ((VideoItemParams) obj7).getAweme().getAid());
            interfaceC1365380ldQ.LJJJI(str, author, aweme, str6, enumC896890ZGlEp, str5, null, null, false, C2097608Jq.LJIIJ(pairArr), new AwS220S0300000_11(aweme, author, this, 4));
        } else {
            InterfaceC1365380ldQ interfaceC1365380ldQ2 = (InterfaceC1365380ldQ) this.LLLFF.getValue();
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj2 = c724270Sb35.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
            C724270Sb3 c724270Sb36 = this.LLJI;
            if (c724270Sb36 != null) {
                obj3 = c724270Sb36.LL;
            } else {
                obj3 = null;
            }
            String str7 = ((VideoItemParams) obj3).mEventType;
            EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_MUF_QUICK_ENTRANCE;
            C2189821An6 c2189821An6Xp02 = xp0();
            if (c2189821An6Xp02 != null && (extra = c2189821An6Xp02.getExtra()) != null && (str2 = extra.get("enter_position")) != null) {
                str5 = str2;
            }
            Pair[] pairArr2 = new Pair[2];
            pairArr2[0] = new Pair("dm_reply_type", "emoji");
            C724270Sb3 c724270Sb37 = this.LLJI;
            if (c724270Sb37 != null) {
                obj4 = c724270Sb37.LL;
            } else {
                obj4 = null;
            }
            if (!C729510SjV.LJJIJIL(((VideoItemParams) obj4).getAweme())) {
                str4 = "post";
            }
            pairArr2[1] = new Pair("story_type", str4);
            interfaceC1365380ldQ2.LJJJI(str, author, aweme2, str7, enumC896890ZGl, str5, null, null, false, C2097608Jq.LJIIJ(pairArr2), null);
        }
        Ip("click_story_dm_input_box", "click_exposed_emoji");
        Tp(EnumC714710S1t.CLICK_OUTER_EMOJI);
    }

    public final void Tp(EnumC714710S1t enumC714710S1t) {
        Object obj;
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            C0S2S c0s2s = EnumC2172611A1b.Companion;
            String str = this.LLLFFI;
            c0s2s.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str);
            C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String aid = ((VideoItemParams) obj).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, Gp(), C0S2R.PRIVATE, enumC714710S1t, C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C426750GoL.LJIIIZ(view.findViewById(R.id.snx), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, false, 29);
        View viewFindViewById = view.findViewById(R.id.snx);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        c384050F3z.LJFF = Integer.valueOf(R.attr.eh);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.so2);
        EnumC700430Rdh enumC700430Rdh = EnumC700430Rdh.POSITIVE;
        setComponentClickStatusExperimental(tuxIconView, enumC700430Rdh);
        C786410Ut5.a9(tuxIconView, new ACListenerS146S0100000_11(this, 99));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.snx);
        setComponentClickStatusExperimental(relativeLayout, enumC700430Rdh);
        C786410Ut5.S7(relativeLayout, new ACListenerS146S0100000_11(this, 100));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0S1l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJI;
            }
        }, null, AFwS293S0000000_10.get$arr$(0), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0R9o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(292), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0NzX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(293), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0Nl8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(294), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Object obj;
        boolean z;
        C0RJN c0rjnLIZIZ;
        C0RJN c0rjnLIZIZ2;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLLFZ = videoItemParams2.getAweme();
        if (!Intrinsics.LJFF(videoItemParams2.mEventType, this.LLLFFI)) {
            this.LLLFFI = videoItemParams2.mEventType;
        }
        TextView textView = (TextView) LJJIJL().findViewById(R.id.so1);
        C0S1K c0s1k = C0S1K.LIZIZ;
        Context context = getContext();
        InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL = C1618440sDa.LIZIZ.LJJLIIIJL();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        boolean z2 = true;
        if (fragmentLJI != null && (c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragmentLJI)) != null && C1389300mG0.LJIIIZ(c0rjnLIZIZ2)) {
            z = true;
        } else {
            z = false;
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 == null || (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI2)) == null || !C1389300mG0.LJII(c0rjnLIZIZ)) {
            z2 = false;
        }
        textView.setHint(c0s1k.LJII(context, interfaceC438360HGwLJJLIIIJL.LIZ(aweme, false, z, z2)));
        Bp();
        if (this.LLLI && getContentView().getVisibility() == 0) {
            Ip("story_dm_input_box_show", null);
        }
    }

    public final void Ip(String str, String str2) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!C729510SjV.LJJIJIL(((VideoItemParams) obj).getAweme())) {
            return;
        }
        C0S1M.LIZ(str, QuickDMEventParam.LIZ(Fp(), str2, null, null, 16351));
    }

    @Override // X.C0I08
    public final void YO(C0I0E c0i0e, String str) {
        boolean z = false;
        C1440005kM.LIZ(new C453940Hr6(z, z, 4));
    }
}
