package com.tiktok.myna.render.render;

import X.C09CS;
import X.C09CT;
import X.InterfaceC21329918dd;
import com.tiktok.myna.render.render.elements.MynaTypeAdapterFactory;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
@C09CS(MynaTypeAdapterFactory.class)
public final class MynaTemplateProtocol implements InterfaceC21329918dd, Cloneable, Serializable {

    @C09CT("action_chains")
    public final Map<String, Object> actionChains;

    @C09CT("config")
    public final MynaTemplateProtocolConfig config;

    @C09CT("custom")
    public final Map<String, Object> customInfo;

    @C09CT("i18n")
    public final Map<String, Object> i18n;

    @C09CT("ui")
    public final MynaElement uiInfo;

    public MynaTemplateProtocol() {
        this(null, null, null, null, null);
    }

    public Object clone() {
        return super.clone();
    }

    @Override // X.InterfaceC21329918dd
    public Map<String, Object> getActionChains() {
        return this.actionChains;
    }

    @Override // X.InterfaceC21329918dd
    public MynaTemplateProtocolConfig getConfig() {
        return this.config;
    }

    @Override // X.InterfaceC21329918dd
    public Map<String, Object> getCustomInfo() {
        return this.customInfo;
    }

    @Override // X.InterfaceC21329918dd
    public Map<String, Object> getI18n() {
        return this.i18n;
    }

    @Override // X.InterfaceC21329918dd
    public MynaElement getUiInfo() {
        return this.uiInfo;
    }

    public MynaTemplateProtocol(MynaElement mynaElement, MynaTemplateProtocolConfig mynaTemplateProtocolConfig, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        this.uiInfo = mynaElement;
        this.config = mynaTemplateProtocolConfig;
        this.customInfo = map;
        this.actionChains = map2;
        this.i18n = map3;
    }
}
