package wh6;

import X.AbstractC1906720ziY;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C069P;
import X.C0I0B;
import X.C0PEM;
import X.C0ZDN;
import X.C1166130gS3;
import X.C1219970hqt;
import X.C1224280hxq;
import X.C1224840hyk;
import X.C1225220hzM;
import X.C1226350i1B;
import X.C1228420i4W;
import X.C1228500i4e;
import X.C1228870i5F;
import X.C1228880i5G;
import X.C1229040i5W;
import X.C1229290i5v;
import X.C1229380i64;
import X.C1229390i65;
import X.C1229400i66;
import X.C1231500i9U;
import X.C1260000itS;
import X.C1261270ivV;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1262300ixA;
import X.C1264320j0Q;
import X.C1388190mED;
import X.C13BV;
import X.C13DA;
import X.C13LE;
import X.C1511805vw;
import X.C1529305yl;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C459080HzO;
import X.C461720I8s;
import X.C563770M9f;
import X.C724240Sb0;
import X.C7740030o;
import X.C895170Z9v;
import X.C913630Zsn;
import X.C946803n0;
import X.EnumC1219960hqs;
import X.EnumC1224390hy1;
import X.EnumC1225180hzI;
import X.EnumC1229300i5w;
import X.EnumC1260930iux;
import X.EnumC913760Zt0;
import X.InterfaceC1163280gNS;
import X.InterfaceC1224260hxo;
import X.InterfaceC1224480hyA;
import X.InterfaceC1224490hyB;
import X.InterfaceC1224750hyb;
import X.InterfaceC1263010iyJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType;
import com.ss.android.ugc.aweme.fangroup.api.ICreatorGroupSelectorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.storyreveal.FriendsV3StoryRevealPromoCell;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.viewmodel.ShareVideoPanelViewModel;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.internalshare.impl.external.CreatedGroupAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.MusicFanSpotlightErrorAssem;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationAccessCriteriaAssem;
import com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationConfirmWidgetAssem;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.ss.android.ugc.aweme.publicgroup.fragment.WhoCanJoinPanelFragment;
import com.ss.android.ugc.aweme.publicgroup.vm.PublicGroupCreationVM;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseSquareRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.LargeRectRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRedesignRecUserCell;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupRowCell;
import com.ss.android.ugc.aweme.share.invitelink.InviteLinkGroupInfoAssem;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorConfirmWidgetAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorSearchBarAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListContactCell;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListHeaderCell;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AbS700S0100000_19 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

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
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS700S0100000_19(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS700S0100000_19 abS700S0100000_19, View view) {
        C19EG activity;
        if (view != null) {
            Fragment fragmentLJI = C724240Sb0.LJI((CreatedGroupAssem) abS700S0100000_19.l0);
            if (fragmentLJI != null) {
                activity = fragmentLJI.getActivity();
            } else {
                activity = null;
            }
            C895170Z9v.LIZ(activity, ((C1226350i1B) ((CreatedGroupAssem) abS700S0100000_19.l0).LLJJI.getValue()).LLILLJJLI, ((C1226350i1B) ((CreatedGroupAssem) abS700S0100000_19.l0).LLJJI.getValue()).LLILZ);
        }
    }

    public static final void LIZ$1(AbS700S0100000_19 abS700S0100000_19, View view) {
        if (view != null) {
            AssemVMLazy assemVMLazy = ((MusicFanSpotlightErrorAssem) abS700S0100000_19.l0).LLJJLIIIJLLLLLLLZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicFanSpotlightErrorAssem.LLJLIL;
            ((OriginMusicListViewModel) assemVMLazy.getValue()).refresh();
        }
    }

    public static final void LIZ$10(AbS700S0100000_19 abS700S0100000_19, View view) {
        ShareVideoPanelViewModel shareVideoPanelViewModel;
        if (view != null && (shareVideoPanelViewModel = (ShareVideoPanelViewModel) ((C1260000itS) abS700S0100000_19.l0).LLJILJILJ.getValue()) != null) {
            C1260000itS c1260000itS = (C1260000itS) abS700S0100000_19.l0;
            shareVideoPanelViewModel.vQ2(c1260000itS.LLJIJIL, view, c1260000itS.LLJILJIL, c1260000itS.LLILLL, c1260000itS.LL);
        }
    }

    public static final void LIZ$11(AbS700S0100000_19 abS700S0100000_19, View view) {
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str;
        if (view != null && !((GroupCreationAccessCriteriaAssem) abS700S0100000_19.l0).ip().getState().LLJILJILJ) {
            PublicGroupCreationVM publicGroupCreationVMIp = ((GroupCreationAccessCriteriaAssem) abS700S0100000_19.l0).ip();
            C1229040i5W c1229040i5W = C1229040i5W.LL;
            List list = C1229040i5W.LLILLL;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            if (!(!list.isEmpty()) && (list = publicGroupCreationVMIp.LLILLJJLI) == null) {
                list = C13BV.INSTANCE;
            }
            C1228500i4e c1228500i4e = C1228500i4e.LIZIZ;
            List<Integer> list2 = publicGroupCreationVMIp.xQ2().LJJIIJZLJL;
            c1228500i4e.getClass();
            List listLIZLLL = C1228500i4e.LIZLLL(list, list2);
            if (listLIZLLL == null) {
                listLIZLLL = C13BV.INSTANCE;
            }
            String str2 = WhoCanJoinPanelFragment._pnsPageId;
            Context context = ((GroupCreationAccessCriteriaAssem) abS700S0100000_19.l0).getContext();
            if (context == null) {
                context = C459080HzO.LJ();
            }
            GroupAccessCriteriaCollection groupAccessCriteriaCollection = ((GroupCreationAccessCriteriaAssem) abS700S0100000_19.l0).ip().getState().LLIZLLLIL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", "creation_page");
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(C461720I8s.LIZIZ(), null, "im_local_db");
            if (iMUserLJIIL != null && (imUserBizInfo = iMUserLJIIL.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str = userB2CAccountInfo.userTags) != null) {
                linkedHashMap.put("account_type", str);
            }
            final GroupCreationAccessCriteriaAssem groupCreationAccessCriteriaAssem = (GroupCreationAccessCriteriaAssem) abS700S0100000_19.l0;
            C1166130gS3.LIZ(context, listLIZLLL, groupAccessCriteriaCollection, linkedHashMap, new InterfaceC1163280gNS() { // from class: X.0i51
                @Override // X.InterfaceC1163280gNS
                public final void onCancel() {
                }

                @Override // X.InterfaceC1163280gNS
                public final void LIZ(GroupAccessCriteriaCollection groupAccessCriteriaCollection2, AwS562S0100000_18 awS562S0100000_18) {
                    PublicGroupCreationVM publicGroupCreationVMIp2 = groupCreationAccessCriteriaAssem.ip();
                    Context context2 = groupCreationAccessCriteriaAssem.getContext();
                    if (context2 == null) {
                        context2 = C459080HzO.LJ();
                    }
                    publicGroupCreationVMIp2.setState(new AwS385S0200000_19(context2, groupAccessCriteriaCollection2, 76));
                    awS562S0100000_18.invoke();
                }
            });
        }
    }

    public static final void LIZ$12(AbS700S0100000_19 abS700S0100000_19, View view) {
        GroupAccessCriteria groupAccessCriteria;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String string;
        String str2;
        GroupAccessCriteria groupAccessCriteria2;
        Map<String, String> map;
        if (view != null) {
            AssemVMLazy assemVMLazy = ((GroupCreationConfirmWidgetAssem) abS700S0100000_19.l0).LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupCreationConfirmWidgetAssem.LLJJJ;
            final PublicGroupCreationVM publicGroupCreationVM = (PublicGroupCreationVM) assemVMLazy.getValue();
            final Context context = ((GroupCreationConfirmWidgetAssem) abS700S0100000_19.l0).getContext();
            if (context == null) {
                context = C459080HzO.LJ();
            }
            C1228870i5F state = publicGroupCreationVM.getState();
            GroupAccessCriteriaCollection groupAccessCriteriaCollection = state.LLIZLLLIL;
            Integer numValueOf = null;
            if (groupAccessCriteriaCollection != null) {
                groupAccessCriteria = groupAccessCriteriaCollection.selectedAccessCriteria;
            } else {
                groupAccessCriteria = null;
            }
            if (state.LL.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (groupAccessCriteria == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (state.LLILLL.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z && !z2 && !z3) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                GroupAccessCriteriaCollection groupAccessCriteriaCollection2 = state.LLIZLLLIL;
                if (groupAccessCriteriaCollection2 != null && (map = groupAccessCriteriaCollection2.eventTracking) != null) {
                    linkedHashMap.putAll(map);
                }
                if (groupAccessCriteria != null) {
                    str = groupAccessCriteria.key;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put("selected_access_criteria_key", str);
                if (groupAccessCriteria == null || (string = Integer.valueOf(groupAccessCriteria.accessCriteriaType).toString()) == null) {
                    string = "";
                }
                linkedHashMap.put("selected_access_criteria_type", string);
                if (state.LLILZLL) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
                linkedHashMap.put("display_status", str2);
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1511805vw(publicGroupCreationVM, publicGroupCreationVM.xQ2().LIZ, publicGroupCreationVM.xQ2().LIZIZ, linkedHashMap, C0I0B.LJFF.LIZIZ(), null), 3);
                publicGroupCreationVM.setState(AFwS257S0000000_19.get$arr$(540));
                C1229380i64 c1229380i64LJJIJLIJ = C913630Zsn.LJJIJLIJ(C913630Zsn.LJIIJJI, publicGroupCreationVM.wQ2().LLILLJJLI, publicGroupCreationVM.wQ2().LLILLL);
                C13BV c13bv = C13BV.INSTANCE;
                C1219970hqt c1219970hqt = EnumC1219960hqs.Companion;
                int i = state.LLIZ;
                c1219970hqt.getClass();
                EnumC1219960hqs enumC1219960hqsLIZ = C1219970hqt.LIZ(i);
                GroupAccessCriteriaCollection groupAccessCriteriaCollection3 = publicGroupCreationVM.getState().LLIZLLLIL;
                if (groupAccessCriteriaCollection3 != null) {
                    groupAccessCriteria2 = groupAccessCriteriaCollection3.selectedAccessCriteria;
                } else {
                    groupAccessCriteria2 = null;
                }
                C1229290i5v c1229290i5v = EnumC1229300i5w.Companion;
                if (groupAccessCriteria2 != null) {
                    numValueOf = Integer.valueOf(groupAccessCriteria2.accessCriteriaType);
                }
                c1229290i5v.getClass();
                EnumC913760Zt0 groupType = C1229290i5v.LIZ(numValueOf).toGroupType();
                String str3 = state.LL;
                String str4 = state.LLILLL;
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("a:show_on_profile", C1529305yl.LIZ(Boolean.valueOf(state.LLILZLL)));
                pairArr[1] = new Pair("a:audit_question", state.LLILZIL);
                String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), Collections.singletonList(groupAccessCriteria));
                if (json == null) {
                    json = "";
                }
                pairArr[2] = new Pair("a:access_criteria", json);
                C1229390i65 c1229390i65 = new C1229390i65(c13bv, enumC1219960hqsLIZ, groupType, null, null, C2097608Jq.LJIIIIZZ(pairArr), null, str3, str4, 88);
                String str5 = publicGroupCreationVM.xQ2().LIZ;
                String str6 = publicGroupCreationVM.xQ2().LIZIZ;
                C13DA c13da = new C13DA();
                Map<String, String> map2 = publicGroupCreationVM.xQ2().LJIIIZ;
                c13da.putAll(linkedHashMap);
                String str7 = map2.get("enter_position");
                if (str7 != null) {
                    c13da.put("enter_position", str7);
                }
                c1229380i64LJJIJLIJ.LIZ(c1229390i65, new C1229400i66(str5, str6, c13da.build(), 8), new C1231500i9U() { // from class: X.0i4x
                    @Override // X.C1231500i9U, X.InterfaceC863580XuG, X.InterfaceC863600XuI
                    public final void LIZIZ(C0YMW c0ymw) {
                        super.LIZIZ(c0ymw);
                        InterfaceC1228750i53 interfaceC1228750i53 = publicGroupCreationVM.vQ2().LIZLLL;
                        if (interfaceC1228750i53 != null) {
                            interfaceC1228750i53.LIZIZ();
                        }
                        C1440005kM.LIZ(new C1617806Vc(false, null, publicGroupCreationVM.xQ2().LIZLLL));
                        publicGroupCreationVM.setState(AFwS257S0000000_19.get$arr$(541));
                    }

                    @Override // X.C1231500i9U, X.InterfaceC863580XuG
                    /* JADX INFO: renamed from: LIZJ */
                    public final void LJ(C0Y8T c0y8t, C0YMW c0ymw) {
                        Context context2;
                        List<Integer> listLJJLJ;
                        int[] iArr;
                        if (c0y8t == null) {
                            return;
                        }
                        super.LJ(c0y8t, c0ymw);
                        InterfaceC1228750i53 interfaceC1228750i53 = publicGroupCreationVM.vQ2().LIZLLL;
                        if (interfaceC1228750i53 != null) {
                            interfaceC1228750i53.LIZ(c0y8t);
                        }
                        C1440005kM.LIZ(new C1617806Vc(true, c0y8t, publicGroupCreationVM.xQ2().LIZLLL));
                        int i2 = publicGroupCreationVM.vQ2().LIZ;
                        IMContact iMContactLJI = null;
                        if (i2 == EnumC1228720i50.CHAT_ROOM.getValue()) {
                            IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                            Context context3 = context;
                            IIMContactUtilService.LIZ.getClass();
                            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                            if (iIMContactUtilServiceLIZ != null) {
                                iMContactLJI = iIMContactUtilServiceLIZ.LJI(c0y8t);
                            }
                            EnterChatParams enterChatParams = new EnterChatParams(context3, iMContactLJI);
                            PublicGroupCreationVM publicGroupCreationVM2 = publicGroupCreationVM;
                            enterChatParams.setNewGroupChat(true);
                            enterChatParams.setChatType(3);
                            enterChatParams.setEnterFrom(15);
                            enterChatParams.setEnterMethodForMob(publicGroupCreationVM2.xQ2().LIZIZ);
                            enterChatParams.setSessionId(c0y8t.getConversationId());
                            enterChatParams.setEnterFromForMob(publicGroupCreationVM2.xQ2().LIZ);
                            if (!publicGroupCreationVM2.xQ2().LJIIJ) {
                                enterChatParams.setQuickChat(true);
                                enterChatParams.setDisableBackGroundMaskForQuickChat(publicGroupCreationVM2.xQ2().LJIIL ? 1 : 0);
                                enterChatParams.setQuickChatViewType(publicGroupCreationVM2.vQ2().LIZIZ);
                            }
                            if (publicGroupCreationVM2.vQ2().LIZJ.length() > 0) {
                                enterChatParams.setTrafficType(publicGroupCreationVM2.vQ2().LIZJ);
                            }
                            imChatService.LJIILLIIL(enterChatParams, null);
                        } else if (i2 == EnumC1228720i50.GROUP_LIST.getValue()) {
                            Context context4 = context;
                            if (context4 != null) {
                                PublicGroupCreationVM publicGroupCreationVM3 = publicGroupCreationVM;
                                C913630Zsn.LJJIJLIJ(C913630Zsn.LJIIJJI, publicGroupCreationVM3.wQ2().LLILLJJLI, publicGroupCreationVM3.wQ2().LLILLL).LJFF(context4, new C1228470i4b(C1228650i4t.LIZ(publicGroupCreationVM3.xQ2(), null, null, null, null, 0, C1228700i4y.LIZ(publicGroupCreationVM3.vQ2(), EnumC1228720i50.NONE.getValue(), null, 30), false, null, null, false, null, false, false, 0, 0, false, false, false, null, null, false, false, null, -33, 1), publicGroupCreationVM3.wQ2().LL.LIZIZ));
                            }
                        } else if (i2 == EnumC1228720i50.FAN_GROUP_ANCHOR_CREATOR_GROUP.getValue() && (context2 = context) != null) {
                            PublicGroupCreationVM publicGroupCreationVM4 = publicGroupCreationVM;
                            ICreatorGroupSelectorService.LIZ.getClass();
                            ICreatorGroupSelectorService value = C1228740i52.LIZIZ.getValue();
                            if (value != null) {
                                String str8 = publicGroupCreationVM4.xQ2().LIZ;
                                String str9 = publicGroupCreationVM4.xQ2().LIZIZ;
                                Integer num = null;
                                C1226850i1z c1226850i1z = new C1226850i1z("", "", null, null, null);
                                Object obj = publicGroupCreationVM4.xQ2().LJFF.LJ.get("invite_list_type");
                                if ((obj instanceof int[]) && (iArr = (int[]) obj) != null) {
                                    listLJJLJ = C13LQ.LJJLJ(iArr);
                                } else {
                                    listLJJLJ = null;
                                }
                                c1226850i1z.setInviteTypeList(listLJJLJ);
                                Object obj2 = publicGroupCreationVM4.xQ2().LJFF.LJ.get("time_range");
                                if (obj2 instanceof Integer) {
                                    num = (Integer) obj2;
                                }
                                c1226850i1z.setTimeRange(num);
                                c1226850i1z.setEnterFrom(publicGroupCreationVM4.xQ2().LIZ);
                                c1226850i1z.setEnterMethod(publicGroupCreationVM4.xQ2().LIZIZ);
                                value.LIZ(context2, str8, str9, true, false, 500L, c1226850i1z);
                            }
                        }
                        publicGroupCreationVM.setState(AFwS257S0000000_19.get$arr$(542));
                    }
                }, null);
                return;
            }
            publicGroupCreationVM.setState(new C1228880i5G(z, z2, z3));
        }
    }

    public static final void LIZ$13(AbS700S0100000_19 abS700S0100000_19, View view) {
        C19EG c19egLIZIZ;
        if (view != null && (c19egLIZIZ = C1388190mED.LIZIZ(view.getContext())) != null) {
            IRecommendUsersService iRecommendUsersService = (IRecommendUsersService) ServiceManager.get().getService(IRecommendUsersService.class);
            C1261270ivV c1261270ivV = ((C1262300ixA) abS700S0100000_19.l0).trackerConfig;
            iRecommendUsersService.LIZJ(c19egLIZIZ, c1261270ivV.LIZ, c1261270ivV.LIZLLL);
        }
    }

    public static final void LIZ$14(AbS700S0100000_19 abS700S0100000_19, View view) {
        C563770M9f c563770M9fLIZLLL;
        if (view != null) {
            EnterStoryParam enterStoryParam = new EnterStoryParam("story", EnumC1225180hzI.CLICK_REVEAL_MARKETING_POST_HEAD.getMobValue(), "homepage_friends", null, null, null, null, null, null, false, false, false, 0, 0.0f, 9, null, null, null, null, null, StoryUploadPageEntranceType.REVEAL_ONLY, false, null, false, null, null, 66043896, null);
            SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
            if (socMediaPickerService != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
                c563770M9fLIZLLL.openStoryRecordingPageDirectly(((FriendsV3StoryRevealPromoCell) abS700S0100000_19.l0).itemView.getContext(), enterStoryParam, null);
            }
        }
    }

    public static final void LIZ$15(AbS700S0100000_19 abS700S0100000_19, View view) {
        C563770M9f c563770M9fLIZLLL;
        if (view != null) {
            EnterStoryParam enterStoryParam = new EnterStoryParam("story", EnumC1225180hzI.CLICK_REVEAL_MARKETING_POST_CREATE.getMobValue(), "homepage_friends", null, null, null, null, null, null, false, false, false, 0, 0.0f, 9, null, null, null, null, null, StoryUploadPageEntranceType.REVEAL_ONLY, false, null, false, null, null, 66043896, null);
            SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
            if (socMediaPickerService != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
                c563770M9fLIZLLL.openStoryRecordingPageDirectly(((FriendsV3StoryRevealPromoCell) abS700S0100000_19.l0).itemView.getContext(), enterStoryParam, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$16(AbS700S0100000_19 abS700S0100000_19, View view) {
        C1261650iw7 c1261650iw7;
        InterfaceC494301wD interfaceC494301wDLIZ;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        Fragment fragmentLIZ2;
        Lifecycle lifecycle2;
        String strLJJJLIIL2;
        if (view != null && (c1261650iw7 = (C1261650iw7) ((BaseRectRecUserCell) abS700S0100000_19.l0).getItem()) != null) {
            BaseRectRecUserCell baseRectRecUserCell = (BaseRectRecUserCell) abS700S0100000_19.l0;
            InterfaceC494301wD interfaceC494301wD = null;
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
            if (!Intrinsics.LJFF(baseRectRecUserCell.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = baseRectRecUserCell.getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ2 = (Fragment) lifecycleOwner) != null) || (fragmentLIZ2 = C946803n0.LIZ(baseRectRecUserCell.itemView)) != null) && (fragmentLIZ2.isDetached() || !fragmentLIZ2.isAdded())) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = baseRectRecUserCell.getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle2.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = baseRectRecUserCell.I5();
                            if (interfaceC1263010iyJI5 != null) {
                                strLJJJLIIL2 = interfaceC1263010iyJI5.LJJJLIIL();
                            } else {
                                strLJJJLIIL2 = null;
                            }
                            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(baseRectRecUserCell.itemView, null), IUserCardListAbility.class, strLJJJLIIL2);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL2);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                                sbLIZ.append(" not found, parent: ");
                                sbLIZ.append(baseRectRecUserCell.itemView.getParent());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c1264320j0Q.getClass();
                                C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                            }
                        }
                    }
                }
                interfaceC494301wDLIZ = null;
            } else {
                interfaceC494301wDLIZ = null;
            }
            IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
            if (iUserCardListAbility != null) {
                iUserCardListAbility.cN1(c1261650iw7.LLILZIL);
            }
            BaseRectRecUserCell baseRectRecUserCell2 = (BaseRectRecUserCell) abS700S0100000_19.l0;
            try {
                if (!Intrinsics.LJFF(baseRectRecUserCell2.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                    LifecycleOwner lifecycleOwner3 = baseRectRecUserCell2.getLifecycleOwner();
                    if ((((lifecycleOwner3 instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner3) != null) || (fragmentLIZ = C946803n0.LIZ(baseRectRecUserCell2.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                    } else {
                        LifecycleOwner lifecycleOwner4 = baseRectRecUserCell2.getLifecycleOwner();
                        if (lifecycleOwner4 != null && (lifecycle = lifecycleOwner4.getLifecycle()) != null) {
                            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                                C1264320j0Q.LIZ.getClass();
                                C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                            } else {
                                InterfaceC1263010iyJ interfaceC1263010iyJI52 = baseRectRecUserCell2.I5();
                                if (interfaceC1263010iyJI52 != null) {
                                    strLJJJLIIL = interfaceC1263010iyJI52.LJJJLIIL();
                                } else {
                                    strLJJJLIIL = null;
                                }
                                InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(C1558360qeg.LJ(baseRectRecUserCell2.itemView, null), RecUserCellTrackAbility.class, strLJJJLIIL);
                                if (interfaceC494301wDLIZ2 == null) {
                                    C1264320j0Q c1264320j0Q2 = C1264320j0Q.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strLJJJLIIL);
                                    sbLIZ2.append("'s ");
                                    sbLIZ2.append(C13LE.LIZ(RecUserCellTrackAbility.class).LJI());
                                    sbLIZ2.append(" not found, parent: ");
                                    sbLIZ2.append(baseRectRecUserCell2.itemView.getParent());
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    c1264320j0Q2.getClass();
                                    C1264320j0Q.LIZIZ("Ability", strLIZIZ2, null);
                                }
                                interfaceC494301wD = interfaceC494301wDLIZ2;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th2);
            }
            RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) interfaceC494301wD;
            if (recUserCellTrackAbility != null) {
                recUserCellTrackAbility.LJI(((BaseRectRecUserCell) abS700S0100000_19.l0).N5(), c1261650iw7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$17(AbS700S0100000_19 abS700S0100000_19, View view) {
        C1261650iw7 c1261650iw7;
        InterfaceC494301wD interfaceC494301wDLIZ;
        InterfaceC494301wD interfaceC494301wDLIZ2;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        Fragment fragmentLIZ2;
        Lifecycle lifecycle2;
        String strLJJJLIIL2;
        Fragment fragmentLIZ3;
        Lifecycle lifecycle3;
        String strLJJJLIIL3;
        if (view != null && (c1261650iw7 = (C1261650iw7) ((RectRedesignRecUserCell) abS700S0100000_19.l0).getItem()) != null) {
            new C0ZDN(((RectRedesignRecUserCell) abS700S0100000_19.l0).itemView.getContext()).LIZ(0);
            RectRedesignRecUserCell rectRedesignRecUserCell = (RectRedesignRecUserCell) abS700S0100000_19.l0;
            InterfaceC494301wD interfaceC494301wD = null;
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
            if (!Intrinsics.LJFF(rectRedesignRecUserCell.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = rectRedesignRecUserCell.getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ3 = (Fragment) lifecycleOwner) != null) || (fragmentLIZ3 = C946803n0.LIZ(rectRedesignRecUserCell.itemView)) != null) && (fragmentLIZ3.isDetached() || !fragmentLIZ3.isAdded())) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = rectRedesignRecUserCell.getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle3 = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle3.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = rectRedesignRecUserCell.I5();
                            if (interfaceC1263010iyJI5 != null) {
                                strLJJJLIIL3 = interfaceC1263010iyJI5.LJJJLIIL();
                            } else {
                                strLJJJLIIL3 = null;
                            }
                            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(rectRedesignRecUserCell.itemView, null), IUserCardListAbility.class, strLJJJLIIL3);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL3);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                                sbLIZ.append(" not found, parent: ");
                                sbLIZ.append(rectRedesignRecUserCell.itemView.getParent());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c1264320j0Q.getClass();
                                C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                            }
                        }
                    }
                }
                interfaceC494301wDLIZ = null;
            } else {
                interfaceC494301wDLIZ = null;
            }
            IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
            if (iUserCardListAbility != null) {
                iUserCardListAbility.cN1(c1261650iw7.LLILZIL);
            }
            RectRedesignRecUserCell rectRedesignRecUserCell2 = (RectRedesignRecUserCell) abS700S0100000_19.l0;
            try {
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th2);
            }
            if (!Intrinsics.LJFF(rectRedesignRecUserCell2.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner3 = rectRedesignRecUserCell2.getLifecycleOwner();
                if ((((lifecycleOwner3 instanceof Fragment) && (fragmentLIZ2 = (Fragment) lifecycleOwner3) != null) || (fragmentLIZ2 = C946803n0.LIZ(rectRedesignRecUserCell2.itemView)) != null) && (fragmentLIZ2.isDetached() || !fragmentLIZ2.isAdded())) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner4 = rectRedesignRecUserCell2.getLifecycleOwner();
                    if (lifecycleOwner4 != null && (lifecycle2 = lifecycleOwner4.getLifecycle()) != null) {
                        if (lifecycle2.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI52 = rectRedesignRecUserCell2.I5();
                            if (interfaceC1263010iyJI52 != null) {
                                strLJJJLIIL2 = interfaceC1263010iyJI52.LJJJLIIL();
                            } else {
                                strLJJJLIIL2 = null;
                            }
                            interfaceC494301wDLIZ2 = C1558520qew.LIZ(C1558360qeg.LJ(rectRedesignRecUserCell2.itemView, null), RecUserCellTrackAbility.class, strLJJJLIIL2);
                            if (interfaceC494301wDLIZ2 == null) {
                                C1264320j0Q c1264320j0Q2 = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLJJJLIIL2);
                                sbLIZ2.append("'s ");
                                sbLIZ2.append(C13LE.LIZ(RecUserCellTrackAbility.class).LJI());
                                sbLIZ2.append(" not found, parent: ");
                                sbLIZ2.append(rectRedesignRecUserCell2.itemView.getParent());
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                c1264320j0Q2.getClass();
                                C1264320j0Q.LIZIZ("Ability", strLIZIZ2, null);
                            }
                        }
                    }
                }
                interfaceC494301wDLIZ2 = null;
            } else {
                interfaceC494301wDLIZ2 = null;
            }
            RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) interfaceC494301wDLIZ2;
            if (recUserCellTrackAbility != null) {
                recUserCellTrackAbility.LJI(((RectRedesignRecUserCell) abS700S0100000_19.l0).N5(), c1261650iw7);
            }
            RectRedesignRecUserCell rectRedesignRecUserCell3 = (RectRedesignRecUserCell) abS700S0100000_19.l0;
            try {
                if (!Intrinsics.LJFF(rectRedesignRecUserCell3.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                    LifecycleOwner lifecycleOwner5 = rectRedesignRecUserCell3.getLifecycleOwner();
                    if ((((lifecycleOwner5 instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner5) != null) || (fragmentLIZ = C946803n0.LIZ(rectRedesignRecUserCell3.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                    } else {
                        LifecycleOwner lifecycleOwner6 = rectRedesignRecUserCell3.getLifecycleOwner();
                        if (lifecycleOwner6 != null && (lifecycle = lifecycleOwner6.getLifecycle()) != null) {
                            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                                C1264320j0Q.LIZ.getClass();
                                C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                            } else {
                                InterfaceC1263010iyJ interfaceC1263010iyJI53 = rectRedesignRecUserCell3.I5();
                                if (interfaceC1263010iyJI53 != null) {
                                    strLJJJLIIL = interfaceC1263010iyJI53.LJJJLIIL();
                                } else {
                                    strLJJJLIIL = null;
                                }
                                InterfaceC494301wD interfaceC494301wDLIZ3 = C1558520qew.LIZ(C1558360qeg.LJ(rectRedesignRecUserCell3.itemView, null), RecUserCellTrackAbility.class, strLJJJLIIL);
                                if (interfaceC494301wDLIZ3 == null) {
                                    C1264320j0Q c1264320j0Q3 = C1264320j0Q.LIZ;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(strLJJJLIIL);
                                    sbLIZ3.append("'s ");
                                    sbLIZ3.append(C13LE.LIZ(RecUserCellTrackAbility.class).LJI());
                                    sbLIZ3.append(" not found, parent: ");
                                    sbLIZ3.append(rectRedesignRecUserCell3.itemView.getParent());
                                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                                    c1264320j0Q3.getClass();
                                    C1264320j0Q.LIZIZ("Ability", strLIZIZ3, null);
                                }
                                interfaceC494301wD = interfaceC494301wDLIZ3;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th3);
            }
            RecUserCellTrackAbility recUserCellTrackAbility2 = (RecUserCellTrackAbility) interfaceC494301wD;
            if (recUserCellTrackAbility2 != null) {
                C1261860iwS c1261860iwS = c1261650iw7.LLILZIL;
                RectRedesignRecUserCell rectRedesignRecUserCell4 = (RectRedesignRecUserCell) abS700S0100000_19.l0;
                recUserCellTrackAbility2.LJFF(c1261860iwS, rectRedesignRecUserCell4.LLJLILLLLZIIL, rectRedesignRecUserCell4.LLJLL, rectRedesignRecUserCell4.LLJLLIL, EnumC1260930iux.REMOVE);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$18(AbS700S0100000_19 abS700S0100000_19, View view) {
        C1261650iw7 c1261650iw7;
        InterfaceC494301wD interfaceC494301wDLIZ;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        Fragment fragmentLIZ2;
        Lifecycle lifecycle2;
        String strLJJJLIIL2;
        if (view != null && (c1261650iw7 = (C1261650iw7) ((BaseSquareRecUserCell) abS700S0100000_19.l0).getItem()) != null) {
            BaseSquareRecUserCell baseSquareRecUserCell = (BaseSquareRecUserCell) abS700S0100000_19.l0;
            InterfaceC494301wD interfaceC494301wD = null;
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
            if (!Intrinsics.LJFF(baseSquareRecUserCell.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = baseSquareRecUserCell.getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ2 = (Fragment) lifecycleOwner) != null) || (fragmentLIZ2 = C946803n0.LIZ(baseSquareRecUserCell.itemView)) != null) && (fragmentLIZ2.isDetached() || !fragmentLIZ2.isAdded())) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = baseSquareRecUserCell.getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle2.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = baseSquareRecUserCell.I5();
                            if (interfaceC1263010iyJI5 != null) {
                                strLJJJLIIL2 = interfaceC1263010iyJI5.LJJJLIIL();
                            } else {
                                strLJJJLIIL2 = null;
                            }
                            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(baseSquareRecUserCell.itemView, null), IUserCardListAbility.class, strLJJJLIIL2);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL2);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                                sbLIZ.append(" not found, parent: ");
                                sbLIZ.append(baseSquareRecUserCell.itemView.getParent());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c1264320j0Q.getClass();
                                C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                            }
                        }
                    }
                }
                interfaceC494301wDLIZ = null;
            } else {
                interfaceC494301wDLIZ = null;
            }
            IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
            if (iUserCardListAbility != null) {
                iUserCardListAbility.cN1(c1261650iw7.LLILZIL);
            }
            BaseSquareRecUserCell baseSquareRecUserCell2 = (BaseSquareRecUserCell) abS700S0100000_19.l0;
            try {
                if (!Intrinsics.LJFF(baseSquareRecUserCell2.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                    LifecycleOwner lifecycleOwner3 = baseSquareRecUserCell2.getLifecycleOwner();
                    if ((((lifecycleOwner3 instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner3) != null) || (fragmentLIZ = C946803n0.LIZ(baseSquareRecUserCell2.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                    } else {
                        LifecycleOwner lifecycleOwner4 = baseSquareRecUserCell2.getLifecycleOwner();
                        if (lifecycleOwner4 != null && (lifecycle = lifecycleOwner4.getLifecycle()) != null) {
                            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                                C1264320j0Q.LIZ.getClass();
                                C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                            } else {
                                InterfaceC1263010iyJ interfaceC1263010iyJI52 = baseSquareRecUserCell2.I5();
                                if (interfaceC1263010iyJI52 != null) {
                                    strLJJJLIIL = interfaceC1263010iyJI52.LJJJLIIL();
                                } else {
                                    strLJJJLIIL = null;
                                }
                                InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(C1558360qeg.LJ(baseSquareRecUserCell2.itemView, null), RecUserCellTrackAbility.class, strLJJJLIIL);
                                if (interfaceC494301wDLIZ2 == null) {
                                    C1264320j0Q c1264320j0Q2 = C1264320j0Q.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strLJJJLIIL);
                                    sbLIZ2.append("'s ");
                                    sbLIZ2.append(C13LE.LIZ(RecUserCellTrackAbility.class).LJI());
                                    sbLIZ2.append(" not found, parent: ");
                                    sbLIZ2.append(baseSquareRecUserCell2.itemView.getParent());
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    c1264320j0Q2.getClass();
                                    C1264320j0Q.LIZIZ("Ability", strLIZIZ2, null);
                                }
                                interfaceC494301wD = interfaceC494301wDLIZ2;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th2);
            }
            RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) interfaceC494301wD;
            if (recUserCellTrackAbility != null) {
                recUserCellTrackAbility.LJI(((BaseSquareRecUserCell) abS700S0100000_19.l0).N5(), c1261650iw7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$19(AbS700S0100000_19 abS700S0100000_19, View view) {
        C1261650iw7 c1261650iw7;
        InterfaceC494301wD interfaceC494301wDLIZ;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        Fragment fragmentLIZ2;
        Lifecycle lifecycle2;
        String strLJJJLIIL2;
        if (view != null && (c1261650iw7 = (C1261650iw7) ((LargeRectRecUserCell) abS700S0100000_19.l0).getItem()) != null) {
            LargeRectRecUserCell largeRectRecUserCell = (LargeRectRecUserCell) abS700S0100000_19.l0;
            InterfaceC494301wD interfaceC494301wD = null;
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
            if (!Intrinsics.LJFF(largeRectRecUserCell.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = largeRectRecUserCell.getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ2 = (Fragment) lifecycleOwner) != null) || (fragmentLIZ2 = C946803n0.LIZ(largeRectRecUserCell.itemView)) != null) && (fragmentLIZ2.isDetached() || !fragmentLIZ2.isAdded())) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = largeRectRecUserCell.getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle2.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = largeRectRecUserCell.I5();
                            if (interfaceC1263010iyJI5 != null) {
                                strLJJJLIIL2 = interfaceC1263010iyJI5.LJJJLIIL();
                            } else {
                                strLJJJLIIL2 = null;
                            }
                            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(largeRectRecUserCell.itemView, null), IUserCardListAbility.class, strLJJJLIIL2);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL2);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                                sbLIZ.append(" not found, parent: ");
                                sbLIZ.append(largeRectRecUserCell.itemView.getParent());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c1264320j0Q.getClass();
                                C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                            }
                        }
                    }
                }
                interfaceC494301wDLIZ = null;
            } else {
                interfaceC494301wDLIZ = null;
            }
            IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
            if (iUserCardListAbility != null) {
                iUserCardListAbility.cN1(c1261650iw7.LLILZIL);
            }
            LargeRectRecUserCell largeRectRecUserCell2 = (LargeRectRecUserCell) abS700S0100000_19.l0;
            try {
                if (!Intrinsics.LJFF(largeRectRecUserCell2.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                    LifecycleOwner lifecycleOwner3 = largeRectRecUserCell2.getLifecycleOwner();
                    if ((((lifecycleOwner3 instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner3) != null) || (fragmentLIZ = C946803n0.LIZ(largeRectRecUserCell2.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                    } else {
                        LifecycleOwner lifecycleOwner4 = largeRectRecUserCell2.getLifecycleOwner();
                        if (lifecycleOwner4 != null && (lifecycle = lifecycleOwner4.getLifecycle()) != null) {
                            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                                C1264320j0Q.LIZ.getClass();
                                C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                            } else {
                                InterfaceC1263010iyJ interfaceC1263010iyJI52 = largeRectRecUserCell2.I5();
                                if (interfaceC1263010iyJI52 != null) {
                                    strLJJJLIIL = interfaceC1263010iyJI52.LJJJLIIL();
                                } else {
                                    strLJJJLIIL = null;
                                }
                                InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(C1558360qeg.LJ(largeRectRecUserCell2.itemView, null), RecUserCellTrackAbility.class, strLJJJLIIL);
                                if (interfaceC494301wDLIZ2 == null) {
                                    C1264320j0Q c1264320j0Q2 = C1264320j0Q.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strLJJJLIIL);
                                    sbLIZ2.append("'s ");
                                    sbLIZ2.append(C13LE.LIZ(RecUserCellTrackAbility.class).LJI());
                                    sbLIZ2.append(" not found, parent: ");
                                    sbLIZ2.append(largeRectRecUserCell2.itemView.getParent());
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    c1264320j0Q2.getClass();
                                    C1264320j0Q.LIZIZ("Ability", strLIZIZ2, null);
                                }
                                interfaceC494301wD = interfaceC494301wDLIZ2;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th2);
            }
            RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) interfaceC494301wD;
            if (recUserCellTrackAbility != null) {
                recUserCellTrackAbility.LJI(((LargeRectRecUserCell) abS700S0100000_19.l0).N5(), c1261650iw7);
            }
        }
    }

    public static final void LIZ$2(AbS700S0100000_19 abS700S0100000_19, View view) {
        C1225220hzM item;
        C1228420i4W c1228420i4W;
        Function1<C1225220hzM, Unit> function1;
        if (view != null && (item = ((FanGroupChooseGroupRowCell) abS700S0100000_19.l0).getItem()) != null && item.LLILZIL && !item.LLIZLLLIL) {
            AbstractC1906720ziY chunk = ((FanGroupChooseGroupRowCell) abS700S0100000_19.l0).getChunk();
            if ((chunk instanceof C1228420i4W) && (c1228420i4W = (C1228420i4W) chunk) != null && (function1 = c1228420i4W.LLIZLLLIL) != null) {
                function1.invoke(item);
            }
        }
    }

    public static final void LIZ$3(AbS700S0100000_19 abS700S0100000_19, View view) {
        C1225220hzM item;
        C1228420i4W c1228420i4W;
        Function1<C1225220hzM, Unit> function1;
        if (view != null && (item = ((FanGroupChooseGroupRowCell) abS700S0100000_19.l0).getItem()) != null && item.LLJ) {
            AbstractC1906720ziY chunk = ((FanGroupChooseGroupRowCell) abS700S0100000_19.l0).getChunk();
            if ((chunk instanceof C1228420i4W) && (c1228420i4W = (C1228420i4W) chunk) != null && (function1 = c1228420i4W.LLJ) != null) {
                function1.invoke(item);
            }
        }
    }

    public static final void LIZ$4(AbS700S0100000_19 abS700S0100000_19, View view) {
        if (view != null) {
            ((InviteLinkGroupInfoAssem) abS700S0100000_19.l0).Go().vQ2(view, "group_info_copy_link");
        }
    }

    public static final void LIZ$5(AbS700S0100000_19 abS700S0100000_19, View view) {
        C1224840hyk item;
        InterfaceC1224750hyb interfaceC1224750hybV5;
        if (view != null) {
            InterfaceC1224750hyb interfaceC1224750hybV52 = ((SelectorListContactCell) abS700S0100000_19.l0).V5();
            if ((interfaceC1224750hybV52 != null && interfaceC1224750hybV52.S12()) || (item = ((SelectorListContactCell) abS700S0100000_19.l0).getItem()) == null || !item.LLIZLLLIL) {
                return;
            }
            if (!((SelectorListContactCell) abS700S0100000_19.l0).T5().LJ().LJIIJJI(item) && !item.LLJILJILJ && ((SelectorListContactCell) abS700S0100000_19.l0).T5().LJ().LJJIZ().LIZJ() != EnumC1224390hy1.DISABLE && (interfaceC1224750hybV5 = ((SelectorListContactCell) abS700S0100000_19.l0).V5()) != null) {
                interfaceC1224750hybV5.hy2(item, true ^ item.LLJILJIL);
            }
            ((SelectorListContactCell) abS700S0100000_19.l0).T5().LJ().LJI(item);
        }
    }

    public static final void LIZ$6(AbS700S0100000_19 abS700S0100000_19, View view) {
        if (view != null) {
            InterfaceC1224750hyb interfaceC1224750hybS5 = ((SelectorListHeaderCell) abS700S0100000_19.l0).S5();
            if (interfaceC1224750hybS5 != null && interfaceC1224750hybS5.S12()) {
                return;
            }
            InterfaceC1224260hxo interfaceC1224260hxoR5 = ((SelectorListHeaderCell) abS700S0100000_19.l0).R5();
            if (interfaceC1224260hxoR5 != null) {
                interfaceC1224260hxoR5.LIZIZ();
            }
            InterfaceC1224480hyA interfaceC1224480hyALIZJ = ((C1224280hxq) ((SelectorListHeaderCell) abS700S0100000_19.l0).LLILLL.getValue()).LIZJ();
            if (interfaceC1224480hyALIZJ == null) {
                return;
            }
            ((SelectorListHeaderCell) abS700S0100000_19.l0).getItem();
            interfaceC1224480hyALIZJ.LJIIIIZZ();
        }
    }

    public static final void LIZ$7(AbS700S0100000_19 abS700S0100000_19, View view) {
        if (view != null) {
            ((InterfaceC1224490hyB) ((SelectorConfirmWidgetAssem) abS700S0100000_19.l0).LLJJIII.getValue()).LJIJ(((SelectorConfirmWidgetAssem) abS700S0100000_19.l0).Jo().getState().LLILLJJLI);
        }
    }

    public static final void LIZ$8(AbS700S0100000_19 abS700S0100000_19, View view) {
        if (view != null) {
            ((InterfaceC1224490hyB) ((SelectorConfirmWidgetAssem) abS700S0100000_19.l0).LLJJIII.getValue()).LJIJ(((SelectorConfirmWidgetAssem) abS700S0100000_19.l0).Jo().getState().LLILLL);
        }
    }

    public static final void LIZ$9(AbS700S0100000_19 abS700S0100000_19, View view) {
        if (view != null) {
            ((SelectorSearchBarAssem) abS700S0100000_19.l0).Ho().setState(AFwS257S0000000_19.get$arr$(677));
        }
    }
}
