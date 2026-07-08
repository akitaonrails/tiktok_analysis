package com.bytedance.ies.cutsame.cut_android;

import X.C098200Yq;
import X.C189200o6;
import X.C2169008ee;
import X.C2188811AlT;
import X.C559870LxZ;
import X.InterfaceC559900Lxc;
import com.bytedance.ies.nle.editor_jni.NLECollectionModel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class NLETemplateConverter {
    public long LIZ;

    private final native long nativeCreate_collection_nle(long j, String str);

    private final native long nativeCreate_nle(long j, String str);

    private final native void nativeRelease_nle(long j);

    private final native void nativeSetUnMutableVideoSlot(long j, long j2);

    private final native String nativeStoreToZipFromDraft(long j, String str);

    private final native String nativeStoreToZipFromDraftWithMalloc(long j, String str);

    static {
        C2169008ee.LIZ.LIZ();
        NLE.loadNLELibrary$default(NLE.INSTANCE, true, false, false, 6, null);
    }

    public final void finalize() {
        try {
            if (this.LIZ != 0) {
                InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                C559870LxZ.LJFF("NLETemplateConverter", "You forget to release NLETemplateConverter !!");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("releaseObject : ");
                sbLIZ.append(this.LIZ);
                C559870LxZ.LIZJ("NLETemplateConverter", C2188811AlT.LIZIZ(sbLIZ));
                long j = this.LIZ;
                if (j != 0) {
                    nativeRelease_nle(j);
                    this.LIZ = 0L;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public NLETemplateConverter() {
    }

    public final void LIZ(VecNLETrackSlotSPtr vecNLETrackSlotSPtr) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("NLETemplateConverter", "setUnMutableVideoSlot");
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeSetUnMutableVideoSlot(j, VecNLETrackSlotSPtr.getCPtr(vecNLETrackSlotSPtr));
    }

    public final String LIZIZ(String str) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("NLETemplateConverter", "storeToZipFromDraft");
        long j = this.LIZ;
        if (j == 0) {
            return "";
        }
        return nativeStoreToZipFromDraft(j, str);
    }

    public final String LIZJ(String str) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("NLETemplateConverter", "storeToZipFromDraftWithMalloc");
        long j = this.LIZ;
        if (j == 0) {
            return "";
        }
        return nativeStoreToZipFromDraftWithMalloc(j, str);
    }

    public NLETemplateConverter(NLECollectionModel nLECollectionModel, String str) {
        this();
        this.LIZ = nativeCreate_collection_nle(NLECollectionModel.getCPtr(nLECollectionModel), str);
    }

    public NLETemplateConverter(String str, NLEModel nLEModel) {
        this();
        this.LIZ = nativeCreate_nle(NLEModel.getCPtr(nLEModel), str);
    }
}
