package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C718702rJ;
import X.EnumC804703Cj;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ModuleLayout {

    @C09CT("module_config")
    public Map<String, String> module_config;

    public ModuleLayout() {
    }

    public final C718702rJ LIZ() {
        String value;
        String str;
        String str2;
        String str3;
        String str4;
        Map<String, String> map = this.module_config;
        int i = (map == null || (str4 = map.get("position")) == null) ? 0 : CastIntegerProtector.parseInt(str4);
        Map<String, String> map2 = this.module_config;
        if (map2 == null || (value = map2.get("style")) == null) {
            value = EnumC804703Cj.OSP_PAGE.getValue();
        }
        Map<String, String> map3 = this.module_config;
        int i2 = (map3 == null || (str3 = map3.get("render_mode")) == null) ? 0 : CastIntegerProtector.parseInt(str3);
        Map<String, String> map4 = this.module_config;
        int i3 = (map4 == null || (str2 = map4.get("group_id")) == null) ? 0 : CastIntegerProtector.parseInt(str2);
        Map<String, String> map5 = this.module_config;
        return new C718702rJ(i, i2, i3, (map5 == null || (str = map5.get("split_type")) == null) ? 0 : CastIntegerProtector.parseInt(str), value);
    }

    public ModuleLayout(Map<String, String> map) {
        this.module_config = map;
    }
}
