package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2;

import X.C09JN;
import X.C0KSH;
import X.C0KSY;
import X.C0KT5;
import X.C0UO0;
import X.C1094580eae;
import X.C1133830fbx;
import X.C1161920gLG;
import X.C13LP;
import X.C1697810uHb;
import X.C19898612tM;
import X.C1AAA;
import X.C1AFX;
import X.C1AFY;
import X.C1AFZ;
import X.C20588084s;
import X.C480460Ism;
import X.C500260Jjc;
import X.EnumC1095410ebz;
import X.EnumC1154870g9t;
import X.EnumC21668319r7;
import X.EnumC429510Gsn;
import X.InterfaceC517900KSu;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubCustomizeBenefitSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinPanelUpgradeSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubAwarenessEnhancementSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubJoinDialogOpenPageDataForceUpdateSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansCommunityGiftBenefitIconShowSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansCommunityGiftNewExpirationDateSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansCommunityGiftNewLabelExpressionSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansCustomizeBenefitNewExpirationDateSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.superfan.SuperFansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS277S0300000_33;
import kotlin.jvm.internal.AwS87S0500000_33;
import tikcast.api.fans.FansGetCustomBenefitsResponse;
import tikcast.api.fans.GetNonFansUserDataResponse;
import webcast.data.FanCustomBenefit;
import webcast.data.SuperFanPrivilege;
import webcast.data.SuperFanPrivilegeInfo;

/* JADX INFO: loaded from: classes34.dex */
public final class JoinDialogProxyViewModel extends LiveWidgetViewModel {
    public static final /* synthetic */ int LLJ = 0;
    public JoinDialogViewModel LL;
    public SuperFanViewModel LLILLJJLI;
    public C1AFX LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final MutableLiveData<Integer> LLILZLL = new MutableLiveData<>(0);
    public final MutableLiveData<C1AAA> LLIZ;
    public EnumC429510Gsn LLIZLLLIL;

    public JoinDialogProxyViewModel() {
        EnumC429510Gsn enumC429510Gsn = EnumC429510Gsn.FANS_CLUB;
        this.LLIZ = new MutableLiveData<>(yQ2(enumC429510Gsn));
        this.LLIZLLLIL = enumC429510Gsn;
    }

    public static String wQ2(EnumC21668319r7 enumC21668319r7) {
        FansClubJoinPanelUpgradeSetting fansClubJoinPanelUpgradeSetting = FansClubJoinPanelUpgradeSetting.INSTANCE;
        if (fansClubJoinPanelUpgradeSetting.getValue() != 1 && fansClubJoinPanelUpgradeSetting.getValue() != 2) {
            if (enumC21668319r7 == EnumC21668319r7.SUPER_FAN) {
                return "#B47827";
            }
            if (enumC21668319r7 == EnumC21668319r7.FANS_CLUB) {
                return "#FE2C55";
            }
            return null;
        }
        return "#000000";
    }

