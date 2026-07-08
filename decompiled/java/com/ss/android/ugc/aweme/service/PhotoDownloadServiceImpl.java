package com.ss.android.ugc.aweme.service;

import X.AbstractC1375080lt4;
import X.C1374320lrq;
import X.C1374880lsk;
import X.C1375580lts;
import X.C1375590ltt;
import X.C1375670lu1;
import X.C1376010luZ;
import X.C1376330lv5;
import X.C721220SQu;
import X.InterfaceC1370310llN;
import android.app.Activity;
import androidx.lifecycle.Observer;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoDownloadServiceImpl implements IPhotoDownloadService {
    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LIZ() {
        C1376010luZ.LIZ.getClass();
        C1376010luZ.LJIJJLI = C1376010luZ.LJIJJ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final boolean LIZJ() {
        C1376010luZ.LIZ.getClass();
        return C1376010luZ.LJJI;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJ() {
        C1376010luZ.LIZ.getClass();
        C1376010luZ.LIZJ = "";
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final int LJI() {
        C1376010luZ.LIZ.getClass();
        return C1376010luZ.LJIJJLI;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJII() {
        C1376010luZ.LIZ.getClass();
        if (C1376010luZ.LIZIZ || (!C1376010luZ.LJIIJJI.isEmpty())) {
            C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
            String str = C1376010luZ.LJIL;
            Aweme aweme = C1376010luZ.LJI;
            int i = C1376010luZ.LJIIIZ;
            String str2 = C1376010luZ.LJJII;
            c1375670lu1.getClass();
            C1375670lu1.LIZ(i, aweme, str, str2);
            C1375670lu1.LIZIZ(C1376010luZ.LJIIIZ, C1376010luZ.LJJIII, -1, C1376010luZ.LJI, C1376010luZ.LJIL, C1376010luZ.LJJII);
            int i2 = C1376010luZ.LJIIIIZZ;
            if (i2 != 0 && C1376010luZ.LJIJ != null) {
                DownloadServiceManager.INSTANCE.getDownloadService().cancel(i2);
            }
        }
        C1376010luZ.LIZIZ = false;
        C1376010luZ.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final Observer<Aweme> LJIIIIZZ() {
        return new Observer<Aweme>() { // from class: X.0lua
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Aweme aweme) {
                Aweme aweme2 = aweme;
                if (C2214201BlK.LJFF() != null) {
                    C1376010luZ.LIZ.getClass();
                    if (!((HashSet) C1376010luZ.LJIILIIL).isEmpty()) {
                        C1376010luZ.LJI = aweme2;
                        C1376010luZ.LJIIJJI = C1376010luZ.LJIILIIL;
                        C1376010luZ.LJIILIIL = new HashSet();
                        if (!C1376270luz.LIZIZ()) {
                            C1376270luz.LIZ.getClass();
                            C1376270luz.LIZJ = true;
                            C1376270luz.LJI = aweme2;
                            C1376010luZ.LJIJ();
                            if (C1376010luZ.LIZIZ) {
                                C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
                                Aweme aweme3 = C1376010luZ.LJI;
                                int i = C1376010luZ.LJIIIZ;
                                int i2 = C1376010luZ.LJJIII;
                                c1375670lu1.getClass();
                                C1375670lu1.LJ(i, i2, aweme3);
                            }
                        }
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final boolean LJIIIZ() {
        C1376010luZ.LIZ.getClass();
        return C1376010luZ.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJIIJJI() {
        C1376010luZ.LIZ.getClass();
        C1376010luZ.LJJI = true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LIZLLL(int i) {
        C1376010luZ.LIZ.getClass();
        C1376010luZ.LJIJJ = i;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJFF(SharePackage sharePackage) {
        C1375590ltt.LIZ(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LIZIZ(Activity activity, Integer num, final Aweme aweme, final C1374880lsk c1374880lsk, C1374320lrq c1374320lrq, final String str) {
        String str2;
        final C1376330lv5 c1376330lv5 = new C1376330lv5(new WeakReference(activity), num);
        AbstractC1375080lt4 abstractC1375080lt4 = new AbstractC1375080lt4() { // from class: X.0lub
            @Override // X.AbstractC1375080lt4
            public final void LIZLLL() {
                InterfaceC1376040luc interfaceC1376040luc = c1374880lsk;
                if (interfaceC1376040luc != null) {
                    interfaceC1376040luc.LIZIZ();
                }
            }

            @Override // X.AbstractC1375080lt4
            public final void LIZ(String str3) {
                InterfaceC1376040luc interfaceC1376040luc = c1374880lsk;
                if (interfaceC1376040luc != null) {
                    interfaceC1376040luc.onCancel();
                }
                C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
                String str4 = str;
                Aweme aweme2 = aweme;
                c1375670lu1.getClass();
                C1375670lu1.LIZIZ(1, 1, 0, aweme2, str4, str3);
                C1375670lu1.LIZLLL(aweme, 1, C093Y.LJ(1));
                C1376010luZ.LIZ.getClass();
                C1376010luZ.LJJI = false;
            }

            @Override // X.AbstractC1375080lt4
            public final void LIZIZ(int i) {
                InterfaceC1376040luc interfaceC1376040luc = c1374880lsk;
                if (interfaceC1376040luc != null) {
                    interfaceC1376040luc.onProgress(i);
                }
            }

            @Override // X.AbstractC1375080lt4
            public final void LIZJ(String str3) {
                InterfaceC1376040luc interfaceC1376040luc = c1374880lsk;
                if (interfaceC1376040luc != null) {
                    interfaceC1376040luc.LIZ();
                }
                C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
                String str4 = str;
                Aweme aweme2 = aweme;
                c1375670lu1.getClass();
                C1375670lu1.LIZIZ(1, 1, 0, aweme2, str4, str3);
                C1375670lu1.LIZLLL(aweme, 1, C093Y.LJ(1));
                C1376010luZ.LIZ.getClass();
                C1376010luZ.LJJI = false;
            }

            @Override // X.AbstractC1375080lt4
            public final void LJ(DownloadInfo downloadInfo) {
                C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
                Aweme aweme2 = aweme;
                c1375670lu1.getClass();
                C1375670lu1.LJ(1, 1, aweme2);
                InterfaceC1376040luc interfaceC1376040luc = c1374880lsk;
                if (interfaceC1376040luc != null) {
                    interfaceC1376040luc.LIZIZ();
                }
            }

            @Override // X.AbstractC1375080lt4
            public final void LJFF(String str3, String str4, boolean z) {
                C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
                String str5 = str;
                Aweme aweme2 = aweme;
                c1375670lu1.getClass();
                C1375670lu1.LIZIZ(1, 1, 1, aweme2, str5, str4);
                InterfaceC1376040luc interfaceC1376040luc = c1374880lsk;
                if (interfaceC1376040luc != null) {
                    C1376010luZ.LIZ.getClass();
                    int i = C1376010luZ.LIZLLL;
                    String str6 = C1376010luZ.LIZJ;
                    C1376330lv5 c1376330lv52 = c1376330lv5;
                    interfaceC1376040luc.LIZJ(str3, i, str6, c1376330lv52.LIZIZ, c1376330lv52.LIZJ);
                }
                C1376010luZ.LIZ.getClass();
                C1376010luZ.LJJI = false;
            }
        };
        boolean zLJI = MethodIDManager.LJI(137876);
        boolean z = false;
        String strLIZIZ = c1376330lv5.LIZIZ(aweme, 0, c1374320lrq, false);
        c1376330lv5.LIZLLL = C721220SQu.LIZJ(aweme, Collections.singleton(0));
        C1376010luZ c1376010luZ = C1376010luZ.LIZ;
        if (strLIZIZ == null) {
            str2 = "";
        } else {
            str2 = strLIZIZ;
        }
        c1376010luZ.getClass();
        C1376010luZ.LIZJ = str2;
        if (strLIZIZ != null) {
            if (C721220SQu.LJFF(0, aweme) && C721220SQu.LJII(0, aweme) > 0) {
                z = true;
            }
            c1376330lv5.LIZ(strLIZIZ, abstractC1375080lt4, c1374320lrq, z);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final InterfaceC1370310llN LJIIJ(Activity activity, Aweme aweme, String str, String str2, String str3, String str4, String str5, Integer num) {
        int iIntValue;
        String str6 = str4;
        String str7 = str;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        if (str5 != null) {
            str8 = str5;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return new C1375580lts(activity, aweme, str7, str2, str6, str8, iIntValue);
    }
}
