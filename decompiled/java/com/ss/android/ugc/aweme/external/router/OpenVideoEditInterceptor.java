package com.ss.android.ugc.aweme.external.router;

import X.C05YS;
import X.C1388190mED;
import X.C1430560nKY;
import X.C15438062q;
import X.C1976907ol;
import X.C1ER1;
import X.C2188811AlT;
import X.C23250099c;
import X.C529400KpW;
import X.C817503Hh;
import X.EnumC087200Uk;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.PhotoPublishConfigurationModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProSchemeLoadingActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS137S0400000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class OpenVideoEditInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "openVideoEdit");
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        List list;
        ArrayList arrayList;
        List<String> list2;
        List<String> list3;
        Map<String, String> map;
        String str;
        CreativeInitialModel creativeInitialModel;
        AddYourRecordParam addYourRecordParam;
        StoryStreakEnterEditParam storyStreakEnterEditParam;
        StorySocialEventStickerModel storySocialEventStickerModel;
        boolean z;
        BaseActivity baseActivity;
        Activity activityLIZ;
        boolean zLJFF;
        PhotoPublishConfigurationModel photoPublishConfigurationModel;
        if (context == null || routeIntent == null || (extra = routeIntent.getExtra()) == null) {
            return false;
        }
        boolean booleanExtra = extra.getBooleanExtra("from_jsb", false);
        boolean booleanExtra2 = extra.getBooleanExtra("from_deeplink", false);
        String strLIZ = LIZ(extra, "media_path");
        String strLIZ2 = LIZ(extra, "upload_type");
        String strLIZ3 = LIZ(extra, "assets");
        String strLIZ4 = LIZ(extra, "shoot_way");
        String strLIZ5 = LIZ(extra, "ep_ai_scene");
        String strLIZ6 = LIZ(extra, "ep_ai_enter_source");
        String strLIZ7 = LIZ(extra, "anchors");
        String strLIZ8 = LIZ(extra, "challenge_id");
        String strLIZ9 = LIZ(extra, "challenge_name");
        String strLIZ10 = LIZ(extra, "creation_id");
        boolean booleanExtra3 = extra.getBooleanExtra("landing_back", false);
        Gson gson = new Gson();
        if (strLIZ3 != null && !a0.LJJJIL(strLIZ3)) {
            list = (List) GsonProtectorUtils.fromJson(gson, strLIZ3, new TypeToken<ArrayList<AssetInfo>>() { // from class: X.0Mps
            }.getType());
        } else {
            list = null;
        }
        if (strLIZ7 != null && !a0.LJJJIL(strLIZ7)) {
            List<CreateAnchorInfo> list4 = (List) GsonProtectorUtils.fromJson(gson, strLIZ7, new TypeToken<ArrayList<CreateAnchorInfo>>() { // from class: X.0Mpo
            }.getType());
            arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
            for (CreateAnchorInfo createAnchorInfo : list4) {
                AnchorTransData.Companion.getClass();
                arrayList.add(C1430560nKY.LIZ(createAnchorInfo));
            }
        } else {
            arrayList = null;
        }
        if (strLIZ8 != null && !a0.LJJJIL(strLIZ8)) {
            list2 = (List) GsonProtectorUtils.fromJson(gson, strLIZ8, new TypeToken<ArrayList<String>>() { // from class: X.0Mpp
            }.getType());
        } else {
            list2 = null;
        }
        if (strLIZ9 != null && !a0.LJJJIL(strLIZ9)) {
            list3 = (List) GsonProtectorUtils.fromJson(gson, strLIZ9, new TypeToken<ArrayList<String>>() { // from class: X.0Mpq
            }.getType());
        } else {
            list3 = null;
        }
        String strLIZ11 = LIZ(extra, "extra");
        if (strLIZ11 != null) {
            map = (Map) GsonProtectorUtils.fromJson(gson, strLIZ11, new TypeToken<HashMap<String, String>>() { // from class: X.0Mpr
            }.getType());
        } else {
            map = null;
        }
        C1ER1.LIZIZ.LJJIIJZLJL().LJIJ(strLIZ4, map);
        if (map != null) {
            str = map.get("mlbb_open_platform_extra");
        } else {
            str = null;
        }
        try {
            try {
                creativeInitialModel = (CreativeInitialModel) gson.LJII(LIZ(extra, "creative_initial_model"), CreativeInitialModel.class);
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                creativeInitialModel = null;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            addYourRecordParam = (AddYourRecordParam) gson.LJII(LIZ(extra, "add_your_record_param"), AddYourRecordParam.class);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            addYourRecordParam = null;
        }
        try {
            try {
                storyStreakEnterEditParam = (StoryStreakEnterEditParam) gson.LJII(LIZ(extra, "story_streak_data"), StoryStreakEnterEditParam.class);
            } catch (Exception e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
                storyStreakEnterEditParam = null;
            }
        } catch (Exception e5) {
            e = e5;
        }
        try {
        } catch (s e6) {
            e = e6;
        }
        try {
            storySocialEventStickerModel = (StorySocialEventStickerModel) GsonProtectorUtils.fromJson(gson, LIZ(extra, "story_event_sticker_data"), StorySocialEventStickerModel.class);
        } catch (s e7) {
            e = e7;
            TryCatchGuardChecker.doCheck(e);
            storySocialEventStickerModel = null;
        }
        String strLIZ12 = LIZ(extra, "story_streak_gif_path");
        EditConfig.Builder builder = new EditConfig.Builder();
        builder.creationId(strLIZ10);
        builder.shootWay(strLIZ4);
        builder.challengeId(list2);
        builder.challengeNames(list3);
        builder.bindEPAIScene(strLIZ5);
        builder.bindEPAIEnterSource(strLIZ6);
        builder.anchors(arrayList);
        if (!booleanExtra && !booleanExtra2) {
            z = false;
        } else {
            z = true;
        }
        builder.isFromJsbOrDeeplink(z);
        builder.openPlatformExtra(str);
        builder.initialInputModel(creativeInitialModel);
        builder.addYoursStickerParam(addYourRecordParam);
        builder.addStoryStreakParam(storyStreakEnterEditParam);
        builder.addStoryCreateCommonStickerPostParam(storySocialEventStickerModel);
        builder.addStoryStreakGifPath(strLIZ12);
        builder.landingBack(booleanExtra3);
        EditConfig editConfigBuild = builder.build();
        if (booleanExtra2) {
            editConfigBuild.setOnEnterEditListener(new AwS552S0100000_8(context, 130));
        }
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("edit_route_");
            sbLIZ.append(strLIZ4);
            if (creativeToolsPluginService.LIZJ(context, C2188811AlT.LIZIZ(sbLIZ), true)) {
                AwS137S0400000_8 awS137S0400000_8 = new AwS137S0400000_8(this, creativeInitialModel, context, editConfigBuild, 2);
                if (Intrinsics.LJFF(strLIZ2, EnumC087200Uk.DEFAULT.getValue()) && list != null && !list.isEmpty()) {
                    if (creativeInitialModel != null && (photoPublishConfigurationModel = creativeInitialModel.photoPublishConfigurationModel) != null) {
                        zLJFF = Intrinsics.LJFF(photoPublishConfigurationModel.skipImageSizeCheck, Boolean.TRUE);
                    } else {
                        zLJFF = false;
                    }
                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C05YS(list, new C529400KpW(context), zLJFF, new AwS374S0200000_8(editConfigBuild, awS137S0400000_8, 31), null), 3);
                    return true;
                }
                if ((strLIZ2 == null || strLIZ2.length() == 0) && strLIZ != null && strLIZ.length() != 0) {
                    editConfigBuild.setMediaInfo(new VideoMedia(strLIZ));
                    awS137S0400000_8.invoke();
                    return true;
                }
                if (booleanExtra2 && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    activityLIZ.finish();
                }
                return false;
            }
        }
        Activity activityLIZ2 = C1388190mED.LIZ(context);
        if ((activityLIZ2 instanceof EditorProSchemeLoadingActivity) && (baseActivity = (BaseActivity) activityLIZ2) != null) {
            baseActivity.finish();
        }
        return false;
    }
}
