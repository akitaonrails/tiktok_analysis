package com.bytedance.pipo.stellar.base.resourceloader;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.ActionSheetDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.StellarTooltipDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarChunk {

    @C09CT("access_pre_check_info")
    public final AccessPreCheckInfo accessPreCheckInfo;

    @C09CT("action_sheet")
    public final ActionSheetDO actionSheet;

    @C09CT("background")
    public final List<CardDO> background;

    @C09CT("code")
    public final Integer errorCode;

    @C09CT("error_component")
    public final CardDO errorComponent;

    @C09CT("footer")
    public final List<CardDO> footer;

    @C09CT("header")
    public final CardDO header;

    @C09CT("main_style")
    public final StellarStyle mainStyle;

    @C09CT("section_operation")
    public final String operation;

    @C09CT("refresh_type")
    public final String refreshType;

    @C09CT("sections")
    public final List<StellarSection> sections;

    @C09CT("stellar_action")
    public final StellarActionDO stellarAction;

    @C09CT("tooltip")
    public final StellarTooltipDO tooltipDO;

    @C09CT("track_params")
    public final Map<String, Object> trackingParams;

    public static StellarChunk LIZ(StellarChunk stellarChunk, List list, StellarStyle stellarStyle, CardDO cardDO, List list2, List list3, Map map, AccessPreCheckInfo accessPreCheckInfo, int i) {
        Integer num;
        String str;
        String str2;
        ActionSheetDO actionSheetDO;
        StellarTooltipDO stellarTooltipDO;
        CardDO cardDO2;
        AccessPreCheckInfo accessPreCheckInfo2 = accessPreCheckInfo;
        Map map2 = map;
        List list4 = list3;
        List list5 = list2;
        StellarStyle stellarStyle2 = stellarStyle;
        CardDO cardDO3 = cardDO;
        List list6 = list;
        StellarActionDO stellarActionDO = null;
        if ((i & 1) != 0) {
            num = stellarChunk.errorCode;
        } else {
            num = null;
        }
        if ((i & 2) != 0) {
            str = stellarChunk.refreshType;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            list6 = stellarChunk.sections;
        }
        if ((i & 8) != 0) {
            str2 = stellarChunk.operation;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            stellarStyle2 = stellarChunk.mainStyle;
        }
        if ((i & 32) != 0) {
            actionSheetDO = stellarChunk.actionSheet;
        } else {
            actionSheetDO = null;
        }
        if ((i & 64) != 0) {
            stellarTooltipDO = stellarChunk.tooltipDO;
        } else {
            stellarTooltipDO = null;
        }
        if ((i & 128) != 0) {
            cardDO3 = stellarChunk.header;
        }
        if ((i & 256) != 0) {
            cardDO2 = stellarChunk.errorComponent;
        } else {
            cardDO2 = null;
        }
        if ((i & 512) != 0) {
            list5 = stellarChunk.background;
        }
        if ((i & 1024) != 0) {
            list4 = stellarChunk.footer;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map2 = stellarChunk.trackingParams;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            accessPreCheckInfo2 = stellarChunk.accessPreCheckInfo;
        }
        if ((i & 8192) != 0) {
            stellarActionDO = stellarChunk.stellarAction;
        }
        stellarChunk.getClass();
        return new StellarChunk(num, str, list6, str2, stellarStyle2, actionSheetDO, stellarTooltipDO, cardDO3, cardDO2, list5, list4, map2, accessPreCheckInfo2, stellarActionDO);
    }

    public StellarChunk(Integer num, String str, List<StellarSection> list, String str2, StellarStyle stellarStyle, ActionSheetDO actionSheetDO, StellarTooltipDO stellarTooltipDO, CardDO cardDO, CardDO cardDO2, List<CardDO> list2, List<CardDO> list3, Map<String, ? extends Object> map, AccessPreCheckInfo accessPreCheckInfo, StellarActionDO stellarActionDO) {
        this.errorCode = num;
        this.refreshType = str;
        this.sections = list;
        this.operation = str2;
        this.mainStyle = stellarStyle;
        this.actionSheet = actionSheetDO;
        this.tooltipDO = stellarTooltipDO;
        this.header = cardDO;
        this.errorComponent = cardDO2;
        this.background = list2;
        this.footer = list3;
        this.trackingParams = map;
        this.accessPreCheckInfo = accessPreCheckInfo;
        this.stellarAction = stellarActionDO;
    }
}
