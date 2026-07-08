package com.ss.android.ugc.profile.platform.exp;

import X.C1250600ieI;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public interface IProfileDefaultConfigAppDiffProtocol {
    public static final C1250600ieI LIZ = C1250600ieI.LIZ;

    public static final class DowngradeInstance implements IProfileDefaultConfigAppDiffProtocol {
        @Override // com.ss.android.ugc.profile.platform.exp.IProfileDefaultConfigAppDiffProtocol
        public final void LIZ() {
        }

        @Override // com.ss.android.ugc.profile.platform.exp.IProfileDefaultConfigAppDiffProtocol
        public final void LIZIZ() {
        }

        @Override // com.ss.android.ugc.profile.platform.exp.IProfileDefaultConfigAppDiffProtocol
        public final ProfileComponents LIZJ(ProfileComponents profileComponents) {
            return profileComponents;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.ugc.profile.platform.exp.IProfileDefaultConfigAppDiffProtocol
        public final List<ProfileComponents> LIZLLL(List<? extends ProfileComponents> list) {
            return list;
        }

        @Override // com.ss.android.ugc.profile.platform.exp.IProfileDefaultConfigAppDiffProtocol
        public final void LJ() {
        }
    }

    void LIZ();

    void LIZIZ();

    ProfileComponents LIZJ(ProfileComponents profileComponents);

    List<ProfileComponents> LIZLLL(List<? extends ProfileComponents> list);

    void LJ();
}
