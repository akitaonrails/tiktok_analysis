package com.bytedance.android.livesdk.adminsetting;

import X.C09JN;
import X.C0IJT;
import X.C0TYV;
import X.C0UO0;
import X.C1161920gLG;
import X.C19322110iZ;
import X.C20484615Do;
import X.C474500IjA;
import X.C482260Ivg;
import X.C745220TLc;
import X.C786410Ut5;
import X.EnumC748580TYa;
import X.InterfaceC1112400f3O;
import Y.AfS45S1100000_12;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordApi;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment;
import com.bytedance.android.livesdk.adminsetting.comment.filter.LiveFilterCommentSettingFragmentNew;
import com.bytedance.android.livesdk.adminsetting.fastaddblockwords.LiveFastAddBlockKeywordsDialog;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsModeratorGuide;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class AdminSettingService implements IAdminSettingService {
    public boolean LL;

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommentBlockKeywordsOptFragmentSheet Bv1() {
        return new LiveCommentBlockKeywordsOptFragmentSheet();
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final void Ft0() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(55, new InterfaceC1112400f3O() { // from class: X.00wm
            @Override // X.InterfaceC1112400f3O
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIL(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIIJ(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIIZI(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIJIIJI() {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIJL(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final LiveCapsuleStyleItemConfig LJI() {
                return C952230at3.LIZ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZJ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                CapsuleBizParamsModeratorGuide capsuleBizParamsModeratorGuide;
                Text text;
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                if (capsuleBizParams != null) {
                    capsuleBizParamsModeratorGuide = capsuleBizParams.moderatorGuideInfo;
                } else {
                    capsuleBizParamsModeratorGuide = null;
                }
                if (capsuleBizParamsModeratorGuide != null && (text = capsuleBizParamsModeratorGuide.welcomeMsg) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C0KVU.LIZ(capsuleBizParamsModeratorGuide.hvUser));
                    sbLIZ.append(' ');
                    sbLIZ.append((Object) C1133830fbx.LJIILIIL(text, ""));
                    C1110530f0N c1110530f0N = new C1110530f0N(1, C2188811AlT.LIZIZ(sbLIZ), "", false);
                    c1110530f0N.LJ = "";
                    c1110530f0N.LJIIIZ = "message";
                    ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.WELCOME_CAPSULE;
                    sender.getLogArgs().clear();
                    c1110530f0N.LJIIJ = sender;
                    C784440Upu.LIZ().LIZIZ(c1110530f0N);
                }
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZIZ(c1112330f3H);
            }
        });
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(56, new InterfaceC1112400f3O() { // from class: X.00wl
            @Override // X.InterfaceC1112400f3O
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIL(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIIJ(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIIZI(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIJIIJI() {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIJL(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final LiveCapsuleStyleItemConfig LJI() {
                return C952230at3.LIZ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZJ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                CapsuleBizParamsModeratorGuide capsuleBizParamsModeratorGuide;
                List<String> list;
                FragmentManager fragmentManager;
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                if (capsuleBizParams != null && (capsuleBizParamsModeratorGuide = capsuleBizParams.moderatorGuideInfo) != null && (list = capsuleBizParamsModeratorGuide.recommendSensitiveWords) != null) {
                    IAdminSettingService iAdminSettingService = (IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class);
                    DataChannel dataChannel = c1112330f3H.LLIIIILZ().LJIIIZ;
                    if (dataChannel != null) {
                        fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
                    } else {
                        fragmentManager = null;
                    }
                    iAdminSettingService.jI2(fragmentManager, list);
                    return true;
                }
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZIZ(c1112330f3H);
            }
        });
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommentBlockKeywordsFragment GL2() {
        return new LiveCommentBlockKeywordsFragment();
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommentAddBlockKeywordsOptFragment Ot2() {
        return new LiveCommentAddBlockKeywordsOptFragment(null);
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommentBlockKeywordsOptFragment Rz2() {
        return new LiveCommentBlockKeywordsOptFragment(null);
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveBlockKeywordsFullScreenFragment YT1() {
        return new LiveBlockKeywordsFullScreenFragment();
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final CommunityFlaggedManageSheetFragment eu2() {
        CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment = new CommunityFlaggedManageSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.bytedance.android.live.design.view.sheet.SHOWS_SHEET", false);
        C786410Ut5.LJJJI("from_page", "live_comment_setting", bundle);
        communityFlaggedManageSheetFragment.setArguments(bundle);
        return communityFlaggedManageSheetFragment;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final Class<? extends LiveSheetFragment> Lc0() {
        return LiveMuteSuggestFragmentSheet.class;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final Class<? extends LiveSheetFragment> iM() {
        return LiveCommercialContentToggleFragmentSheet.class;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommentSettingFragment FN0(AwS591S0100000_12 awS591S0100000_12) {
        LiveCommentSettingFragment liveCommentSettingFragment = new LiveCommentSettingFragment(null);
        liveCommentSettingFragment.LLJJJJJIL = awS591S0100000_12;
        liveCommentSettingFragment.LL = "from_page_preview";
        return liveCommentSettingFragment;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveFilterCommentSettingFragmentNew Qj2(String str) {
        LiveFilterCommentSettingFragmentNew liveFilterCommentSettingFragmentNew = new LiveFilterCommentSettingFragmentNew(str);
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.bytedance.android.live.design.view.sheet.SHOWS_SHEET", false);
        liveFilterCommentSettingFragmentNew.setArguments(bundle);
        return liveFilterCommentSettingFragmentNew;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final MuteConfirmDialogFragment n40(Function2 function2) {
        MuteConfirmDialogFragment muteConfirmDialogFragment = new MuteConfirmDialogFragment();
        muteConfirmDialogFragment.LLILZ = function2;
        return muteConfirmDialogFragment;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveBroadcastEndAdminSettingDialog n60(EnumC748580TYa enumC748580TYa) {
        LiveBroadcastEndAdminSettingDialog liveBroadcastEndAdminSettingDialog = new LiveBroadcastEndAdminSettingDialog();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "argument_initial_page", enumC748580TYa);
        C786410Ut5.LJJIZ(bundle, "argument_dim", Boolean.TRUE);
        liveBroadcastEndAdminSettingDialog.setArguments(bundle);
        return liveBroadcastEndAdminSettingDialog;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveAdminSettingDialog vU1(EnumC748580TYa enumC748580TYa) {
        return C0TYV.LIZ(enumC748580TYa, "from_tns_onboarding_capsule", false);
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveAdminSettingDialog xu2(boolean z) {
        return C0TYV.LIZ(EnumC748580TYa.GUIDE, null, z);
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveMuteDurationSettingFragment EU1(View.OnClickListener onClickListener, Function1 function1) {
        LiveMuteDurationSettingFragment liveMuteDurationSettingFragment = new LiveMuteDurationSettingFragment();
        liveMuteDurationSettingFragment.LLILZLL = onClickListener;
        liveMuteDurationSettingFragment.LLIZ = function1;
        return liveMuteDurationSettingFragment;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveAdminSettingDialog Fv2(EnumC748580TYa enumC748580TYa, String str) {
        return C0TYV.LIZ(enumC748580TYa, str, false);
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final void jI2(FragmentManager fragmentManager, List list) {
        if (fragmentManager != null && !fragmentManager.LJL() && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList(list);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJIL(bundle, "key_block_keywords_list", arrayList);
            LiveFastAddBlockKeywordsDialog liveFastAddBlockKeywordsDialog = new LiveFastAddBlockKeywordsDialog();
            liveFastAddBlockKeywordsDialog.setArguments(bundle);
            liveFastAddBlockKeywordsDialog.show(fragmentManager, "LiveFastAddBlockKeywordsDialog");
        }
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommentSettingFragmentSheet pn1(String str, Function1 function1) {
        LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet = new LiveCommentSettingFragmentSheet();
        liveCommentSettingFragmentSheet.LLLL = function1;
        liveCommentSettingFragmentSheet.LLLLII = str;
        return liveCommentSettingFragmentSheet;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final void sT(FragmentManager fragmentManager, long j, int i) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("from_page", "comment", bundle);
        bundle.putLong("target_message_id", j);
        bundle.putInt("presenter_index", i);
        C19322110iZ.LIZLLL(fragmentManager, CommunityFlaggedManageSheetFragment.class, "comment_community_flagged_manage", null, bundle);
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveAdminSettingGuideAdapter PE0(Fragment fragment, DataChannel dataChannel, C20484615Do c20484615Do, LifecycleOwner lifecycleOwner) {
        return new LiveAdminSettingGuideAdapter(fragment, dataChannel, c20484615Do, lifecycleOwner);
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final void M22(long j, String str, FragmentManager fragmentManager, int i, Long l) {
        long jLongValue;
        BlockWordApi blockWordApi = (BlockWordApi) C482260Ivg.LIZJ(BlockWordApi.class);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        blockWordApi.recommendBlockWord(str, j, i, jLongValue).LJIILIIL(new C0UO0()).LJJLL(new AfS45S1100000_12(fragmentManager, 0), new C09JN() { // from class: X.00LM
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AdminSettingService@d467.checkFastSuggestTools$disposable$2");
                C1C7U.LIZIZ("AdminSettingService@d467.checkFastSuggestTools$disposable$2");
            }
        });
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final void VI2(String str, C745220TLc c745220TLc, String str2, long j, Long l) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mute_default_select");
        c474500IjALIZ.LJJII(str, "admin_type");
        c474500IjALIZ.LJJII(Long.valueOf(c745220TLc.LIZ), "default_mute_set");
        c474500IjALIZ.LJJII(str2, "event_page");
        c474500IjALIZ.LJJII(Long.valueOf(j), "anchor_id");
        if (l != null) {
            c474500IjALIZ.LJJII(l, "room_id");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommercialContentToggleFragmentSheet p80(boolean z, boolean z2, LiveMode liveMode, boolean z3, boolean z4, boolean z5) {
        LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet = new LiveCommercialContentToggleFragmentSheet();
        liveCommercialContentToggleFragmentSheet.LLLIIL = z;
        liveCommercialContentToggleFragmentSheet.LLLIILIL = z2;
        liveCommercialContentToggleFragmentSheet.LLLILZJ = liveMode;
        liveCommercialContentToggleFragmentSheet.LLLILZ = z3;
        liveCommercialContentToggleFragmentSheet.LLLILZLLLI = z4;
        liveCommercialContentToggleFragmentSheet.LLLIL = z5;
        return liveCommercialContentToggleFragmentSheet;
    }
}
