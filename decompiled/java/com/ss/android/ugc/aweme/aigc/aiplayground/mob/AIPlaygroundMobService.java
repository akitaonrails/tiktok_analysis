package com.ss.android.ugc.aweme.aigc.aiplayground.mob;

import X.C0LAB;
import X.C13LP;
import X.C20684815ws;
import X.C380220EvU;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class AIPlaygroundMobService implements IAIPlaygroundMobService {
    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final String LIZ(boolean z) {
        return z ? "text" : "image";
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final AIGenerationType LIZJ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<EditorProAIGCMediaItemModel> arrayList = videoPublishEditModel.creativeModel.editorProAIGCInfoModel.editorProAIGCMediaItemModelList;
        if (arrayList.isEmpty()) {
            return AIGenerationType.NONE;
        }
        Iterator<EditorProAIGCMediaItemModel> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AIGenerationType aIGenerationType = it2.next().param.aiPlaygroundGenerateParams.aiPlaygroundGenerationType;
            if (aIGenerationType != AIGenerationType.NONE) {
                return aIGenerationType;
            }
        }
        return AIGenerationType.NONE;
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final void LJII(CreativeModel creativeModel) {
        AIGCGenerationParam aIGCGenerationParam;
        String strLIZ;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(creativeModel.editorProAIGCInfoModel.editorProAIGCMediaItemModelList);
        if (editorProAIGCMediaItemModel == null || (aIGCGenerationParam = editorProAIGCMediaItemModel.param) == null) {
            aIGCGenerationParam = new AIGCGenerationParam(null, null, null, null, false, false, null, null, null, null, 0, 0, null, null, null, false, false, 0, false, null, null, null, null, null, null, false, false, false, null, null, 0, 0, null, null, null, -1, 7, null);
        }
        AIGenerationType aIGenerationType = aIGCGenerationParam.aiPlaygroundGenerateParams.aiPlaygroundGenerationType;
        if (aIGenerationType == AIGenerationType.NONE) {
            strLIZ = C380220EvU.LIZ(AIGenerationType.IMAGE_TO_VIDEO);
        } else {
            strLIZ = C380220EvU.LIZ(aIGenerationType);
        }
        C0LAB c0labLJIIL = LJIIL(strLIZ, creativeModel);
        c0labLJIIL.LJ("action_type", "show");
        C20684815ws.LJIILLIIL("ai_video_tool_loading_page", c0labLJIIL.LIZ);
    }

    public static C0LAB LJIIL(String str, CreativeModel creativeModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", creativeModel.creativeInfo.getCreationId());
        c0lab.LJ("shoot_way", creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.shootWay);
        String str2 = creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.clickFrom;
        str2.toString();
        c0lab.LJ("click_from", str2);
        c0lab.LJ("tool_name", str);
        return c0lab;
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final void LIZLLL(String str, CreativeModel creativeModel) {
        C20684815ws.LJIILLIIL("ai_video_tool_page_show", LJIIL(str, creativeModel).LIZ);
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final void LJFF(String str, CreativeModel creativeModel) {
        AIGCGenerationParam aIGCGenerationParam;
        String strLIZ;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(creativeModel.editorProAIGCInfoModel.editorProAIGCMediaItemModelList);
        if (editorProAIGCMediaItemModel == null || (aIGCGenerationParam = editorProAIGCMediaItemModel.param) == null) {
            aIGCGenerationParam = new AIGCGenerationParam(null, null, null, null, false, false, null, null, null, null, 0, 0, null, null, null, false, false, 0, false, null, null, null, null, null, null, false, false, false, null, null, 0, 0, null, null, null, -1, 7, null);
        }
        AIGenerationType aIGenerationType = aIGCGenerationParam.aiPlaygroundGenerateParams.aiPlaygroundGenerationType;
        if (aIGenerationType == AIGenerationType.NONE) {
            strLIZ = C380220EvU.LIZ(AIGenerationType.IMAGE_TO_VIDEO);
        } else {
            strLIZ = C380220EvU.LIZ(aIGenerationType);
        }
        C0LAB c0labLJIIL = LJIIL(strLIZ, creativeModel);
        c0labLJIIL.LJ("action_type", str);
        C20684815ws.LJIILLIIL("ai_video_tool_loading_page", c0labLJIIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a A[PHI: r4
      0x011a: PHI (r4v1 long) = (r4v0 long), (r4v6 long), (r4v6 long) binds: [B:45:0x0116, B:13:0x001f, B:15:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.creative.model.CreativeModel r49, X.C0LSZ r50) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.aiplayground.mob.AIPlaygroundMobService.LJI(com.ss.android.ugc.aweme.creative.model.CreativeModel, X.0LSZ):void");
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final void LJIIIIZZ(String str, CreativeModel creativeModel) {
        C0LAB c0labLJIIL = LJIIL(str, creativeModel);
        c0labLJIIL.LJ("external_link_source", creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.aiPlaygroundSchemaModel.deeplinkAIPlaygroundSceneEnterSource);
        C20684815ws.LJIILLIIL("click_ai_video_tool_generate", c0labLJIIL.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final C0LAB LJIIIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int i;
        String strLIZ;
        AIGenerationType aIGenerationTypeLIZJ = LIZJ(videoPublishEditModel);
        AIGenerationType aIGenerationType = AIGenerationType.NONE;
        if (aIGenerationTypeLIZJ != aIGenerationType) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_editorpro_ai_video_tool");
        if (aIGenerationTypeLIZJ != aIGenerationType) {
            strLIZ = C380220EvU.LIZ(aIGenerationTypeLIZJ);
        } else {
            strLIZ = "";
        }
        c0lab.LJ("ai_video_tool_name", strLIZ);
        c0lab.LIZ(videoPublishEditModel.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.aiPlaygroundSchemaModel.deeplinkAIPlaygroundIsFromExternalLink, "is_from_external_link");
        c0lab.LJ("external_link_source", videoPublishEditModel.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.aiPlaygroundSchemaModel.deeplinkAIPlaygroundSceneEnterSource);
        return c0lab;
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final void LIZIZ(CreativeModel creativeModel, String str, String str2) {
        C0LAB c0labLJIIL = LJIIL(str, creativeModel);
        c0labLJIIL.LJ("action_type", str2);
        C20684815ws.LJIILLIIL("ai_video_tool_dropdown_list", c0labLJIIL.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final void LJIIJ(int i, String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("business", "ai_video_tool");
        c0lab.LIZ(i, "duration");
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c0lab.LJ("pane", str2);
        c0lab.LJ("prompt_type", str3);
        C20684815ws.LJIILLIIL("creation_recommend_prompt_download", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final void LJIIJJI(int i, String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("business", "ai_video_tool");
        c0lab.LIZ(i, "duration");
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c0lab.LJ("pane", str2);
        c0lab.LJ("prompt_type", str3);
        C20684815ws.LJIILLIIL("creation_recommend_prompt_panel_loading", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService
    public final void LJ(CreativeModel creativeModel, String str, String str2, String str3, String str4, String str5) {
        C0LAB c0labLJIIL = LJIIL(str, creativeModel);
        c0labLJIIL.LJ("aspect_ratio", str3);
        c0labLJIIL.LJ("duration", str4);
        c0labLJIIL.LJ("resource_id", str5);
        c0labLJIIL.LJ("action_type", str2);
        C20684815ws.LJIILLIIL("click_on_ai_video_tool", c0labLJIIL.LIZ);
    }
}
