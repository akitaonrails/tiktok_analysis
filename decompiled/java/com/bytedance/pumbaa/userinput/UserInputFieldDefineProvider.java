package com.bytedance.pumbaa.userinput;

import X.C0WQG;
import X.C0WRM;
import X.C2097608Jq;
import X.EnumC823400WRu;
import com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class UserInputFieldDefineProvider implements PumbaaFieldDefineProvider {
    public final Map<String, C0WQG> LIZ;

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final String triggerBiz() {
        return "UserInput";
    }

    public UserInputFieldDefineProvider() {
        C0WRM c0wrm = C0WRM.CallSite;
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.Bool;
        this.LIZ = C2097608Jq.LJIIIIZZ(new Pair("ui_class", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("ui_generic_type", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("ui_is_visible", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("input_hint", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("input_keyboard_type", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("input_is_text_invisible", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("current_page_hierarchy", new C0WQG(c0wrm, enumC823400WRu, "/data/extra")), new Pair("unidfid", new C0WQG(c0wrm, enumC823400WRu, "/data/category")));
    }

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final boolean contains(String str) {
        return this.LIZ.containsKey(str);
    }

    @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
    public final C0WQG query(String str) {
        return this.LIZ.get(str);
    }
}
