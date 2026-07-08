package com.ss.android.ugc.aweme.slash.component;

import X.C09CT;
import X.C1180090goZ;
import X.C1201190hMb;
import X.C1494600ozq;
import X.InterfaceC1201180hMa;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCommonEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseComponentData extends BaseResponse implements InterfaceC1891350zJl, InterfaceC1201180hMa {
    public C1180090goZ componentType;

    @C09CT("events")
    public List<SlashCommonEvent> events;
    public String instanceId;

    @C09CT("is_skeleton")
    public Boolean isSkeleton;
    public C1494600ozq<?> requestInfo;

    @C09CT("slash_config")
    public SlashConfig slashConfig;
    public String updateType;

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public void setRdTTLSDataSource(String str) {
    }

    public final C1180090goZ getComponentType$slash_release() {
        return this.componentType;
    }

    public final List<SlashCommonEvent> getEvents() {
        return this.events;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final SlashConfig getSlashConfig() {
        return this.slashConfig;
    }

    public final String getUpdateType$slash_release() {
        return this.updateType;
    }

    public final String instanceId() {
        return this.instanceId;
    }

    public final Boolean isSkeleton() {
        return this.isSkeleton;
    }

    public final String updateType() {
        return this.updateType;
    }

    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        BaseComponentData baseComponentData;
        if (interfaceC1891350zJl instanceof BaseComponentData) {
            baseComponentData = (BaseComponentData) interfaceC1891350zJl;
        } else {
            baseComponentData = null;
        }
        return areContentsTheSame(baseComponentData);
    }

    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        BaseComponentData baseComponentData;
        String str = this.instanceId;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof BaseComponentData) && (baseComponentData = (BaseComponentData) interfaceC1891350zJl) != null) {
            str2 = baseComponentData.instanceId;
        }
        if (!Intrinsics.LJFF(str, str2) && !areContentsTheSame(interfaceC1891350zJl)) {
            return false;
        }
        return true;
    }

    public final void setComponentType$slash_release(C1180090goZ c1180090goZ) {
        this.componentType = c1180090goZ;
    }

    public final void setEvents(List<SlashCommonEvent> list) {
        this.events = list;
    }

    public final void setInstanceId(String str) {
        this.instanceId = str;
    }

    @Override // X.InterfaceC1201180hMa
    public void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.requestInfo = c1494600ozq;
    }

    public final void setSkeleton(Boolean bool) {
        this.isSkeleton = bool;
    }

    public final void setSlashConfig(SlashConfig slashConfig) {
        this.slashConfig = slashConfig;
    }

    public final void setUpdateType$slash_release(String str) {
        this.updateType = str;
    }

    public boolean areContentsTheSame(BaseComponentData baseComponentData) {
        return Intrinsics.LJFF(baseComponentData, this);
    }
}
