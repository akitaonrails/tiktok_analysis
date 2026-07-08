package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C01GW;
import X.C0HHT;
import X.C0RF0;
import X.C0RZI;
import X.C1389300mG0;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1AF0;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C299590Boj;
import X.C418440Gaw;
import X.C452501pT;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C715390S4j;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.subscription.service.ISubscriptionCommonService;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSocialPrivacyTagAssem extends DynamicComponent<FeedSocialPrivacyTagAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public TuxTag LLLFFI;
    public String LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public Long LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSocialPrivacyTagAssem.class, "videoTagVM", "getVideoTagVM()Lcom/ss/android/ugc/feed/platform/cell/interact/info/horiontag/tag/FeedSocialTagViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedSocialPrivacyTagAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSocialTagViewModel.class);
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 1272), null, AFwS243S0000000_11.get$arr$(569));
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(570));
        this.LLLF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(265));
        this.LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1271));
        this.LLLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1270));
        this.LLLII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(264));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bac;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        Long lValueOf;
        List<AwemeHybridLabelModel> hybridLabels;
        List listLLIIII;
        AwemeHybridLabelModel awemeHybridLabelModel;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        Long generatedPreviewStartTime;
        long jLongValue;
        StandardBusinessModel standardBusinessModel2;
        CMPreviewInfo cmPreviewInfo2;
        Long generatedPreviewDuration;
        ContentModel contentModel = videoItemParams.getAweme().getContentModel();
        TuxTag tuxTag = null;
        if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null && (generatedPreviewStartTime = cmPreviewInfo.getGeneratedPreviewStartTime()) != null) {
            long jLongValue2 = generatedPreviewStartTime.longValue();
            ContentModel contentModel2 = videoItemParams.getAweme().getContentModel();
            if (contentModel2 != null && (standardBusinessModel2 = contentModel2.standardBusinessModel) != null && (cmPreviewInfo2 = standardBusinessModel2.getCmPreviewInfo()) != null && (generatedPreviewDuration = cmPreviewInfo2.getGeneratedPreviewDuration()) != null) {
                jLongValue = generatedPreviewDuration.longValue();
            } else {
                jLongValue = 0;
            }
            lValueOf = Long.valueOf(jLongValue2 + jLongValue);
        } else {
            lValueOf = null;
        }
        this.LLLIIII = lValueOf;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (hybridLabels = aweme.getHybridLabels()) != null && (listLLIIII = C13LP.LLIIII(hybridLabels)) != null && (awemeHybridLabelModel = (AwemeHybridLabelModel) C13LP.LJJJLL(listLLIIII)) != null) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            C786410Ut5.LJLLLLLL(0, getContentView());
            TuxTag tuxTag2 = this.LLLFFI;
            if (tuxTag2 == null) {
                tuxTag2 = null;
            }
            C786410Ut5.LLZLLIL(tuxTag2, 0);
            TuxTag tuxTag3 = this.LLLFFI;
            if (tuxTag3 == null) {
                tuxTag3 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTag3);
            tuxTag3.setAlpha(1.0f);
            List<AwemeLabelModel> list = aweme.videoLabels;
            TuxTag tuxTag4 = this.LLLFFI;
            if (tuxTag4 == null) {
                tuxTag4 = null;
            }
            C0RZI.LIZ(tuxTag4, list, awemeHybridLabelModel);
            String str = awemeHybridLabelModel.text;
            this.LLLFZ = str;
            TuxTag tuxTag5 = this.LLLFFI;
            if (tuxTag5 == null) {
                tuxTag5 = null;
            }
            tuxTag5.setText(str);
            Fp(null);
            float f = C715390S4j.LIZ;
            TuxTag tuxTag6 = this.LLLFFI;
            if (tuxTag6 != null) {
                tuxTag = tuxTag6;
            }
            C715390S4j.LIZIZ(4, tuxTag);
        }
    }

    public final void Fp(Long l) {
        Aweme aweme;
        boolean z;
        long jLongValue;
        boolean zLJFF;
        boolean z2;
        boolean z3;
        String string;
        int iLIZLLL;
        String string2;
        Resources resources;
        Resources resources2;
        String string3;
        ClientStandardModel clientModel;
        Map<String, ConditionData> map;
        ClientStandardModel clientModel2;
        Map<String, ConditionData> map2;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        StandardBusinessModel standardBusinessModel2;
        CMPreviewInfo cmPreviewInfo;
        Long generatedPreviewDuration;
        VideoItemParams videoItemParams = (VideoItemParams) bo();
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            String aid = aweme.getAid();
            String str = "";
            if (aid == null) {
                aid = "";
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLLI.getValue();
            if (iFeedPanelPlatformAbility != null && iFeedPanelPlatformAbility.cl2() == 0) {
                z = true;
            } else {
                z = false;
            }
            ContentModel contentModel = aweme.getContentModel();
            if (contentModel != null && (standardBusinessModel2 = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel2.getCmPreviewInfo()) != null && (generatedPreviewDuration = cmPreviewInfo.getGeneratedPreviewDuration()) != null) {
                jLongValue = generatedPreviewDuration.longValue();
            } else {
                jLongValue = 0;
            }
            ContentModel contentModel2 = aweme.getContentModel();
            if (contentModel2 != null && (standardBusinessModel = contentModel2.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null) {
                zLJFF = Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            StandardComponentInfo standardComponentInfo = aweme.getStandardComponentInfo();
            if (standardComponentInfo != null && (clientModel2 = standardComponentInfo.getClientModel((String) this.LLLFF.getValue(), "standardized_bottom_button")) != null && (map2 = clientModel2.componentsConditionMap) != null && map2.containsKey("bottom_button_sov_preview_single_button")) {
                z2 = true;
            } else {
                z2 = false;
            }
            StandardComponentInfo standardComponentInfo2 = aweme.getStandardComponentInfo();
            if (standardComponentInfo2 != null && (clientModel = standardComponentInfo2.getClientModel((String) this.LLLFF.getValue(), "standardized_bottom_button")) != null && (map = clientModel.componentsConditionMap) != null && map.containsKey("bottom_button_sov_preview_tip_card")) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zLJIIJJI = C1389300mG0.LJIIJJI(jm().LIZIZ());
            Context context = getContext();
            if (context != null) {
                int iLIZLLL2 = C418440Gaw.LIZLLL(context);
                TuxTag tuxTag = this.LLLFFI;
                if (tuxTag == null) {
                    tuxTag = null;
                }
                if (tuxTag.getMaxWidth() != iLIZLLL2 || !zLJIIJJI) {
                    TuxTag tuxTag2 = this.LLLFFI;
                    if (tuxTag2 == null) {
                        tuxTag2 = null;
                    }
                    tuxTag2.setMaxWidth(iLIZLLL2);
                }
            }
            if ((!z || !z3) && zLJFF) {
                Context context2 = getContext();
                if (context2 != null && (resources2 = context2.getResources()) != null) {
                    string = resources2.getString(2131849270);
                } else {
                    string = null;
                }
                if (z) {
                    if (z2 && ((ISubscriptionCommonService) this.LLLII.getValue()).LJI(aid)) {
                        TuxTag tuxTag3 = this.LLLFFI;
                        if (tuxTag3 == null) {
                            tuxTag3 = null;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LLLFZ);
                        sbLIZ.append(" · ");
                        sbLIZ.append(string);
                        tuxTag3.setText(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    iLIZLLL = ((ISubscriptionCommonService) this.LLLII.getValue()).LIZLLL(jLongValue);
                } else {
                    iLIZLLL = 5;
                }
                Long l2 = this.LLLIIII;
                if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    if (l != null && l.longValue() > 0) {
                        int iCeil = (int) Math.ceil((jLongValue2 - l.longValue()) / 1000.0d);
                        if (1 <= iCeil) {
                            if (iCeil <= iLIZLLL) {
                                Context context3 = getContext();
                                if (context3 != null && (resources = context3.getResources()) != null) {
                                    string2 = resources.getString(2131830348, String.valueOf(iCeil));
                                } else {
                                    string2 = null;
                                }
                                TuxTag tuxTag4 = this.LLLFFI;
                                if (tuxTag4 == null) {
                                    tuxTag4 = null;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(this.LLLFZ);
                                sbLIZ2.append(" · ");
                                if (string2 != null) {
                                    str = string2;
                                }
                                sbLIZ2.append(str);
                                tuxTag4.setText(C2188811AlT.LIZIZ(sbLIZ2));
                                return;
                            }
                            TuxTag tuxTag5 = this.LLLFFI;
                            if (tuxTag5 == null) {
                                tuxTag5 = null;
                            }
                            tuxTag5.setText(this.LLLFZ);
                            return;
                        }
                        if (z && z2) {
                            TuxTag tuxTag6 = this.LLLFFI;
                            if (tuxTag6 == null) {
                                tuxTag6 = null;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(this.LLLFZ);
                            sbLIZ3.append(" · ");
                            sbLIZ3.append(string);
                            tuxTag6.setText(C2188811AlT.LIZIZ(sbLIZ3));
                            ((ISubscriptionCommonService) this.LLLII.getValue()).LJFF(aid);
                            return;
                        }
                        TuxTag tuxTag7 = this.LLLFFI;
                        if (tuxTag7 == null) {
                            tuxTag7 = null;
                        }
                        tuxTag7.setText(this.LLLFZ);
                        return;
                    }
                    TuxTag tuxTag8 = this.LLLFFI;
                    if (tuxTag8 == null) {
                        tuxTag8 = null;
                    }
                    tuxTag8.setText(this.LLLFZ);
                    return;
                }
                TuxTag tuxTag9 = this.LLLFFI;
                if (tuxTag9 == null) {
                    tuxTag9 = null;
                }
                tuxTag9.setText(this.LLLFZ);
                return;
            }
            TuxTag tuxTag10 = this.LLLFFI;
            if (tuxTag10 == null) {
                tuxTag10 = null;
            }
            CharSequence text = tuxTag10.getText();
            if (text != null) {
                string3 = text.toString();
            } else {
                string3 = null;
            }
            if (!Intrinsics.LJFF(string3, this.LLLFZ) || !zLJIIJJI) {
                TuxTag tuxTag11 = this.LLLFFI;
                if (tuxTag11 == null) {
                    tuxTag11 = null;
                }
                tuxTag11.setText(this.LLLFZ);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        String str;
        super.onViewCreated(view);
        this.LLLFFI = (TuxTag) view.findViewById(R.id.zt1);
        TuxTag tuxTag = null;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        if (C704010RjT.LJ(str)) {
            TuxTag tuxTag2 = this.LLLFFI;
            if (tuxTag2 == null) {
                tuxTag2 = null;
            }
            tuxTag2.setTagSize(2);
            TuxTag tuxTag3 = this.LLLFFI;
            if (tuxTag3 != null) {
                tuxTag = tuxTag3;
            }
            C704010RjT.LIZIZ(tuxTag);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(this, LLLIIIIL[0]), new C2217381BqS() { // from class: X.0RWK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RWI) obj).LLILLJJLI;
            }
        }, null, AFwS294S0000000_11.get$arr$(216), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0RZG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, C736820SvI.LJ(), AFwS294S0000000_11.get$arr$(217), 4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
