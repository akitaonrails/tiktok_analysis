package wh6;

import X.AbstractC1387200mCc;
import X.AbstractC440840HQk;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0DHG;
import X.C0HH2;
import X.C0HNC;
import X.C0HSG;
import X.C0I0B;
import X.C0I3R;
import X.C0I40;
import X.C0PEM;
import X.C0ZDT;
import X.C128Y;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1388190mED;
import X.C1391600mJi;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1438705k9;
import X.C1438805kA;
import X.C1558520qew;
import X.C1629106Zl;
import X.C1906580ziK;
import X.C19719212De;
import X.C19EG;
import X.C20684815ws;
import X.C23250099c;
import X.C345700Dgu;
import X.C384050F3z;
import X.C436540H9w;
import X.C440750HQb;
import X.C440790HQf;
import X.C440800HQg;
import X.C440820HQi;
import X.C440830HQj;
import X.C440850HQl;
import X.C445400HdK;
import X.C447810HhD;
import X.C450720Hlu;
import X.C457780HxI;
import X.C457970Hxb;
import X.C632670Orh;
import X.C724240Sb0;
import X.C770750ULh;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C896410ZEp;
import X.C912070ZqH;
import X.C985403tE;
import X.EnumC1235690iGF;
import X.EnumC440870HQn;
import X.EnumC440980HQy;
import X.EnumC441530HTb;
import X.EnumC451180Hme;
import X.InterfaceC2217461Bqa;
import X.InterfaceC457860HxQ;
import X.InterfaceC902170ZaJ;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuotedAreaReusedAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMAwemeSideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IAddStickerToFavViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.mix.manageplaylist.ManagePlaylistActivityArg;
import com.ss.android.ugc.aweme.mix.profile.entry.PlaylistShowManageCell;
import com.ss.android.ugc.aweme.service.IIMMediaCreativeService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS655S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class AbS498S0200000_6 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS498S0200000_6 abS498S0200000_6, View view) {
        EnumC441530HTb enumC441530HTb;
        if (view != null) {
            AssemVMLazy assemVMLazy = ((SideMessageStatusReusedSkeletonUISlot) abS498S0200000_6.l0).LLLFZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SideMessageStatusReusedSkeletonUISlot.LLLIL;
            if (((PanelStateViewModel) assemVMLazy.getValue()).LLIZ.getValue() instanceof C447810HhD) {
                enumC441530HTb = EnumC441530HTb.TOP;
            } else {
                enumC441530HTb = EnumC441530HTb.BOTTOM;
            }
            ((IAddStickerToFavViewModel) ((SideMessageStatusReusedSkeletonUISlot) abS498S0200000_6.l0).LLLFFI.getValue()).addToFavorites((C869590Y9l) abS498S0200000_6.l1, view, enumC441530HTb);
        }
    }

    public static final void LIZ$1(AbS498S0200000_6 abS498S0200000_6, View view) {
        Context context;
        if (view != null && (context = ((TreasureBoxDialog) abS498S0200000_6.l0).getContext()) != null) {
            C450720Hlu c450720Hlu = new C450720Hlu(context);
            LiveIconView liveIconView = (LiveIconView) abS498S0200000_6.l1;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = liveIconView;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c450720Hlu.LJIIJ(2131856571);
            c450720Hlu.LIZIZ().show();
        }
    }

    public static final void LIZ$2(AbS498S0200000_6 abS498S0200000_6, View view) {
        AwS620S0100000_6 awS620S0100000_6;
        if (view != null && (awS620S0100000_6 = ((C0HH2) abS498S0200000_6.l0).LIZIZ) != null) {
            awS620S0100000_6.invoke(view, (C345700Dgu) abS498S0200000_6.l1);
        }
    }

    public static final void LIZ$3(AbS498S0200000_6 abS498S0200000_6, View view) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility;
        if (view != null && (messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((QuotedAreaReusedAssem) abS498S0200000_6.l0), MessageListQuotedMessageClickAbility.class, null)) != null) {
            C0I3R c0i3r = (C0I3R) ((C0I40) abS498S0200000_6.l1);
            messageListQuotedMessageClickAbility.mV1(c0i3r.LIZ, c0i3r.LIZIZ);
        }
    }

    public static final void LIZ$4(AbS498S0200000_6 abS498S0200000_6, View view) {
        if (view != null) {
            C445400HdK c445400HdK = (C445400HdK) abS498S0200000_6.l0;
            ManagePlaylistActivityArg managePlaylistActivityArg = new ManagePlaylistActivityArg(c445400HdK.LL, c445400HdK.LLILLJJLI, c445400HdK.LLILLL, "profile_playlist_manage");
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((PlaylistShowManageCell) abS498S0200000_6.l1).getContext(), "//playlist/manage");
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.addFlags(536870912);
            smartRouteBuildRoute.withNavArg(managePlaylistActivityArg);
            smartRouteBuildRoute.open();
            Boolean boolValueOf = Boolean.valueOf(((C445400HdK) abS498S0200000_6.l0).LLILZIL);
            if (boolValueOf.booleanValue()) {
                boolValueOf.booleanValue();
                Function0<Unit> function0 = ((C445400HdK) abS498S0200000_6.l0).LLILZLL;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final void LIZ$5(AbS498S0200000_6 abS498S0200000_6, View view) {
        SessionInfo sessionInfo;
        String displayName;
        boolean zBooleanValue;
        IQuickChatRoomSheetFactory iQuickChatRoomSheetFactory;
        Boolean boolValueOf;
        InterfaceC457860HxQ interfaceC457860HxQ;
        if (view != null) {
            DMAwemeSideMessageStatusReusedSkeletonUISlot dMAwemeSideMessageStatusReusedSkeletonUISlot = (DMAwemeSideMessageStatusReusedSkeletonUISlot) abS498S0200000_6.l0;
            C869590Y9l c869590Y9l = (C869590Y9l) abS498S0200000_6.l1;
            C457780HxI chatHierarchyData = dMAwemeSideMessageStatusReusedSkeletonUISlot.getChatHierarchyData();
            if (chatHierarchyData != null && (sessionInfo = chatHierarchyData.LL) != null) {
                C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
                InterfaceC902170ZaJ interfaceC902170ZaJLJFF = c912070ZqH.LJFF();
                AssemVMLazy assemVMLazy = dMAwemeSideMessageStatusReusedSkeletonUISlot.LLLF;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SideMessageStatusReusedSkeletonUISlot.LLLIL;
                interfaceC902170ZaJLJFF.LJII(sessionInfo, ((C457970Hxb) assemVMLazy.getValue().getState()).LL, "quick_live_react", null, null, null, "next_to_message", null, null, null, false, C0I0B.LJFF.LIZIZ());
                C19EG c19egLIZ = C724240Sb0.LIZ(dMAwemeSideMessageStatusReusedSkeletonUISlot);
                if (c19egLIZ != null) {
                    PanelStateViewModel panelStateViewModel = (PanelStateViewModel) dMAwemeSideMessageStatusReusedSkeletonUISlot.LLLFZ.getValue();
                    panelStateViewModel.jt(C1629106Zl.LL, panelStateViewModel.Ke().getValue().intValue());
                    C128Y c128yLJI = C724240Sb0.LJI(dMAwemeSideMessageStatusReusedSkeletonUISlot);
                    if ((c128yLJI instanceof InterfaceC457860HxQ) && (interfaceC457860HxQ = (InterfaceC457860HxQ) c128yLJI) != null) {
                        interfaceC457860HxQ.ok(null);
                    }
                    IIMMediaCreativeService iIMMediaCreativeServiceLJIILIIL = c912070ZqH.LJIILIIL();
                    String conversationId = sessionInfo.getConversationId();
                    int chatType = sessionInfo.getChatType();
                    String singleChatFromUserId = sessionInfo.getSingleChatFromUserId();
                    if (singleChatFromUserId == null) {
                        singleChatFromUserId = "";
                    }
                    IMUser singleChatFromUser = sessionInfo.getSingleChatFromUser();
                    if (singleChatFromUser != null) {
                        displayName = singleChatFromUser.getDisplayName();
                    } else {
                        displayName = null;
                    }
                    C896410ZEp c896410ZEp = QuoteMode.Companion;
                    C0ZDT.LIZ.getClass();
                    ReferenceInfo referenceInfoLJII = C0ZDT.LJII(c869590Y9l);
                    c896410ZEp.getClass();
                    QuoteMode quoteModeLIZ = C896410ZEp.LIZ(referenceInfoLJII);
                    Fragment fragmentLJI = C724240Sb0.LJI(dMAwemeSideMessageStatusReusedSkeletonUISlot);
                    if (fragmentLJI != null && (iQuickChatRoomSheetFactory = (IQuickChatRoomSheetFactory) PluggableExtentionKt.pluggableSpiForReal(IQuickChatRoomSheetFactory.class)) != null && (boolValueOf = Boolean.valueOf(iQuickChatRoomSheetFactory.LIZJ(fragmentLJI))) != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    iIMMediaCreativeServiceLJIILIIL.LJIIIIZZ(c19egLIZ, conversationId, chatType, singleChatFromUserId, displayName, "chat", null, null, "quick_live_react", null, null, false, null, null, null, null, false, null, "next_to_message", Boolean.valueOf(zBooleanValue), true, true, true, quoteModeLIZ, null, null);
                }
            }
        }
    }

    public static final void LIZ$6(AbS498S0200000_6 abS498S0200000_6, View view) {
        C440750HQb c440750HQb;
        C440830HQj c440830HQj;
        C440790HQf c440790HQf;
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        LifecycleCoroutineScope lifecycleScope;
        Activity activityLIZIZ2;
        C19EG c19egLIZIZ2;
        LifecycleCoroutineScope lifecycleScope2;
        Integer num;
        int i;
        Activity activityLIZIZ3;
        C19EG c19egLIZIZ3;
        LifecycleCoroutineScope lifecycleScope3;
        Function1<EnumC440980HQy, Unit> function1;
        if (view != null && (c440830HQj = (c440750HQb = (C440750HQb) abS498S0200000_6.l0).LLILLL) != null) {
            C440820HQi c440820HQi = c440750HQb.LLJI;
            if (c440820HQi != null && (function1 = c440820HQi.LIZJ) != null) {
                function1.invoke(EnumC440980HQy.MAKE_ALIVE);
            }
            ((C440750HQb) abS498S0200000_6.l0).getTuxVibrationHelper().LIZ();
            if (Intrinsics.LJFF(c440830HQj.LIZJ, C440850HQl.LIZ)) {
                C0HSG.LIZ.getClass();
                boolean z = !C0HSG.LIZIZ().getBoolean("alive_switch_click_tooltip_shown", false);
                StickerBase stickerBase = c440830HQj.LIZ.stickerBase;
                if (stickerBase != null && (num = stickerBase.stickerType) != null) {
                    if (num.intValue() == EnumC451180Hme.AISELF_STICKER.getType()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
                    if (abstractC1387200mCcLJFF != null && (activityLIZIZ3 = abstractC1387200mCcLJFF.LIZIZ()) != null && (c19egLIZIZ3 = C1388190mED.LIZIZ(activityLIZIZ3)) != null && (lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ3)) != null) {
                        C23250099c.LIZLLL(lifecycleScope3, C0PEM.LIZJ, null, new C0HNC((C440750HQb) abS498S0200000_6.l0, c440830HQj, i, z, null), 2);
                    }
                    ((C440750HQb) abS498S0200000_6.l0).getToggleTrackText().setText("");
                    return;
                }
                return;
            }
            AbstractC440840HQk abstractC440840HQk = c440830HQj.LIZJ;
            boolean z2 = abstractC440840HQk instanceof C440790HQf;
            if (z2) {
                C440790HQf c440790HQf2 = (C440790HQf) abstractC440840HQk;
                if (c440790HQf2 != null && !c440790HQf2.LIZ) {
                    C440750HQb c440750HQb2 = (C440750HQb) abS498S0200000_6.l0;
                    StickerVariant.Companion.getClass();
                    c440750HQb2.LJ(2);
                    AbstractC1387200mCc abstractC1387200mCcLJFF2 = C1906580ziK.LJFF();
                    if (abstractC1387200mCcLJFF2 == null || (activityLIZIZ2 = abstractC1387200mCcLJFF2.LIZIZ()) == null || (c19egLIZIZ2 = C1388190mED.LIZIZ(activityLIZIZ2)) == null || (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ2)) == null) {
                        return;
                    }
                    C23250099c.LIZLLL(lifecycleScope2, C0PEM.LIZJ, null, new C1438705k9((C440750HQb) abS498S0200000_6.l0, (Context) abS498S0200000_6.l1, null), 2);
                    return;
                }
                if (z2 && (c440790HQf = (C440790HQf) abstractC440840HQk) != null && c440790HQf.LIZ) {
                    C440750HQb c440750HQb3 = (C440750HQb) abS498S0200000_6.l0;
                    StickerVariant.Companion.getClass();
                    c440750HQb3.LJ(1);
                    AbstractC1387200mCc abstractC1387200mCcLJFF3 = C1906580ziK.LJFF();
                    if (abstractC1387200mCcLJFF3 != null && (activityLIZIZ = abstractC1387200mCcLJFF3.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
                        C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1438805kA((C440750HQb) abS498S0200000_6.l0, (Context) abS498S0200000_6.l1, null), 2);
                    }
                    ((C440750HQb) abS498S0200000_6.l0).LIZIZ(true, EnumC440870HQn.ANIMATED, EnumC440870HQn.STATIC);
                    return;
                }
            }
            if (!(abstractC440840HQk instanceof C440800HQg)) {
                return;
            }
            C440750HQb c440750HQb4 = (C440750HQb) abS498S0200000_6.l0;
            c440750HQb4.getClass();
            if (C0DHG.LIZ() && C1388190mED.LIZ(c440750HQb4.getContext()) != null) {
                C632670Orh.LIZIZ(c440750HQb4.getContext(), new C19719212De(-929698570, new AwS655S0100000_6(c440750HQb4, 13), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(c440750HQb4.getContext());
            c1397580mTM.LIZ(2131833912);
            C985403tE.LIZ(c1397580mTM, new AwS585S0100000_6(c440750HQb4, 381));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public static final void LIZ$7(AbS498S0200000_6 abS498S0200000_6, View view) {
        FragmentManager supportFragmentManager;
        C436540H9w c436540H9w = (C436540H9w) abS498S0200000_6.l0;
        Context context = (Context) abS498S0200000_6.l1;
        c436540H9w.getClass();
        ViewGroup viewGroup = null;
        View viewSd = C786410Ut5.Sd(R.layout.bcb, C786410Ut5.ne(context), null);
        View viewFindViewById = viewSd.findViewById(R.id.svt);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
        c384050F3z.LIZJ = Float.valueOf(context.getResources().getDimension(R.dimen.b6));
        viewFindViewById.setBackground(c384050F3z.LIZ(context));
        TextView textView = (TextView) viewSd.findViewById(R.id.svv);
        String str = c436540H9w.LIZ.videoTitle;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = (TextView) viewSd.findViewById(R.id.svw);
        String str3 = c436540H9w.LIZ.violationType;
        if (str3 == null) {
            str3 = "";
        }
        textView2.setText(str3);
        String str4 = c436540H9w.LIZ.videoCoverUri;
        if (str4 != null) {
            SmartImageView smartImageView = (SmartImageView) viewSd.findViewById(R.id.svu);
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str4);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        if (viewSd instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewSd;
        }
        if (viewGroup != null) {
            viewGroup.addView(C436540H9w.LJ(context, context.getString(2131858076), false));
            viewGroup.addView(C436540H9w.LJ(context, context.getString(2131858077), false));
            viewGroup.addView(C436540H9w.LJ(context, context.getString(2131858078), true));
        }
        C770750ULh c770750ULh = new C770750ULh();
        c770750ULh.LJ = context.getString(2131858075);
        c770750ULh.LJIILLIIL = true;
        String string = context.getString(2131858073);
        Object[] objArr = new Object[1];
        String str5 = c436540H9w.LIZ.violationType;
        if (str5 != null) {
            str2 = str5;
        }
        objArr[0] = str2;
        c770750ULh.LJFF = C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
        c770750ULh.LJIILIIL = viewSd;
        c770750ULh.LJIILJJIL = true;
        c770750ULh.LJI(context.getString(2131858079), AFwS236S0000000_6.get$arr$(569));
        TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, "video_creation_intervention_dialog");
            C20684815ws.onEventV3("tns_video_creation_intervention_prompt_popup_view");
        }
        C20684815ws.onEventV3("tns_video_creation_intervention_prompt_whyamiseeingthis_click");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS498S0200000_6(QuotedAreaReusedAssem quotedAreaReusedAssem, C0I40 c0i40, int i) {
        super(600L);
        this.$t = i;
        this.l0 = quotedAreaReusedAssem;
        this.l1 = c0i40;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS498S0200000_6(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
