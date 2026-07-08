package com.ss.android.ugc.aweme.aigc;

import X.C054G;
import X.C05YD;
import X.C08HM;
import X.C08QA;
import X.C09IR;
import X.C09N5;
import X.C0CHQ;
import X.C0LN2;
import X.C0LN4;
import X.C0LN7;
import X.C0LN8;
import X.C0LN9;
import X.C0LNA;
import X.C0MI0;
import X.C0PEM;
import X.C0VSJ;
import X.C19292410dm;
import X.C1BNE;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C2286708xd;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C2471909mP;
import X.C2473209mc;
import X.C2473609mg;
import X.C541870LMz;
import X.C546820LcW;
import X.C547140Ld2;
import X.C570490MZb;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC20227914Cv;
import X.InterfaceC332260D0u;
import android.graphics.BitmapFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.common.FileService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public final class FileServiceImpl implements FileService {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final ConcurrentHashMap<String, InterfaceC332260D0u<C0LN4<String>>> LIZIZ = new ConcurrentHashMap<>();
    public final C2252331DDr LIZJ = C09IR.LIZIZ(0, 64, null, 5);

    public static C0MI0 LJII(Source source) {
        C0MI0 next;
        Iterator<C0MI0> it2 = C0MI0.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getNameSpace(), source.getSource().toLowerCase(Locale.ROOT))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0MI0 c0mi0 = next;
        if (c0mi0 != null) {
            return c0mi0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Please define PersistentResourceType for ");
        sbLIZ.append(source.getSource());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static EnumC20227914Cv LJIIIIZZ(C0LN8 c0ln8) {
        EnumC20227914Cv next;
        Iterator<EnumC20227914Cv> it2 = EnumC20227914Cv.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (u.LJIJI(next.getNameSpace(), c0ln8.getTag(), true)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC20227914Cv enumC20227914Cv = next;
        if (enumC20227914Cv != null) {
            return enumC20227914Cv;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Please define PublicResourceType for ");
        sbLIZ.append(c0ln8);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
    public final String LIZIZ(C0LN8 c0ln8) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(LJIIIIZZ(c0ln8), "", true).getPath();
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
    public final String LJI(Source source, CreativeInfo creativeInfo) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZ(creativeInfo, LJII(source), "", true).getPath();
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
    public final C0VSJ LIZJ(C0LN8 c0ln8, String str, String str2) {
        String strLIZJ = C08HM.LIZJ(str2);
        String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(LJIIIIZZ(c0ln8), C0CHQ.LIZ().getAccountService().getCurrentUserID(), true).getPath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ);
        sbLIZ.append(str);
        return new C0VSJ(path, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
    public final String LJ(Source source, CreativeInfo creativeInfo, String str) {
        if (!C570490MZb.LJ(str)) {
            C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Input media file ");
            sbLIZ.append(str);
            sbLIZ.append(" not found");
            c547140Ld2.LIZIZ("FileServiceImpl", C2188811AlT.LIZIZ(sbLIZ), null);
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        String strLJIJJLI = C2471909mP.LJIJJLI(str, true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C08QA.LJIJI(c0vsj));
        sbLIZ2.append('.');
        sbLIZ2.append(strLJIJJLI);
        File fileLIZLLL = LIZLLL(source, creativeInfo, C2188811AlT.LIZIZ(sbLIZ2), true);
        if (fileLIZLLL == null) {
            return null;
        }
        String absolutePath = fileLIZLLL.getAbsolutePath();
        if (Intrinsics.LJFF(str, absolutePath)) {
            return str;
        }
        C2286708xd.LJI(str, absolutePath);
        return absolutePath;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
    public final MediaModel LJFF(C0LN8 c0ln8, MediaModel mediaModel, int i) {
        String uid;
        String strLJFF;
        String strValueOf;
        if (Math.max(mediaModel.width, mediaModel.height) <= i) {
            return mediaModel;
        }
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            uid = "-1";
        }
        String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(LJIIIIZZ(c0ln8), uid, true).getPath();
        if (C2471909mP.LJJIIZI(mediaModel.LJFF())) {
            C844470XAv.LIZ.getClass();
            strLJFF = C09N5.LIZ(C844470XAv.LIZ(), UriProtector.parse(mediaModel.LJFF()));
        } else {
            strLJFF = mediaModel.LJFF();
        }
        if (!C570490MZb.LJ(strLJFF)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.W3().getPath());
            sbLIZ.append(File.separator);
            sbLIZ.append(mediaModel.relativePath);
            sbLIZ.append(mediaModel.fileName);
            strLJFF = C2188811AlT.LIZIZ(sbLIZ);
            if (!C570490MZb.LJ(strLJFF) && (strLJFF = mediaModel.mediaPickerAbsolutePath) == null && (strLJFF = mediaModel.relativePath) == null) {
                strLJFF = "";
            }
        }
        if (strLJFF.length() > 0) {
            strValueOf = C08HM.LIZJ(strLJFF);
        } else {
            strValueOf = String.valueOf(System.currentTimeMillis());
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(path);
        sbLIZ2.append(strValueOf);
        sbLIZ2.append(".jpg");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        C844470XAv.LIZ.getClass();
        Pair pairLIZ = C2473209mc.LIZ(C844470XAv.LIZ(), strLJFF, strLIZIZ, i, new C2473609mg(i));
        int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
        mediaModel.LJIILL(strLIZIZ);
        if (iIntValue <= 0) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(strLIZIZ, options);
            iIntValue = options.outWidth;
        }
        mediaModel.width = iIntValue;
        if (iIntValue2 <= 0) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(strLIZIZ, options2);
            iIntValue2 = options2.outHeight;
        }
        mediaModel.height = iIntValue2;
        mediaModel.fileSize = C2286708xd.LJIIL(strLIZIZ);
        return mediaModel;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
    public final File LIZLLL(Source source, CreativeInfo creativeInfo, String str, boolean z) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIL(creativeInfo, LJII(source), str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
    public final C05YD LIZ(int i, C0LN8 c0ln8, String str, final String str2, String str3) {
        C0LN7 c0ln7;
        ConcurrentHashMap<String, InterfaceC332260D0u<C0LN4<String>>> concurrentHashMap = this.LIZIZ;
        InterfaceC332260D0u<C0LN4<String>> interfaceC332260D0u = concurrentHashMap.get(str2);
        Object obj = interfaceC332260D0u;
        if (interfaceC332260D0u == null) {
            final C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C0LN4() { // from class: X.0LN9
            });
            this.LIZJ.LIZJ(new Object(str2, c2252321DDqLIZ) { // from class: X.0LN6
                public final String LIZ;
                public final C05YD<C0LN4<String>> LIZIZ;

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C0LN6)) {
                        return false;
                    }
                    C0LN6 c0ln6 = (C0LN6) obj2;
                    return Intrinsics.LJFF(this.LIZ, c0ln6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ln6.LIZIZ);
                }

                public final int hashCode() {
                    return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DownloadTaskAddedEvent(key=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", value=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str2;
                    this.LIZIZ = c2252321DDqLIZ;
                }
            });
            InterfaceC332260D0u<C0LN4<String>> interfaceC332260D0uPutIfAbsent = concurrentHashMap.putIfAbsent(str2, c2252321DDqLIZ);
            obj = c2252321DDqLIZ;
            if (interfaceC332260D0uPutIfAbsent != null) {
                obj = interfaceC332260D0uPutIfAbsent;
            }
        }
        InterfaceC332260D0u interfaceC332260D0u2 = (InterfaceC332260D0u) ((C05YD) obj);
        C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadToCache, begin: fileUri = ");
        sbLIZ.append(str2);
        sbLIZ.append(", url = ");
        sbLIZ.append(str);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(i);
        c547140Ld2.LIZJ("FileServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        Object value = interfaceC332260D0u2.getValue();
        if ((value instanceof C0LN7) && (c0ln7 = (C0LN7) value) != null) {
            String str4 = (String) c0ln7.LIZ;
            if (!C570490MZb.LJ(str4)) {
                interfaceC332260D0u2.setValue(new C0LN4() { // from class: X.0LN9
                });
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("downloadToCache, cache invalid: url = ");
                sbLIZ2.append(str);
                sbLIZ2.append(", path=");
                sbLIZ2.append(str4);
                c547140Ld2.LIZJ("FileServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                interfaceC332260D0u2.setValue(new C0LN7(c0ln7.LIZ, C0LNA.MEMORY));
            }
        }
        if (interfaceC332260D0u2.getValue() instanceof C0LN9) {
            c547140Ld2.LIZJ("FileServiceImpl", "downloadToCache, startDownload");
            interfaceC332260D0u2.setValue(new C0LN2(6));
            C23250099c.LIZLLL(this.LIZ, null, null, new C541870LMz(i, this, c0ln8, str3, str2, str, null, interfaceC332260D0u2), 3);
        }
        return interfaceC332260D0u2;
    }
}
