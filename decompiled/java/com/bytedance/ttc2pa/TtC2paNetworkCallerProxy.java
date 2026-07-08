package com.bytedance.ttc2pa;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttc2pa.utils.HttpRequestCall;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.jvm.internal.AwS613S0100000_34;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsXa21f4fe194d7eeb2;
import tt_c2pa_sdk.proto.FuncParamsXb0a419649fe6caae;
import tt_c2pa_sdk.proto.FuncReturnX0b7c3c1d607dee34;

/* JADX INFO: loaded from: classes35.dex */
public final class TtC2paNetworkCallerProxy implements TtC2paNetworkCaller, MoltenFFICallback {
    public static final Companion LIZIZ = new Companion();
    public final TtC2paNetworkCaller LIZ;

    public static final class Companion {
    }

    @Override // com.bytedance.ttc2pa.TtC2paNetworkCaller
    public final TtC2paNetworkResponse doPost(String str, Map<String, String> map, byte[] bArr, long j, boolean z) {
        return this.LIZ.doPost(str, map, bArr, j, z);
    }

    @Override // com.bytedance.ttc2pa.TtC2paNetworkCaller
    public final TtC2paNetworkResponse onRemoteSign(byte[] bArr) {
        return this.LIZ.onRemoteSign(bArr);
    }

    public TtC2paNetworkCallerProxy(HttpRequestCall httpRequestCall) {
        this.LIZ = httpRequestCall;
    }

    @Override // com.bytedance.ttc2pa.MoltenFFICallback
    public final BufferCallStatusV2 LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        ByteBuffer byteBufferAllocateDirect;
        InputStream byteArrayInputStream2;
        ByteBuffer byteBufferAllocateDirect2;
        boolean z = true;
        if (j == -6067208637716435419L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new ByteBufferInputStream(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                FuncParamsXa21f4fe194d7eeb2 funcParamsXa21f4fe194d7eeb2Decode = FuncParamsXa21f4fe194d7eeb2.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiTtC2paSdk.LIZ.getClass();
                    MoltenFfiTtC2paSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    TtC2paNetworkResponse ttC2paNetworkResponseDoPost = doPost(funcParamsXa21f4fe194d7eeb2Decode.url, funcParamsXa21f4fe194d7eeb2Decode.headers, funcParamsXa21f4fe194d7eeb2Decode.body.toByteArray(), funcParamsXa21f4fe194d7eeb2Decode.timeout_ms.longValue(), funcParamsXa21f4fe194d7eeb2Decode.add_comm_param.booleanValue());
                    ttC2paNetworkResponseDoPost.getClass();
                    Long lValueOf = Long.valueOf(ttC2paNetworkResponseDoPost.LIZ);
                    String str = ttC2paNetworkResponseDoPost.LIZIZ;
                    String str2 = ttC2paNetworkResponseDoPost.LIZJ;
                    byte[] bArr = ttC2paNetworkResponseDoPost.LIZLLL;
                    FuncReturnX0b7c3c1d607dee34 funcReturnX0b7c3c1d607dee34 = new FuncReturnX0b7c3c1d607dee34(new tt_c2pa_sdk.proto.TtC2paNetworkResponse(lValueOf, str, str2, ByteString.of(bArr, 0, bArr.length)));
                    int iEncodedSize = FuncReturnX0b7c3c1d607dee34.ADAPTER.encodedSize(funcReturnX0b7c3c1d607dee34);
                    AwS613S0100000_34 awS613S0100000_34 = new AwS613S0100000_34(funcReturnX0b7c3c1d607dee34, 15);
                    if (iEncodedSize <= 0) {
                        byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
                    } else {
                        byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
                        awS613S0100000_34.invoke(new ByteBufferOutputStream(byteBufferAllocateDirect));
                    }
                    BufferCallStatusV2.LIZIZ.getClass();
                    return new BufferCallStatusV2(byteBufferAllocateDirect);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiTtC2paSdk.LIZ.getClass();
                        MoltenFfiTtC2paSdk.freeNativeMemory(byteBuffer);
                    }
                    BufferCallStatusV2.LIZIZ.getClass();
                    return new BufferCallStatusV2(null);
                }
            } catch (Exception e2) {
                e = e2;
                z = false;
            }
        } else if (j == -3788389689611190189L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream2 = new ByteBufferInputStream(byteBuffer);
                } else {
                    byteArrayInputStream2 = new ByteArrayInputStream(new byte[0]);
                }
                FuncParamsXb0a419649fe6caae funcParamsXb0a419649fe6caaeDecode = FuncParamsXb0a419649fe6caae.ADAPTER.decode(byteArrayInputStream2);
                if (byteBuffer != null) {
                    MoltenFfiTtC2paSdk.LIZ.getClass();
                    MoltenFfiTtC2paSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    TtC2paNetworkResponse ttC2paNetworkResponseOnRemoteSign = onRemoteSign(funcParamsXb0a419649fe6caaeDecode.request_body.toByteArray());
                    ttC2paNetworkResponseOnRemoteSign.getClass();
                    Long lValueOf2 = Long.valueOf(ttC2paNetworkResponseOnRemoteSign.LIZ);
                    String str3 = ttC2paNetworkResponseOnRemoteSign.LIZIZ;
                    String str4 = ttC2paNetworkResponseOnRemoteSign.LIZJ;
                    byte[] bArr2 = ttC2paNetworkResponseOnRemoteSign.LIZLLL;
                    FuncReturnX0b7c3c1d607dee34 funcReturnX0b7c3c1d607dee342 = new FuncReturnX0b7c3c1d607dee34(new tt_c2pa_sdk.proto.TtC2paNetworkResponse(lValueOf2, str3, str4, ByteString.of(bArr2, 0, bArr2.length)));
                    int iEncodedSize2 = FuncReturnX0b7c3c1d607dee34.ADAPTER.encodedSize(funcReturnX0b7c3c1d607dee342);
                    AwS613S0100000_34 awS613S0100000_342 = new AwS613S0100000_34(funcReturnX0b7c3c1d607dee342, 16);
                    if (iEncodedSize2 <= 0) {
                        byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(0);
                    } else {
                        byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iEncodedSize2);
                        awS613S0100000_342.invoke(new ByteBufferOutputStream(byteBufferAllocateDirect2));
                    }
                    BufferCallStatusV2.LIZIZ.getClass();
                    return new BufferCallStatusV2(byteBufferAllocateDirect2);
                } catch (Exception e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiTtC2paSdk.LIZ.getClass();
                        MoltenFfiTtC2paSdk.freeNativeMemory(byteBuffer);
                    }
                    BufferCallStatusV2.LIZIZ.getClass();
                    return new BufferCallStatusV2(null);
                }
            } catch (Exception e4) {
                e = e4;
                z = false;
            }
        } else {
            return new BufferCallStatusV2(null);
        }
    }
}
