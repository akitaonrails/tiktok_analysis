package com.ss.android.ugc.aweme.creative.compileconfig.strategies.source;

import X.C0NTU;
import X.C13LE;
import X.C2217371BqR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC608270NtR;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileconfig.strategies.source.CanvasCompileConfigParams;

/* JADX INFO: loaded from: classes23.dex */
public final class CanvasCompileConfigParams extends BaseCompileConfigParams {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final int $stable;
    public Bitmap outputBitmap;
    public BitmapFactory.Options outputBitmapOptions;
    public final InterfaceC608270NtR outputSize$delegate;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(CanvasCompileConfigParams.class, "outputSize", "getOutputSize()Lcom/ss/android/ugc/aweme/creative/compileconfig/CompileConfigResolution;", 0);
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217371BqR};
        $stable = 8;
    }

    public final CompileConfigResolution getOutputSize() {
        return (CompileConfigResolution) this.outputSize$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public CanvasCompileConfigParams() {
        final CompileConfigResolution compileConfigResolution = new CompileConfigResolution(0, 0, null, null, 15, null);
        this.outputSize$delegate = new C0NTU<CompileConfigResolution>(compileConfigResolution) { // from class: X.1DaX
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                CanvasCompileConfigParams canvasCompileConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(canvasCompileConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(canvasCompileConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(canvasCompileConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(CompileConfigResolution.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(CompileConfigResolution.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    public final Bitmap getOutputBitmap() {
        return this.outputBitmap;
    }

    public final BitmapFactory.Options getOutputBitmapOptions() {
        return this.outputBitmapOptions;
    }

    public final void setOutputBitmap(Bitmap bitmap) {
        this.outputBitmap = bitmap;
    }

    public final void setOutputBitmapOptions(BitmapFactory.Options options) {
        this.outputBitmapOptions = options;
    }

    public final void setOutputSize(CompileConfigResolution compileConfigResolution) {
        this.outputSize$delegate.setValue(this, $$delegatedProperties[0], compileConfigResolution);
    }
}
