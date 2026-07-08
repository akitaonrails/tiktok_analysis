package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2223071Bzd;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToAppLog;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToGlobalStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionManageScene;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionStoreValueToFeatureCenter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiAction extends Message<CaiAction, C2223071Bzd> {
    public static final ProtoAdapter<CaiAction> ADAPTER = new ProtoAdapter<CaiAction>() { // from class: X.1Bzc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiAction decode(ProtoReader protoReader) {
            C2223071Bzd c2223071Bzd = new C2223071Bzd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 255) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2223071Bzd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2223071Bzd.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c2223071Bzd.LJII = CaiActionManageScene.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2223071Bzd.LJI = CaiActionEmitEventToAppLog.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2223071Bzd.LJFF = CaiActionStoreValueToFeatureCenter.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2223071Bzd.LJ = CaiActionEmitEventToGlobalStream.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223071Bzd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiAction caiAction) {
            CaiAction caiAction2 = caiAction;
            return ProtoAdapter.INT32.encodedSizeWithTag(255, caiAction2.action_type) + CaiActionEmitEventToGlobalStream.ADAPTER.encodedSizeWithTag(1, caiAction2.emit_event_to_global_stream) + CaiActionStoreValueToFeatureCenter.ADAPTER.encodedSizeWithTag(2, caiAction2.store_value_to_feature_center) + CaiActionEmitEventToAppLog.ADAPTER.encodedSizeWithTag(3, caiAction2.emit_event_to_applog) + CaiActionManageScene.ADAPTER.encodedSizeWithTag(4, caiAction2.manage_scene) + caiAction2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiAction caiAction) {
            CaiAction caiAction2 = caiAction;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 255, caiAction2.action_type);
            CaiActionEmitEventToGlobalStream.ADAPTER.encodeWithTag(protoWriter, 1, caiAction2.emit_event_to_global_stream);
            CaiActionStoreValueToFeatureCenter.ADAPTER.encodeWithTag(protoWriter, 2, caiAction2.store_value_to_feature_center);
            CaiActionEmitEventToAppLog.ADAPTER.encodeWithTag(protoWriter, 3, caiAction2.emit_event_to_applog);
            CaiActionManageScene.ADAPTER.encodeWithTag(protoWriter, 4, caiAction2.manage_scene);
            protoWriter.writeBytes(caiAction2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 255)
    public Integer action_type;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToAppLog#ADAPTER", tag = 3)
    public CaiActionEmitEventToAppLog emit_event_to_applog;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToGlobalStream#ADAPTER", tag = 1)
    public CaiActionEmitEventToGlobalStream emit_event_to_global_stream;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionManageScene#ADAPTER", tag = 4)
    public CaiActionManageScene manage_scene;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionStoreValueToFeatureCenter#ADAPTER", tag = 2)
    public CaiActionStoreValueToFeatureCenter store_value_to_feature_center;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.action_type.hashCode()) * 37;
        CaiActionEmitEventToGlobalStream caiActionEmitEventToGlobalStream = this.emit_event_to_global_stream;
        int iHashCode2 = (iHashCode + (caiActionEmitEventToGlobalStream != null ? caiActionEmitEventToGlobalStream.hashCode() : 0)) * 37;
        CaiActionStoreValueToFeatureCenter caiActionStoreValueToFeatureCenter = this.store_value_to_feature_center;
        int iHashCode3 = (iHashCode2 + (caiActionStoreValueToFeatureCenter != null ? caiActionStoreValueToFeatureCenter.hashCode() : 0)) * 37;
        CaiActionEmitEventToAppLog caiActionEmitEventToAppLog = this.emit_event_to_applog;
        int iHashCode4 = (iHashCode3 + (caiActionEmitEventToAppLog != null ? caiActionEmitEventToAppLog.hashCode() : 0)) * 37;
        CaiActionManageScene caiActionManageScene = this.manage_scene;
        int iHashCode5 = iHashCode4 + (caiActionManageScene != null ? caiActionManageScene.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2223071Bzd newBuilder() {
        C2223071Bzd c2223071Bzd = new C2223071Bzd();
        c2223071Bzd.LIZLLL = this.action_type;
        c2223071Bzd.LJ = this.emit_event_to_global_stream;
        c2223071Bzd.LJFF = this.store_value_to_feature_center;
        c2223071Bzd.LJI = this.emit_event_to_applog;
        c2223071Bzd.LJII = this.manage_scene;
        c2223071Bzd.addUnknownFields(unknownFields());
        return c2223071Bzd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", action_type=");
        sb.append(this.action_type);
        if (this.emit_event_to_global_stream != null) {
            sb.append(", emit_event_to_global_stream=");
            sb.append(this.emit_event_to_global_stream);
        }
        if (this.store_value_to_feature_center != null) {
            sb.append(", store_value_to_feature_center=");
            sb.append(this.store_value_to_feature_center);
        }
        if (this.emit_event_to_applog != null) {
            sb.append(", emit_event_to_applog=");
            sb.append(this.emit_event_to_applog);
        }
        if (this.manage_scene != null) {
            sb.append(", manage_scene=");
            sb.append(this.manage_scene);
        }
        sb.replace(0, 2, "CaiAction{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiAction)) {
            return false;
        }
        CaiAction caiAction = (CaiAction) obj;
        if (unknownFields().equals(caiAction.unknownFields()) && this.action_type.equals(caiAction.action_type) && C1516540pZE.LJ(this.emit_event_to_global_stream, caiAction.emit_event_to_global_stream) && C1516540pZE.LJ(this.store_value_to_feature_center, caiAction.store_value_to_feature_center) && C1516540pZE.LJ(this.emit_event_to_applog, caiAction.emit_event_to_applog) && C1516540pZE.LJ(this.manage_scene, caiAction.manage_scene)) {
            return true;
        }
        return false;
    }

    public CaiAction(Integer num, CaiActionEmitEventToGlobalStream caiActionEmitEventToGlobalStream, CaiActionStoreValueToFeatureCenter caiActionStoreValueToFeatureCenter, CaiActionEmitEventToAppLog caiActionEmitEventToAppLog, CaiActionManageScene caiActionManageScene) {
        this(num, caiActionEmitEventToGlobalStream, caiActionStoreValueToFeatureCenter, caiActionEmitEventToAppLog, caiActionManageScene, ByteString.EMPTY);
    }

    public CaiAction(Integer num, CaiActionEmitEventToGlobalStream caiActionEmitEventToGlobalStream, CaiActionStoreValueToFeatureCenter caiActionStoreValueToFeatureCenter, CaiActionEmitEventToAppLog caiActionEmitEventToAppLog, CaiActionManageScene caiActionManageScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action_type = num;
        this.emit_event_to_global_stream = caiActionEmitEventToGlobalStream;
        this.store_value_to_feature_center = caiActionStoreValueToFeatureCenter;
        this.emit_event_to_applog = caiActionEmitEventToAppLog;
        this.manage_scene = caiActionManageScene;
    }
}
