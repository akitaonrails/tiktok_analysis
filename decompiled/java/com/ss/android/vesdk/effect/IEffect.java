package com.ss.android.vesdk.effect;

import X.C2178031ALx;
import X.C2254631DMn;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.algorithm.VEBaseAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public interface IEffect {
    int addTrackAlgorithm(int i, int i2, VEBaseAlgorithmParam vEBaseAlgorithmParam, int i3, int i4);

    int addTrackFilter(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4);

    void enableEffectWithCameraFacing(boolean z, int i);

    C2254631DMn getEffectFilterTime(long j);

    List<VEEffectFilterParam> getPreparedEffectList();

    int prepareEffects(List<VEEffectFilterParam> list);

    void regBachAlgorithmCallback(List<C2178031ALx> list);

    int releasePreparedEffects(List<VEEffectFilterParam> list);

    int removeTrackAlgorithm(int i);

    int removeTrackFilter(int i);

    void sendEffectMsg(int i, long j, long j2, byte[] bArr);

    void setARCoreParam(VEARCoreParam vEARCoreParam);

    <T> int setFilterParam(int i, String str, T t);

    void unregBachAlgorithmCallback();

    int updateTrackAlgorithmParam(int i, VEBaseAlgorithmParam vEBaseAlgorithmParam);

    int updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam);

    int updateTrackFilterTime(int i, int i2, int i3);
}
