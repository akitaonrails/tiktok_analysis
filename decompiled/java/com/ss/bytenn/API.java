package com.ss.bytenn;

import X.EnumC1152970g6p;
import X.EnumC1512960pTS;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.bytenn.Tensor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes24.dex */
public class API {
    public static String TAG = "BYTENN.API";
    public long engineHandle;
    public int modelBufferSize;

    public static native long nativeCreateEngineInstance();

    public static native int nativeDestroyEngine(long j);

    public static native Tensor nativeGetEngineGradient(long j, String str);

    public static native Tensor[] nativeGetEngineOutputs(long j);

    public static native Tensor nativeGetEngineWeight(long j, String str);

    public static native Tensor[] nativeGetInputConfig(long j);

    public static native int nativeInference(long j);

    public static native int nativeInitEngine(long j, ByteNNConfig byteNNConfig);

    public static native int nativeReInferShape(long j, int i, int i2);

    public static native int nativeReInferShapeTensors(long j, Tensor[] tensorArr);

    public static native int nativeReleaseEngine(long j);

    public static native int nativeSaveModel(long j, ByteBuffer byteBuffer);

    public static native int nativeSetEngineInputs(long j, Tensor[] tensorArr);

    public static native int nativeSetEngineLabel(long j, Tensor[] tensorArr);

    public static native int nativeSetEngineLossLayer(long j, LossInfo[] lossInfoArr);

    public static native int nativeSetEngineWeight(long j, Tensor tensor);

    public static native int nativeSetOptimizer(long j, int i, float f, String[] strArr);

    public static native float nativeStep(long j);

    static {
        INVOKESTATIC_com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
        INVOKESTATIC_com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytennwrapper");
    }

    public float Step() {
        return nativeStep(this.engineHandle);
    }

    public EnumC1512960pTS CreateEngine() {
        long jNativeCreateEngineInstance = nativeCreateEngineInstance();
        this.engineHandle = jNativeCreateEngineInstance;
        return jNativeCreateEngineInstance == 0 ? EnumC1512960pTS.ERR_MEMORY_ALLOC : EnumC1512960pTS.NO_ERROR;
    }

    public EnumC1512960pTS DestroyEngine() {
        EnumC1512960pTS enumC1512960pTS = EnumC1512960pTS.values()[nativeDestroyEngine(this.engineHandle)];
        this.engineHandle = 0L;
        return enumC1512960pTS;
    }

    public EnumC1512960pTS Inference() {
        return EnumC1512960pTS.values()[nativeInference(this.engineHandle)];
    }

    public EnumC1512960pTS ReleaseEngine() {
        return EnumC1512960pTS.values()[nativeReleaseEngine(this.engineHandle)];
    }

    public static void INVOKESTATIC_com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public EnumC1512960pTS GetEngineInputConfig(ArrayList<Tensor> arrayList) {
        long j = this.engineHandle;
        if (j == 0) {
            return EnumC1512960pTS.NULL_POINTER;
        }
        Tensor[] tensorArrNativeGetInputConfig = nativeGetInputConfig(j);
        if (tensorArrNativeGetInputConfig.length <= 0) {
            return EnumC1512960pTS.ERR_UNEXPECTED;
        }
        arrayList.clear();
        for (Tensor tensor : tensorArrNativeGetInputConfig) {
            tensor.getData().order(ByteOrder.nativeOrder());
            arrayList.add(tensor);
        }
        return EnumC1512960pTS.NO_ERROR;
    }

    public EnumC1512960pTS GetEngineOutputs(ArrayList<Tensor> arrayList) {
        Tensor[] tensorArrNativeGetEngineOutputs = nativeGetEngineOutputs(this.engineHandle);
        if (tensorArrNativeGetEngineOutputs.length <= 0) {
            return EnumC1512960pTS.ERR_UNEXPECTED;
        }
        for (Tensor tensor : tensorArrNativeGetEngineOutputs) {
            arrayList.add(tensor);
        }
        return EnumC1512960pTS.NO_ERROR;
    }

    public EnumC1512960pTS InitEngine(ByteNNConfig byteNNConfig) {
        if (byteNNConfig == null) {
            return EnumC1512960pTS.INPUT_DATA_ERROR;
        }
        int iNativeInitEngine = nativeInitEngine(this.engineHandle, byteNNConfig);
        EnumC1512960pTS enumC1512960pTS = EnumC1512960pTS.NO_ERROR;
        if (enumC1512960pTS != EnumC1512960pTS.values()[iNativeInitEngine]) {
            return EnumC1512960pTS.values()[iNativeInitEngine];
        }
        this.modelBufferSize = byteNNConfig.getModelBufferSize();
        return enumC1512960pTS;
    }

