package com.ss.android.ugc.nearby.container.model;

import X.C09CT;
import X.C1205120hSw;
import X.C14NM;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyTool implements Serializable, C14NM {
    public final boolean LL;
    public final int LLILLJJLI;

    @C09CT("component_key")
    public final String componentKey;

    @C09CT("icon")
    public final String icon;

    @C09CT("icon_dark")
    public final String iconDark;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("priority")
    public final Integer priority;

    @C09CT("schema")
    public final String schema;

    @C09CT("title")
    public final String title;

    public NearbyTool() {
        this(null, null, null, null, null, null, null, false, 50001);
    }

    public final NearbyTool copy(String str, String str2, String str3, String str4, String str5, Integer num, LogPbBean logPbBean, boolean z, int i) {
        return new NearbyTool(str, str2, str3, str4, str5, num, logPbBean, z, i);
    }

    public int hashCode() {
        String str = this.componentKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconDark;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.schema;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.priority;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        return ((((iHashCode6 + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LL)) * 31) + this.LLILLJJLI;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyTool(componentKey=");
        sbLIZ.append(this.componentKey);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", iconDark=");
        sbLIZ.append(this.iconDark);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", isCacheData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getComponentKey() {
        return this.componentKey;
    }

    @Override // X.C14NM
    public int getContentType() {
        return this.LLILLJJLI;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconDark() {
        return this.iconDark;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isCacheData() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // X.InterfaceC1891350zJl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean areContentsTheSame(X.InterfaceC1891350zJl r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.ss.android.ugc.nearby.container.model.NearbyTool
            r2 = 0
            if (r0 == 0) goto L21
            com.ss.android.ugc.nearby.container.model.NearbyTool r4 = (com.ss.android.ugc.nearby.container.model.NearbyTool) r4
            if (r4 == 0) goto L22
            java.lang.String r1 = r4.title
        Lb:
            java.lang.String r0 = r3.title
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L24
            if (r4 == 0) goto L17
            java.lang.String r2 = r4.schema
        L17:
            java.lang.String r0 = r3.schema
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L21:
            r4 = r2
        L22:
            r1 = r2
            goto Lb
        L24:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.container.model.NearbyTool.areContentsTheSame(X.0zJl):boolean");
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        NearbyTool nearbyTool;
        String str = null;
        if (interfaceC1891350zJl instanceof NearbyTool) {
            nearbyTool = (NearbyTool) interfaceC1891350zJl;
            if (nearbyTool != null) {
                str = nearbyTool.componentKey;
            }
        } else {
            nearbyTool = null;
        }
        if (!Intrinsics.LJFF(str, this.componentKey) || nearbyTool == null || nearbyTool.getContentType() != getContentType()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.ss.android.ugc.nearby.container.model.NearbyTool
            r2 = 0
            if (r0 == 0) goto L2f
            com.ss.android.ugc.nearby.container.model.NearbyTool r4 = (com.ss.android.ugc.nearby.container.model.NearbyTool) r4
            if (r4 == 0) goto L30
            java.lang.String r1 = r4.componentKey
        Lb:
            java.lang.String r0 = r3.componentKey
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L32
            if (r4 == 0) goto L2d
            java.lang.String r1 = r4.title
        L17:
            java.lang.String r0 = r3.title
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L32
            if (r4 == 0) goto L23
            java.lang.String r2 = r4.schema
        L23:
            java.lang.String r0 = r3.schema
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L32
            r0 = 1
            return r0
        L2d:
            r1 = r2
            goto L17
        L2f:
            r4 = r2
        L30:
            r1 = r2
            goto Lb
        L32:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.container.model.NearbyTool.equals(java.lang.Object):boolean");
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof NearbyTool) {
            NearbyTool nearbyTool = (NearbyTool) interfaceC1891350zJl;
            if (!Intrinsics.LJFF(nearbyTool.schema, this.schema)) {
                String str = nearbyTool.schema;
                if (str == null) {
                    str = "";
                }
                return new C1205120hSw(str);
            }
            return null;
        }
        return null;
    }

    public NearbyTool(String str, String str2, String str3, String str4, String str5, Integer num, LogPbBean logPbBean, boolean z, int i) {
        this.componentKey = str;
        this.icon = str2;
        this.iconDark = str3;
        this.title = str4;
        this.schema = str5;
        this.priority = num;
        this.logPb = logPbBean;
        this.LL = z;
        this.LLILLJJLI = i;
    }
}
