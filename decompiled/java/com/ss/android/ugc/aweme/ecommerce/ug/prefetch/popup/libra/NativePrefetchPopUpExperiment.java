package com.ss.android.ugc.aweme.ecommerce.ug.prefetch.popup.libra;

import X.C09CT;
import X.C0C64;
import X.C1697810uHb;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class NativePrefetchPopUpExperiment {
    public static final PopupNativePrefetchModel LIZ = new PopupNativePrefetchModel(false, true, false, "/api/v1/mall/user_reach/popup/get", C1697810uHb.LJIIJJI("diversion_params", "mall_extra_info", "page_source_info", "popup_extra_info", "shoptab_ui_status", "handle_on_ui_sub_stage", "previous_page"), false, false, false, null);

    public static final PopupNativePrefetchModel LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PopupNativePrefetchModel popupNativePrefetchModel = LIZ;
            PopupNativePrefetchModel popupNativePrefetchModel2 = (PopupNativePrefetchModel) c0c64LJIILLIIL.LJJII(PopupNativePrefetchModel.class, popupNativePrefetchModel, "ug_popup_native_prefetch", true);
            return popupNativePrefetchModel2 != null ? popupNativePrefetchModel2 : popupNativePrefetchModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }

    public static final class PopupNativePrefetchModel {

        @C09CT("enable_popup_native_prefetch")
        public final boolean enablePopUpNativePrefetch;

        @C09CT("enable_popup_template_pre_decode")
        public final boolean enablePopUpTemplatePreDecode;

        @C09CT("enable_popup_template_preload")
        public final boolean enablePopUpTemplatePreload;

        @C09CT("enable_read_template_schema_from_settings")
        public final boolean enableReadPopupTemplateSchemaFromSettings;

        @C09CT("need_replace_task_id")
        public final boolean needReplaceTaskId;

        @C09CT("need_update_no_anchor_video_param")
        public final boolean needUpdateNoAnchorVideoParam;

        @C09CT("request_api")
        public final String popupRequestApi;

        @C09CT("popup_template_schema")
        public final String popupTemplateSchema;

        @C09CT("read_global_context_list")
        public final List<String> readGlobalContextList;

        public PopupNativePrefetchModel() {
            this(false, true, false, "/api/v1/mall/user_reach/popup/get", C1697810uHb.LJIIJJI("diversion_params", "mall_extra_info", "page_source_info", "popup_extra_info", "shoptab_ui_status", "handle_on_ui_sub_stage", "previous_page"), false, false, false, null);
        }

        public PopupNativePrefetchModel(boolean z, boolean z2, boolean z3, String str, List<String> list, boolean z4, boolean z5, boolean z6, String str2) {
            this.enablePopUpNativePrefetch = z;
            this.needReplaceTaskId = z2;
            this.needUpdateNoAnchorVideoParam = z3;
            this.popupRequestApi = str;
            this.readGlobalContextList = list;
            this.enablePopUpTemplatePreload = z4;
            this.enablePopUpTemplatePreDecode = z5;
            this.enableReadPopupTemplateSchemaFromSettings = z6;
            this.popupTemplateSchema = str2;
        }
    }
}
