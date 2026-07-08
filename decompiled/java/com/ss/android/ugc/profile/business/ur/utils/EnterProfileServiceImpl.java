package com.ss.android.ugc.profile.business.ur.utils;

import X.C0OFX;
import X.C0OFZ;
import android.content.Context;
import com.ss.android.ugc.aweme.enter.IEnterProfileService;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class EnterProfileServiceImpl implements IEnterProfileService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0OFX] */
    @Override // com.ss.android.ugc.aweme.enter.IEnterProfileService
    public final C0OFX LIZ(Context context, String str, String str2, String str3, String str4, String str5) {
        return new C0OFZ(context, str, str2, str3, str4, str5) { // from class: X.0OFX
            public final Context LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public Map<String, ? extends Object> LJI = C2097608Jq.LJ();
            public Map<String, ? extends Object> LJII = C2097608Jq.LJ();

            @Override // X.C0OFZ
            public final C0OFZ LIZ(Map<String, ? extends Object> map) {
                this.LJII = map;
                return this;
            }

            @Override // X.C0OFZ
            public final C0OFZ LIZJ(Map<String, ? extends Object> map) {
                this.LJI = map;
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0057 A[PHI: r1
              0x0057: PHI (r1v21 java.lang.String) = (r1v4 java.lang.String), (r1v22 java.lang.String) binds: [B:28:0x0055, B:26:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[PHI: r1
              0x005d: PHI (r1v20 java.lang.String) = (r1v4 java.lang.String), (r1v21 java.lang.String) binds: [B:28:0x0055, B:30:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00a6 A[PHI: r1
              0x00a6: PHI (r1v23 java.lang.String) = (r1v2 java.lang.String), (r1v24 java.lang.String) binds: [B:21:0x0042, B:19:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C0OFZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(int r10, android.view.View r11) {
                /*
                    Method dump skipped, instruction units count: 311
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0OFX.LIZIZ(int, android.view.View):void");
            }

            {
                this.LIZ = context;
                this.LIZIZ = str;
                this.LIZJ = str2;
                this.LIZLLL = str3;
                this.LJ = str4;
                this.LJFF = str5;
            }
        };
    }
}
