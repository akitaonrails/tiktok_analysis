package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class PermitApplyData {
    public static final Companion Companion = new Companion();
    public final LiveRoomUser applicant;
    public final BizPermitParams bizPermitParams;
    public final Map<String, Object> custom;
    public final LayoutDSLConfig layoutDSLConfig;
    public final int permitStatus;

    public static final class Builder {
        public final LiveRoomUser applicant;
        public BizPermitParams bizPermitParams;
        public Map<String, ? extends Object> custom;
        public LayoutDSLConfig layoutDSLConfig;
        public int permitStatus;

        public final PermitApplyData build() {
            return new PermitApplyData(this);
        }

        public final LiveRoomUser getApplicant() {
            return this.applicant;
        }

        public final BizPermitParams getBizPermitParams() {
            return this.bizPermitParams;
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final LayoutDSLConfig getLayoutDSLConfig() {
            return this.layoutDSLConfig;
        }

        public final int getPermitStatus() {
            return this.permitStatus;
        }

        public Builder(LiveRoomUser liveRoomUser) {
            this.applicant = liveRoomUser;
        }

        public final void setBizPermitParams(BizPermitParams bizPermitParams) {
            this.bizPermitParams = bizPermitParams;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setLayoutDSLConfig(LayoutDSLConfig layoutDSLConfig) {
            this.layoutDSLConfig = layoutDSLConfig;
        }

        public final void setPermitStatus(int i) {
            this.permitStatus = i;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermitApplyData(permitStatus=");
        sbLIZ.append(this.permitStatus);
        sbLIZ.append(", bizPermitParams=");
        sbLIZ.append(this.bizPermitParams);
        sbLIZ.append(", applicant=");
        sbLIZ.append(this.applicant);
        sbLIZ.append(", layoutDSLConfig=");
        sbLIZ.append(this.layoutDSLConfig);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.custom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PermitApplyData(Builder builder) {
        this(builder.getPermitStatus(), builder.getBizPermitParams(), builder.getApplicant(), builder.getLayoutDSLConfig(), builder.getCustom());
    }

    public static final class Companion {
        public final PermitApplyData build(LiveRoomUser liveRoomUser, Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder(liveRoomUser);
            function1.invoke(builder);
            return builder.build();
        }
    }

    public PermitApplyData(int i, BizPermitParams bizPermitParams, LiveRoomUser liveRoomUser, LayoutDSLConfig layoutDSLConfig, Map<String, ? extends Object> map) {
        this.permitStatus = i;
        this.bizPermitParams = bizPermitParams;
        this.applicant = liveRoomUser;
        this.layoutDSLConfig = layoutDSLConfig;
        this.custom = map;
    }
}
