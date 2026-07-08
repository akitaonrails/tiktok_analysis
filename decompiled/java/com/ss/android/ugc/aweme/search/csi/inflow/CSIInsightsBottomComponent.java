package com.ss.android.ugc.aweme.search.csi.inflow;

import X.C01GW;
import X.C098200Yq;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C189200o6;
import X.C197039127h;
import X.C19IN;
import X.C2189821An6;
import X.C452501pT;
import X.C786410Ut5;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.csi.inflow.CSIInsightsBottomComponent;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class CSIInsightsBottomComponent extends BasePanelUIComponent implements IDetailBottomProtocol {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 575));

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
    }

    public final String Go() {
        Object c098200Yq;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        String tracker = c2189821An6 != null ? c2189821An6.getTracker() : null;
        if (tracker == null || tracker.length() == 0) {
            return null;
        }
        try {
            c098200Yq = new JSONObject(tracker).optString("inspiration_session_id");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str != null) {
            if (str.length() > 0) {
                return str;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.evy, viewGroup, false);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.f_t);
        if (c197039127h != null) {
            c197039127h.LJJJJJ();
            C786410Ut5.I7(new C19IN() { // from class: X.0TGj
                {
                    super(LSPassThroughRecordSizeConfig.DEFAULT, true);
                }

                @Override // X.C19IN
                public final void LIZ(View view) {
                    Context context;
                    Activity activityLIZ;
                    Aweme awemeLJIIIIZZ;
                    String str;
                    boolean z;
                    String string;
                    String string2;
                    String string3;
                    UrlModel cover;
                    List<String> urlList;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMb;
                    CSIInsightsBottomComponent cSIInsightsBottomComponent = this.LLILZLL;
                    cSIInsightsBottomComponent.getClass();
                    if (!a0.LJJJIL("aweme://roma_redirect/?spark_page=inspiration_analytics_content_analysis") && (context = cSIInsightsBottomComponent.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) cSIInsightsBottomComponent.LLJIJIL.getValue();
                        String aid = null;
                        if (iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null) {
                            awemeLJIIIIZZ = iViewPagerComponentAbilityMb.LJIIIIZZ();
                        } else {
                            awemeLJIIIIZZ = null;
                        }
                        String strGo = cSIInsightsBottomComponent.Go();
                        if (awemeLJIIIIZZ != null) {
                            aid = awemeLJIIIIZZ.getAid();
                        }
                        new C684320Qso("click_get_insights", aid, strGo).LJIILJJIL();
                        Uri.Builder builderAppendQueryParameter = UriProtector.parse("aweme://roma_redirect/?spark_page=inspiration_analytics_content_analysis").buildUpon().appendQueryParameter("entry_source", "inspiration_detail_related_video").appendQueryParameter("enter_method", "click_insights");
                        String strJ3 = "";
                        if (awemeLJIIIIZZ != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                String aid2 = awemeLJIIIIZZ.getAid();
                                if (aid2 == null) {
                                    aid2 = "";
                                }
                                jSONObject.put("vid", aid2);
                                String desc = awemeLJIIIIZZ.getDesc();
                                if (desc == null) {
                                    desc = "";
                                }
                                jSONObject.put("name", desc);
                                Video video = awemeLJIIIIZZ.getVideo();
                                if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                                    str = "";
                                }
                                jSONObject.put("thumbnail_url", str);
                                jSONObject.put("posted_on", String.valueOf(awemeLJIIIIZZ.getCreateTime()));
                                if (awemeLJIIIIZZ.getAwemeType() == 150) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                jSONObject.put("is_photo_text", z);
                                AwemeStatistics statistics = awemeLJIIIIZZ.getStatistics();
                                JSONObject jSONObject2 = new JSONObject();
                                if (statistics == null || (string = Long.valueOf(statistics.getPlayCount()).toString()) == null) {
                                    string = "";
                                }
                                jSONObject2.put("play_count", string);
                                if (statistics == null || (string2 = Long.valueOf(statistics.getDiggCount()).toString()) == null) {
                                    string2 = "";
                                }
                                jSONObject2.put("digg_count", string2);
                                if (statistics == null || (string3 = Long.valueOf(statistics.getCommentCount()).toString()) == null) {
                                    string3 = "";
                                }
                                jSONObject2.put("comment_count", string3);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("video_info", jSONObject);
                                jSONObject3.put("aweme_stats", jSONObject2);
                                strJ3 = C786410Ut5.J3(jSONObject3);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        SmartRouter.buildRoute(activityLIZ, builderAppendQueryParameter.appendQueryParameter("query_item", strJ3).build().toString()).open();
                    }
                }
            }, c197039127h);
        }
        View viewFindViewById = viewTd.findViewById(R.id.f_q);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new C19IN() { // from class: X.0mL7
                {
                    super(LSPassThroughRecordSizeConfig.DEFAULT, true);
                }

                @Override // X.C19IN
                public final void LIZ(View view) {
                    Activity activityLIZ;
                    Aweme awemeLJIIIIZZ;
                    String aid;
                    boolean z;
                    Long lValueOf;
                    String str;
                    String str2;
                    AnchorCommonStruct next;
                    ITemplateAnchorStrategyService iTemplateAnchorStrategyService;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMb;
                    CSIInsightsBottomComponent cSIInsightsBottomComponent = this.LLILZLL;
                    Context context = cSIInsightsBottomComponent.getContext();
                    if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) cSIInsightsBottomComponent.LLJIJIL.getValue();
                        String uid = null;
                        if (iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null) {
                            awemeLJIIIIZZ = iViewPagerComponentAbilityMb.LJIIIIZZ();
                        } else {
                            awemeLJIIIIZZ = null;
                        }
                        String strGo = cSIInsightsBottomComponent.Go();
                        if (awemeLJIIIIZZ != null) {
                            aid = awemeLJIIIIZZ.getAid();
                        } else {
                            aid = null;
                        }
                        new C684320Qso("click_shoot", aid, strGo).LJIILJJIL();
                        C1388920mFO c1388920mFO = C1388920mFO.LIZ;
                        Fragment fragment = cSIInsightsBottomComponent.getPanelContext().LJ;
                        c1388920mFO.getClass();
                        if (awemeLJIIIIZZ != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Create click: template=");
                            if (awemeLJIIIIZZ.getCcTemplateInfo() == null) {
                                List<AnchorCommonStruct> anchors = awemeLJIIIIZZ.getAnchors();
                                if (anchors != null && !anchors.isEmpty()) {
                                    Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                                    while (it2.hasNext()) {
                                        if (C1388920mFO.LIZIZ.contains(Integer.valueOf(it2.next().getType()))) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                z = false;
                            } else {
                                z = true;
                                break;
                            }
                            sbLIZ.append(z);
                            sbLIZ.append(", music=");
                            Music music = awemeLJIIIIZZ.getMusic();
                            if (music != null) {
                                lValueOf = Long.valueOf(music.getId());
                            } else {
                                lValueOf = null;
                            }
                            sbLIZ.append(lValueOf);
                            sbLIZ.append(", sticker=");
                            NewFaceStickerBean stickerEntranceInfo = awemeLJIIIIZZ.getStickerEntranceInfo();
                            if (stickerEntranceInfo != null) {
                                str = stickerEntranceInfo.id;
                            } else {
                                str = null;
                            }
                            sbLIZ.append(str);
                            C2188811AlT.LIZIZ(sbLIZ);
                            List<AnchorCommonStruct> anchors2 = awemeLJIIIIZZ.getAnchors();
                            if (anchors2 != null) {
                                Iterator<AnchorCommonStruct> it3 = anchors2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        if (C1388920mFO.LIZIZ.contains(Integer.valueOf(next.getType()))) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                AnchorCommonStruct anchorCommonStruct = next;
                                if (anchorCommonStruct != null && (iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) PluggableExtentionKt.pluggableSpi$default(ITemplateAnchorStrategyService.class, false, false, false, 14, null)) != null) {
                                    iTemplateAnchorStrategyService.LIZJ(activityLIZ, anchorCommonStruct, awemeLJIIIIZZ, "search_csi_related_video", "click_create", "", null, null);
                                    return;
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            HashSet hashSet = new HashSet();
                            NewFaceStickerBean stickerEntranceInfo2 = awemeLJIIIIZZ.getStickerEntranceInfo();
                            if (stickerEntranceInfo2 != null && (str2 = stickerEntranceInfo2.id) != null && str2.length() != 0 && hashSet.add(str2)) {
                                arrayList.add(stickerEntranceInfo2);
                            }
                            List<AnchorCommonStruct> anchors3 = awemeLJIIIIZZ.getAnchors();
                            if (anchors3 != null) {
                                C08QT c08qt = new C08QT(C09RB.LJIJI(C09RB.LJIIIZ(new C1939607ik(anchors3), AFwS252S0000000_16.get$arr$(381)), AFwS259S0000000_21.get$arr$(317)));
                                while (c08qt.hasNext()) {
                                    NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) c08qt.next();
                                    String str3 = newFaceStickerBean.id;
                                    if (str3 != null && str3.length() != 0 && hashSet.add(str3)) {
                                        arrayList.add(newFaceStickerBean);
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                int videoLength = 0;
                                IPropReuseService iPropReuseService = (IPropReuseService) PluggableExtentionKt.pluggableSpi$default(IPropReuseService.class, false, false, false, 14, null);
                                if (iPropReuseService == null) {
                                    return;
                                }
                                boolean zDownloadEffectOrMusicAfterEnterCamera = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
                                Music music2 = awemeLJIIIIZZ.getMusic();
                                User author = awemeLJIIIIZZ.getAuthor();
                                if (author != null) {
                                    uid = author.getUid();
                                }
                                String aid2 = awemeLJIIIIZZ.getAid();
                                Integer numValueOf = Integer.valueOf(awemeLJIIIIZZ.getAwemeType());
                                Video video = awemeLJIIIIZZ.getVideo();
                                if (video != null) {
                                    videoLength = video.getVideoLength();
                                }
                                iPropReuseService.LJ(activityLIZ, arrayList, music2, "search_csi_related_video", uid, aid2, numValueOf, videoLength, zDownloadEffectOrMusicAfterEnterCamera, "search_csi_inflow", awemeLJIIIIZZ, null, null, "", false, false, "", "", null);
                                return;
                            }
                            C1394830mOv.LIZ(C1394830mOv.LIZ, activityLIZ, fragment, awemeLJIIIIZZ, "search_csi_related_video");
                        }
                    }
                }
            }, viewFindViewById);
        }
        return viewTd;
    }
}
