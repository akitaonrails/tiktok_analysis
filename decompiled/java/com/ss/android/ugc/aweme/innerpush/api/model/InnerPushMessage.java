package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C01GW;
import X.C09CT;
import X.C13LQ;
import X.C20666215ts;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC19331110k1;
import X.InterfaceC111300bX;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class InnerPushMessage implements Serializable, InterfaceC111300bX {
    public transient Serializable LL;
    public transient boolean LLILLJJLI;
    public final transient Map<String, Object> LLILLL;
    public transient boolean LLILZ;
    public transient boolean LLILZIL;
    public transient EnumC19331110k1 LLILZLL;
    public final transient C01GW LLIZ;

    @C09CT("biz_extra")
    public final String bizExtraJsonStr;

    @C09CT("command_type")
    public final int commandType;

    @C09CT("config")
    public final InnerPushConfig config;

    @C09CT("use_converter")
    public final boolean convertFromExternal;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("dedup_config")
    public DedupConfig dedupConfig;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("is_notice")
    public final boolean isNotice;

    @C09CT("push_label")
    public final String label;

    @C09CT("mark_status")
    public final boolean markStatus;

    @C09CT("event_tracker")
    public String mobEventJsonStr;

    @C09CT("notice_info")
    public final NoticeInfo noticeInfo;

    @C09CT("pre_message_create_time")
    public final long preMessageCreateTime;

    @C09CT("protocol")
    public final int protocol;

    @C09CT("rule_id")
    public long rid;

    @C09CT("setting_key")
    public String settingKey;

    @C09CT("integrity_check")
    public final boolean shouldCheckIntegrity;

    @C09CT("target_user_id")
    public String targetUserId;

    @C09CT("type")
    public final int type;

    @C09CT("ui_template")
    public final InnerPushUITemplate uiTemplate;

    @C09CT("version")
    public final int version;

    public InnerPushMessage() {
        this(1, 0, 0L, 0L, null, 0, 0, null, 0L, false, null, null, null, false, null, true, false, false, null, null, 0L, null, null, null, false, false);
    }

    public final InnerPushMessage copy(int i, int i2, long j, long j2, Serializable serializable, int i3, int i4, String str, long j3, boolean z, InnerPushUITemplate innerPushUITemplate, InnerPushConfig innerPushConfig, String str2, boolean z2, NoticeInfo noticeInfo, boolean z3, boolean z4, boolean z5, Map<String, ? extends Object> map, String str3, long j4, String str4, DedupConfig dedupConfig, String str5, boolean z6, boolean z7) {
        return new InnerPushMessage(i, i2, j, j2, serializable, i3, i4, str, j3, z, innerPushUITemplate, innerPushConfig, str2, z2, noticeInfo, z3, z4, z5, map, str3, j4, str4, dedupConfig, str5, z6, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerPushMessage)) {
            return false;
        }
        InnerPushMessage innerPushMessage = (InnerPushMessage) obj;
        return this.protocol == innerPushMessage.protocol && this.version == innerPushMessage.version && this.id == innerPushMessage.id && this.createTime == innerPushMessage.createTime && Intrinsics.LJFF(this.LL, innerPushMessage.LL) && this.type == innerPushMessage.type && this.commandType == innerPushMessage.commandType && Intrinsics.LJFF(this.label, innerPushMessage.label) && this.preMessageCreateTime == innerPushMessage.preMessageCreateTime && this.shouldCheckIntegrity == innerPushMessage.shouldCheckIntegrity && Intrinsics.LJFF(this.uiTemplate, innerPushMessage.uiTemplate) && Intrinsics.LJFF(this.config, innerPushMessage.config) && Intrinsics.LJFF(this.bizExtraJsonStr, innerPushMessage.bizExtraJsonStr) && this.isNotice == innerPushMessage.isNotice && Intrinsics.LJFF(this.noticeInfo, innerPushMessage.noticeInfo) && this.markStatus == innerPushMessage.markStatus && this.convertFromExternal == innerPushMessage.convertFromExternal && this.LLILLJJLI == innerPushMessage.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, innerPushMessage.LLILLL) && Intrinsics.LJFF(this.mobEventJsonStr, innerPushMessage.mobEventJsonStr) && this.rid == innerPushMessage.rid && Intrinsics.LJFF(this.settingKey, innerPushMessage.settingKey) && Intrinsics.LJFF(this.dedupConfig, innerPushMessage.dedupConfig) && Intrinsics.LJFF(this.targetUserId, innerPushMessage.targetUserId) && this.LLILZ == innerPushMessage.LLILZ && this.LLILZIL == innerPushMessage.LLILZIL;
    }

    public int hashCode() {
        int iY2 = ((((((this.protocol * 31) + this.version) * 31) + C786410Ut5.Y2(this.id)) * 31) + C786410Ut5.Y2(this.createTime)) * 31;
        Serializable serializable = this.LL;
        int iHashCode = (((((iY2 + (serializable == null ? 0 : serializable.hashCode())) * 31) + this.type) * 31) + this.commandType) * 31;
        String str = this.label;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.preMessageCreateTime)) * 31) + C786410Ut5.Z2(this.shouldCheckIntegrity)) * 31;
        InnerPushUITemplate innerPushUITemplate = this.uiTemplate;
        int iHashCode3 = (iHashCode2 + (innerPushUITemplate == null ? 0 : innerPushUITemplate.hashCode())) * 31;
        InnerPushConfig innerPushConfig = this.config;
        int iHashCode4 = (iHashCode3 + (innerPushConfig == null ? 0 : innerPushConfig.hashCode())) * 31;
        String str2 = this.bizExtraJsonStr;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.isNotice)) * 31;
        NoticeInfo noticeInfo = this.noticeInfo;
        int iHashCode6 = (((((((iHashCode5 + (noticeInfo == null ? 0 : noticeInfo.hashCode())) * 31) + C786410Ut5.Z2(this.markStatus)) * 31) + C786410Ut5.Z2(this.convertFromExternal)) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        Map<String, Object> map = this.LLILLL;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.mobEventJsonStr;
        int iHashCode8 = (((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Y2(this.rid)) * 31;
        String str4 = this.settingKey;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DedupConfig dedupConfig = this.dedupConfig;
        int iHashCode10 = (iHashCode9 + (dedupConfig == null ? 0 : dedupConfig.hashCode())) * 31;
        String str5 = this.targetUserId;
        return ((((iHashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public String toString() {
        return "InnerPushMessage(protocol=" + this.protocol + ", version=" + this.version + ", id=" + this.id + ", createTime=" + this.createTime + ", payload=" + this.LL + ", type=" + this.type + ", commandType=" + this.commandType + ", label=" + this.label + ", preMessageCreateTime=" + this.preMessageCreateTime + ", shouldCheckIntegrity=" + this.shouldCheckIntegrity + ", uiTemplate=" + this.uiTemplate + ", config=" + this.config + ", bizExtraJsonStr=" + this.bizExtraJsonStr + ", isNotice=" + this.isNotice + ", noticeInfo=" + this.noticeInfo + ", markStatus=" + this.markStatus + ", convertFromExternal=" + this.convertFromExternal + ", isDMPushReusedContainerShowed=" + this.LLILLJJLI + ", extrasMap=" + this.LLILLL + ", mobEventJsonStr=" + this.mobEventJsonStr + ", rid=" + this.rid + ", settingKey=" + this.settingKey + ", dedupConfig=" + this.dedupConfig + ", targetUserId=" + this.targetUserId + ", hasAvoidanceWaited=" + this.LLILZ + ", clickHasTracked=" + this.LLILZIL + ')';
    }

    public final InnerPushMessage deepCopy() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        objectOutputStream.flush();
        return (InnerPushMessage) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
    }

    public final C20666215ts getTracker() {
        return (C20666215ts) this.LLIZ.getValue();
    }

    public final boolean isFromPlatform() {
        EnumC19331110k1.Companion.getClass();
        return C13LQ.LJIILLIIL(this.LLILZLL, EnumC19331110k1.PLATFORMS$delegate.getValue());
    }

    public final String getBizExtraJsonStr() {
        return this.bizExtraJsonStr;
    }

    public final boolean getClickHasTracked() {
        return this.LLILZIL;
    }

    public final int getCommandType() {
        return this.commandType;
    }

    public final InnerPushConfig getConfig() {
        return this.config;
    }

    public final boolean getConvertFromExternal() {
        return this.convertFromExternal;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final DedupConfig getDedupConfig() {
        return this.dedupConfig;
    }

    public final Map<String, Object> getExtrasMap() {
        return this.LLILLL;
    }

    public final EnumC19331110k1 getFrom() {
        return this.LLILZLL;
    }

    public final boolean getHasAvoidanceWaited() {
        return this.LLILZ;
    }

    public final long getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getMarkStatus() {
        return this.markStatus;
    }

    public final String getMobEventJsonStr() {
        return this.mobEventJsonStr;
    }

    public final NoticeInfo getNoticeInfo() {
        return this.noticeInfo;
    }

    public final Serializable getPayload() {
        return this.LL;
    }

    public final long getPreMessageCreateTime() {
        return this.preMessageCreateTime;
    }

    public final int getProtocol() {
        return this.protocol;
    }

    public final long getRid() {
        return this.rid;
    }

    public final String getSettingKey() {
        return this.settingKey;
    }

    public final boolean getShouldCheckIntegrity() {
        return this.shouldCheckIntegrity;
    }

    public final String getTargetUserId() {
        return this.targetUserId;
    }

    public final int getType() {
        return this.type;
    }

    public final InnerPushUITemplate getUiTemplate() {
        return this.uiTemplate;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean isDMPushReusedContainerShowed() {
        return this.LLILLJJLI;
    }

    public final boolean isNotice() {
        return this.isNotice;
    }

    public final void markReceiveFrom(EnumC19331110k1 enumC19331110k1) {
        this.LLILZLL = enumC19331110k1;
        getTracker().LJIJI = System.currentTimeMillis();
        getTracker().LJIJJ = System.currentTimeMillis() - this.createTime;
        getTracker().LIZ = enumC19331110k1;
    }

    public final void setClickHasTracked(boolean z) {
        this.LLILZIL = z;
    }

    public final void setDMPushReusedContainerShowed(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setDedupConfig(DedupConfig dedupConfig) {
        this.dedupConfig = dedupConfig;
    }

    public final void setHasAvoidanceWaited(boolean z) {
        this.LLILZ = z;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setMobEventJsonStr(String str) {
        this.mobEventJsonStr = str;
    }

    public final void setPayload(Serializable serializable) {
        this.LL = serializable;
    }

    public final void setRid(long j) {
        this.rid = j;
    }

    public final void setSettingKey(String str) {
        this.settingKey = str;
    }

    public final void setTargetUserId(String str) {
        this.targetUserId = str;
    }

    public InnerPushMessage(int i, int i2, long j, long j2, Serializable serializable, int i3, int i4, String str, long j3, boolean z, InnerPushUITemplate innerPushUITemplate, InnerPushConfig innerPushConfig, String str2, boolean z2, NoticeInfo noticeInfo, boolean z3, boolean z4, boolean z5, Map<String, ? extends Object> map, String str3, long j4, String str4, DedupConfig dedupConfig, String str5, boolean z6, boolean z7) {
        this.protocol = i;
        this.version = i2;
        this.id = j;
        this.createTime = j2;
        this.LL = serializable;
        this.type = i3;
        this.commandType = i4;
        this.label = str;
        this.preMessageCreateTime = j3;
        this.shouldCheckIntegrity = z;
        this.uiTemplate = innerPushUITemplate;
        this.config = innerPushConfig;
        this.bizExtraJsonStr = str2;
        this.isNotice = z2;
        this.noticeInfo = noticeInfo;
        this.markStatus = z3;
        this.convertFromExternal = z4;
        this.LLILLJJLI = z5;
        this.LLILLL = map;
        this.mobEventJsonStr = str3;
        this.rid = j4;
        this.settingKey = str4;
        this.dedupConfig = dedupConfig;
        this.targetUserId = str5;
        this.LLILZ = z6;
        this.LLILZIL = z7;
        this.LLILZLL = EnumC19331110k1.FROM_PULLER;
        this.LLIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(226));
    }
}