    public EnumC1512960pTS ReInferShapeTensors(ArrayList<Tensor> arrayList) {
        return EnumC1512960pTS.values()[nativeReInferShapeTensors(this.engineHandle, (Tensor[]) arrayList.toArray(new Tensor[arrayList.size()]))];
    }

    public EnumC1512960pTS SaveModel(ByteBuffer byteBuffer) {
        if (byteBuffer != null && byteBuffer.isDirect() && byteBuffer.capacity() >= this.modelBufferSize) {
            return EnumC1512960pTS.values()[nativeSaveModel(this.engineHandle, byteBuffer)];
        }
        return EnumC1512960pTS.INPUT_DATA_ERROR;
    }

    public EnumC1512960pTS SetEngineInputs(ArrayList<Tensor> arrayList) {
        return EnumC1512960pTS.values()[nativeSetEngineInputs(this.engineHandle, (Tensor[]) arrayList.toArray(new Tensor[arrayList.size()]))];
    }

    public EnumC1512960pTS SetEngineLabel(ArrayList<Tensor> arrayList) {
        return EnumC1512960pTS.values()[nativeSetEngineLabel(this.engineHandle, (Tensor[]) arrayList.toArray(new Tensor[arrayList.size()]))];
    }

    public EnumC1512960pTS SetEngineWeight(Tensor tensor) {
        if (tensor != null && tensor.getData().isDirect()) {
            return EnumC1512960pTS.values()[nativeSetEngineWeight(this.engineHandle, tensor)];
        }
        return EnumC1512960pTS.INPUT_DATA_ERROR;
    }

    public EnumC1512960pTS SetLossLayer(ArrayList<LossInfo> arrayList) {
        return EnumC1512960pTS.values()[nativeSetEngineLossLayer(this.engineHandle, (LossInfo[]) arrayList.toArray(new LossInfo[arrayList.size()]))];
    }

    public EnumC1512960pTS GetEngineGradient(String str, Tensor tensor) {
        if (tensor == null) {
            return EnumC1512960pTS.INPUT_DATA_ERROR;
        }
        Tensor tensorNativeGetEngineGradient = nativeGetEngineGradient(this.engineHandle, str);
        tensor.setBatch(tensorNativeGetEngineGradient.getBatch());
        tensor.setChannel(tensorNativeGetEngineGradient.getChannel());
        tensor.setHeight(tensorNativeGetEngineGradient.getHeight());
        tensor.setWidth(tensorNativeGetEngineGradient.getWidth());
        tensor.setData(tensorNativeGetEngineGradient.getData());
        tensor.setDataFormat(Tensor.DataFormat.values()[tensorNativeGetEngineGradient.getOrdinalOfDataFormat()]);
        tensor.setDataType(Tensor.DataType.values()[tensorNativeGetEngineGradient.getOrdinalOfDataType()]);
        tensor.setName(tensorNativeGetEngineGradient.getName());
        return EnumC1512960pTS.NO_ERROR;
    }

    public EnumC1512960pTS GetEngineWeight(String str, Tensor tensor) {
        if (tensor == null) {
            return EnumC1512960pTS.INPUT_DATA_ERROR;
        }
        Tensor tensorNativeGetEngineWeight = nativeGetEngineWeight(this.engineHandle, str);
        tensor.setBatch(tensorNativeGetEngineWeight.getBatch());
        tensor.setChannel(tensorNativeGetEngineWeight.getChannel());
        tensor.setHeight(tensorNativeGetEngineWeight.getHeight());
        tensor.setWidth(tensorNativeGetEngineWeight.getWidth());
        tensor.setData(tensorNativeGetEngineWeight.getData());
        tensor.setDataFormat(Tensor.DataFormat.values()[tensorNativeGetEngineWeight.getOrdinalOfDataFormat()]);
        tensor.setDataType(Tensor.DataType.values()[tensorNativeGetEngineWeight.getOrdinalOfDataType()]);
        tensor.setName(tensorNativeGetEngineWeight.getName());
        return EnumC1512960pTS.NO_ERROR;
    }

    public EnumC1512960pTS ReInferShape(int i, int i2) {
        return EnumC1512960pTS.values()[nativeReInferShape(this.engineHandle, i2, i)];
    }

    public EnumC1512960pTS SetOptimizer(EnumC1152970g6p enumC1152970g6p, float f, ArrayList<String> arrayList) {
        return EnumC1512960pTS.values()[nativeSetOptimizer(this.engineHandle, enumC1152970g6p.ordinal(), f, (String[]) arrayList.toArray(new String[arrayList.size()]))];
    }
}