    public final void AQ2(EnumC1095410ebz enumC1095410ebz) {
        EnumC429510Gsn enumC429510Gsn;
        Room room;
        int iIntValue;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            Long lValueOf = Long.valueOf(room.getId());
            lValueOf.longValue();
            if (this.LLILZIL > 0) {
                long jLongValue = lValueOf.longValue();
                LinkedHashMap<Long, Integer> linkedHashMap = C20588084s.LIZ;
                Integer num = linkedHashMap.get(Long.valueOf(jLongValue));
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                int i = iIntValue | this.LLILZIL;
                if (linkedHashMap.size() >= 70) {
                    Iterator it2 = C13LP.LL(linkedHashMap.keySet(), (linkedHashMap.size() - 10) + 1).iterator();
                    while (it2.hasNext()) {
                        C20588084s.LIZ.remove(it2.next());
                    }
                }
                C20588084s.LIZ.put(Long.valueOf(jLongValue), Integer.valueOf(i));
            }
        }
        if (enumC1095410ebz == EnumC1095410ebz.ONLY_SUPER_FAN) {
            enumC429510Gsn = EnumC429510Gsn.SUPER_FAN;
        } else {
            enumC429510Gsn = EnumC429510Gsn.FANS_CLUB;
        }
        this.LLIZLLLIL = enumC429510Gsn;
        this.LLIZ.setValue(yQ2(this.LLIZLLLIL));
        this.LLILZIL = 0;
    }

    public final C1AAA yQ2(EnumC429510Gsn enumC429510Gsn) {
        C0KSY<GetNonFansUserDataResponse.Data> c0ksy;
        GetNonFansUserDataResponse.Data data;
        SuperFanPrivilege superFanPrivilege;
        List<SuperFanPrivilegeInfo> list;
        Long lValueOf;
        int iIntValue;
        int iIntValue2;
        boolean z;
        ImageModel imageModel;
        boolean z2;
        ImageModel imageModel2;
        Integer num;
        Room room;
        if (enumC429510Gsn == EnumC429510Gsn.FANS_CLUB) {
            ArrayList arrayList = new ArrayList();
            DataChannel dataChannel = getDataChannel();
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            if (lValueOf != null && (num = C20588084s.LIZ.get(Long.valueOf(lValueOf.longValue()))) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (LiveFansCommunityGiftBenefitIconShowSetting.INSTANCE.getValue()) {
                Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(7934L);
                EnumC1154870g9t enumC1154870g9t = EnumC1154870g9t.IMAGE_MODEL;
                if (giftFindGiftById != null) {
                    imageModel2 = giftFindGiftById.image;
                } else {
                    imageModel2 = null;
                }
                C1094580eae.LIZ.getClass();
                arrayList.add(new C1AFZ(enumC1154870g9t, null, imageModel2, C1133830fbx.LJIILIIL(C1094580eae.LIZIZ("ttlive_fanClub_joinPanel_both_perks_uniqueHeartMe", "Unique Heart Me"), "").toString(), LiveFansCommunityGiftNewLabelExpressionSetting.INSTANCE.getValue(), true, 2));
            }
            Integer value = this.LLILZLL.getValue();
            if (value != null) {
                iIntValue2 = value.intValue();
            } else {
                iIntValue2 = 0;
            }
            if ((iIntValue2 & 1) != 0) {
                if (LiveFansCustomizeBenefitNewExpirationDateSetting.INSTANCE.getValue() && arrayList.size() == 0 && (iIntValue & 1) == 0) {
                    z2 = true;
                    this.LLILZIL |= 1;
                } else {
                    z2 = false;
                }
                EnumC1154870g9t enumC1154870g9t2 = EnumC1154870g9t.GECKO;
                C1AFY c1afy = new C1AFY("ttlive_icon_new_fans_club_dialog_customize_benefit.png");
                C1094580eae.LIZ.getClass();
                arrayList.add(new C1AFZ(enumC1154870g9t2, c1afy, null, C1133830fbx.LJIILIIL(C1094580eae.LIZIZ("ttlive_fanClub_joinPanel_both_perks_customPerks", "Customizable perks"), "").toString(), z2, false, 100));
            }
            if (((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getCommunityGift() != null) {
                Gift communityGift = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getCommunityGift();
                if (arrayList.size() == 0 && System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < LiveFansCommunityGiftNewExpirationDateSetting.INSTANCE.getValue()) {
                    z = true;
                } else {
                    z = false;
                }
                EnumC1154870g9t enumC1154870g9t3 = EnumC1154870g9t.IMAGE_MODEL;
                if (communityGift != null) {
                    imageModel = communityGift.image;
                } else {
                    imageModel = null;
                }
                C1094580eae.LIZ.getClass();
                arrayList.add(new C1AFZ(enumC1154870g9t3, null, imageModel, C1133830fbx.LJIILIIL(C1094580eae.LIZIZ("ttlive_commGift_title", "Community Gift"), "").toString(), z, true, 66));
            }
            EnumC1154870g9t enumC1154870g9t4 = EnumC1154870g9t.GECKO;
            C1AFY c1afy2 = new C1AFY("ttlive_icon_new_fans_club_dialog_fans_club_sticker.png");
            C1094580eae.LIZ.getClass();
            arrayList.addAll(C1697810uHb.LJIIJJI(new C1AFZ(enumC1154870g9t4, c1afy2, null, C1133830fbx.LJIILIIL(C1094580eae.LIZIZ("ttlive_fanClub_viewer_joinFanClubPanel_fanClubStickers_perkName", "Fan Club stickers"), "").toString(), false, false, 116), new C1AFZ(enumC1154870g9t4, new C1AFY("ttlive_icon_new_fans_club_dialog_fans_club_gifts.png"), null, C1133830fbx.LJIILIIL(C1094580eae.LIZIZ("ttlive_joinTeam_fromIcon_exclusiveGifts_desc", "Exclusive Gifts"), "").toString(), false, false, 116), new C1AFZ(enumC1154870g9t4, new C1AFY("ttlive_icon_new_fans_club_dialog_level_up_effects.png"), null, C1133830fbx.LJIILIIL(C1094580eae.LIZIZ("ttlive_joinTeam_fromIcon_levelUpCelebration_desc", "Level-up celebration"), "").toString(), false, false, 116), new C1AFZ(enumC1154870g9t4, new C1AFY("ttlive_icon_new_fans_club_dialog_entrance_spotlight.png"), null, C1133830fbx.LJIILIIL(C1094580eae.LIZIZ("ttlive_joinTeam_fromIcon_entranceSpotlight_desc", "Entrance spotlight"), "").toString(), false, false, 116)));
            EnumC21668319r7 enumC21668319r7 = EnumC21668319r7.FANS_CLUB;
            return new C1AAA(enumC21668319r7, arrayList, new C1AFY("tiktok_live_new_style_fans_club_join_dialog", "ttlive_icon_fans_club_badge.png", 70, 21), null, wQ2(enumC21668319r7), 40);
        }
        if (this.LLILLL == null && enumC429510Gsn == EnumC429510Gsn.SUPER_FAN) {
            return new C1AAA(EnumC21668319r7.LOADING, null, null, null, null, 62);
        }
        ArrayList arrayList2 = new ArrayList();
        C1AFX c1afx = this.LLILLL;
        if (c1afx != null && (c0ksy = c1afx.LIZ) != null && (data = c0ksy.LIZ) != null && (superFanPrivilege = data.superFanPrivilegeInfo) != null && (list = superFanPrivilege.privilegeDetails) != null) {
            for (SuperFanPrivilegeInfo superFanPrivilegeInfo : list) {
                arrayList2.add(new C1AFZ(EnumC1154870g9t.IMAGE_MODEL, null, superFanPrivilegeInfo.icon, superFanPrivilegeInfo.title, false, false, 114));
            }
        }
        EnumC21668319r7 enumC21668319r72 = EnumC21668319r7.SUPER_FAN;
        return new C1AAA(enumC21668319r72, arrayList2, new C1AFY("tiktok_live_new_style_fans_club_join_dialog", "ttlive_icon_super_fans_badge.png", 90, 22), this.LLILLL, wQ2(enumC21668319r72), 32);
    }

    public final void BQ2(EnumC1095410ebz enumC1095410ebz, C0KT5 c0kt5) {
        EnumC429510Gsn enumC429510Gsn;
        DataChannel dataChannel;
        Room room;
        int iIntValue;
        boolean z = false;
        this.LLILZIL = 0;
        EnumC1095410ebz enumC1095410ebz2 = EnumC1095410ebz.ONLY_SUPER_FAN;
        if (enumC1095410ebz == enumC1095410ebz2 || enumC1095410ebz == EnumC1095410ebz.BOTH) {
            C0KSH.LJIIIZ(getDataChannel(), c0kt5.LIZIZ);
            if (this.LLILLL != null) {
                C0KSH.LJIIIIZZ(getDataChannel(), c0kt5.LIZIZ, true);
            }
        }
        if (enumC1095410ebz == enumC1095410ebz2) {
            enumC429510Gsn = EnumC429510Gsn.SUPER_FAN;
        } else {
            enumC429510Gsn = EnumC429510Gsn.FANS_CLUB;
        }
        this.LLIZLLLIL = enumC429510Gsn;
        if (FansClubCustomizeBenefitSetting.INSTANCE.getValue() && (dataChannel = getDataChannel()) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            long ownerUserId = room.getOwnerUserId();
            final long id = room.getId();
            LinkedHashMap<Long, Integer> linkedHashMap = C19898612tM.LIZ;
            if (linkedHashMap.containsKey(Long.valueOf(id))) {
                MutableLiveData<Integer> mutableLiveData = this.LLILZLL;
                Integer num = linkedHashMap.get(Long.valueOf(id));
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                mutableLiveData.setValue(Integer.valueOf(iIntValue));
            } else {
                C480460Ism.LIZ().getClass();
                ((FansClubApi) C480460Ism.LIZLLL(FansClubApi.class)).getCustomBenefits(ownerUserId, false).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.1AA9
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        FansGetCustomBenefitsResponse.Data data;
                        List<FanCustomBenefit> list;
                        C1C7U.LIZ("JoinDialogProxyViewModel@2c96.fetchCustomBenefits$1");
                        BaseResponse baseResponse = (BaseResponse) obj;
                        int i = 0;
                        if (baseResponse != null && (data = (FansGetCustomBenefitsResponse.Data) baseResponse.data) != null && (list = data.benefits) != null) {
                            Iterator<FanCustomBenefit> it2 = list.iterator();
                            while (it2.hasNext()) {
                                int i2 = it2.next().domainScope;
                                if (i2 == 1 || i2 == 3) {
                                    i |= 1;
                                }
                                if (i2 == 2 || i2 == 3) {
                                    i |= 2;
                                }
                            }
                        }
                        long j = id;
                        LinkedHashMap<Long, Integer> linkedHashMap2 = C19898612tM.LIZ;
                        if (linkedHashMap2.size() >= 20) {
                            Iterator it3 = C13LP.LL(linkedHashMap2.keySet(), (linkedHashMap2.size() - 10) + 1).iterator();
                            while (it3.hasNext()) {
                                C19898612tM.LIZ.remove(it3.next());
                            }
                        }
                        C19898612tM.LIZ.put(Long.valueOf(j), Integer.valueOf(i));
                        this.LLILZLL.setValue(Integer.valueOf(i));
                        JoinDialogProxyViewModel joinDialogProxyViewModel = this;
                        EnumC429510Gsn enumC429510Gsn2 = joinDialogProxyViewModel.LLIZLLLIL;
                        if (enumC429510Gsn2 == EnumC429510Gsn.FANS_CLUB || (joinDialogProxyViewModel.LLILLL != null && enumC429510Gsn2 == EnumC429510Gsn.SUPER_FAN)) {
                            MutableLiveData<C1AAA> mutableLiveData2 = joinDialogProxyViewModel.LLIZ;
                            C1AAA c1aaaYQ2 = joinDialogProxyViewModel.yQ2(joinDialogProxyViewModel.LLIZLLLIL);
                            c1aaaYQ2.LJFF = true;
                            mutableLiveData2.setValue(c1aaaYQ2);
                        }
                        C1C7U.LIZIZ("JoinDialogProxyViewModel@2c96.fetchCustomBenefits$1");
                    }
                }, new C09JN() { // from class: X.00N2
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("JoinDialogProxyViewModel@2c96.fetchCustomBenefits$2");
                        C1C7U.LIZIZ("JoinDialogProxyViewModel@2c96.fetchCustomBenefits$2");
                    }
                });
            }
        }
        MutableLiveData<C1AAA> mutableLiveData2 = this.LLIZ;
        C1AAA c1aaaYQ2 = yQ2(this.LLIZLLLIL);
        if (this.LLIZLLLIL == EnumC429510Gsn.FANS_CLUB && LiveFansClubJoinDialogOpenPageDataForceUpdateSetting.INSTANCE.getValue()) {
            z = true;
        }
        c1aaaYQ2.LJFF = z;
        mutableLiveData2.setValue(c1aaaYQ2);
        if (enumC1095410ebz != EnumC1095410ebz.ONLY_FANS_CLUB) {
            vQ2(enumC1095410ebz, c0kt5);
        }
    }

    public final void vQ2(final EnumC1095410ebz enumC1095410ebz, final C0KT5 c0kt5) {
        SuperFanViewModel superFanViewModel = this.LLILLJJLI;
        if (superFanViewModel != null) {
            superFanViewModel.vQ2(c0kt5, FansClubJoinPanelUpgradeSetting.INSTANCE.getValue(), new InterfaceC517900KSu() { // from class: X.1AFW
                @Override // X.InterfaceC517900KSu
                public final void onFailure() {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS277S0300000_33(this.LIZ, enumC1095410ebz, c0kt5, 8));
                }

                @Override // X.InterfaceC517900KSu
                public final void LIZ(C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8) {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS87S0500000_33(this.LIZ, (JoinDialogProxyViewModel) enumC1095410ebz, (EnumC1095410ebz) c0kt5, (C0KT0) c0ksy, (C0KSY<GetNonFansUserDataResponse.Data>) c0ks8, (C0KS8) 1));
                }
            });
        }
    }

    public final LiveSheetFragment xQ2(DataChannel dataChannel, String str, EnumC1095410ebz enumC1095410ebz) {
        User owner;
        SubscribeInfo subscribeInfo;
        this.LLIZ.setValue(yQ2(EnumC429510Gsn.FANS_CLUB));
        if (enumC1095410ebz == EnumC1095410ebz.ONLY_SUPER_FAN && LiveFansClubAwarenessEnhancementSetting.INSTANCE.isEnabled()) {
            SuperFansClubJoinDialog superFansClubJoinDialog = new SuperFansClubJoinDialog();
            superFansClubJoinDialog.LLJZIJLIL = dataChannel;
            superFansClubJoinDialog.LLJLLL = str;
            superFansClubJoinDialog.LLJZ = this;
            return superFansClubJoinDialog;
        }
        FansClubJoinDialogV4 fansClubJoinDialogV4 = new FansClubJoinDialogV4();
        fansClubJoinDialogV4.LLL = dataChannel;
        fansClubJoinDialogV4.LLJZ = str;
        fansClubJoinDialogV4.LLJZIJLIL = this;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && !subscribeInfo.isAnchorQualified()) {
            enumC1095410ebz = EnumC1095410ebz.ONLY_FANS_CLUB;
        }
        fansClubJoinDialogV4.LLLF = enumC1095410ebz;
        return fansClubJoinDialogV4;
    }

    public final LiveSheetFragment zQ2(DataChannel dataChannel, String str, boolean z) {
        if (FansClubJoinPanelUpgradeSetting.INSTANCE.isExperimentalGroup() && !z) {
            return xQ2(dataChannel, str, EnumC1095410ebz.ONLY_SUPER_FAN);
        }
        SuperFanJoinDialog superFanJoinDialog = new SuperFanJoinDialog();
        superFanJoinDialog.LLJLLL = str;
        superFanJoinDialog.LLJZ = this.LLILLJJLI;
        return superFanJoinDialog;
    }
}
