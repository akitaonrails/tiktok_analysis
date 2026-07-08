package com.ss.android.ugc.aweme.screenshot;

import X.AbstractC2361009My;
import X.C0ADB;
import X.C0PEM;
import X.C1106210etP;
import X.C1371970lo3;
import X.C1372380loi;
import X.C1372460loq;
import X.C1372470lor;
import X.C1373180lq0;
import X.C1375860luK;
import X.C13BV;
import X.C13LE;
import X.C19EG;
import X.C20343314it;
import X.C2174091A6t;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2360909Mx;
import X.C593490NPn;
import X.C621180OYa;
import X.C786410Ut5;
import X.EnumC1372650lp9;
import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.PoiSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ScreenShotService implements IScreenshotService {
    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LIZ() {
        C2360909Mx.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final String LJII() {
        C2360909Mx.LIZ.getClass();
        return C2360909Mx.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final Map<String, String> LJIIIIZZ() {
        AbstractC2361009My abstractC2361009My;
        Map<String, String> mapMobExtraParams;
        C2360909Mx.LIZ.getClass();
        Reference<AbstractC2361009My> reference = C2360909Mx.LJ;
        LinkedHashMap linkedHashMap = (reference == null || (abstractC2361009My = reference.get()) == null || (mapMobExtraParams = abstractC2361009My.mobExtraParams()) == null) ? new LinkedHashMap() : new LinkedHashMap(mapMobExtraParams);
        if (linkedHashMap.get("enter_from") == null) {
            linkedHashMap.put("enter_from", "other");
        }
        C20343314it c20343314it = C20343314it.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Get the page info: ");
        sbLIZ.append(linkedHashMap);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20343314it.getClass();
        C20343314it.LIZ(strLIZIZ);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LIZIZ(Context context) {
        C2174091A6t.LJIIIIZZ.getClass();
        C2174091A6t value = C2174091A6t.LJIIJ.getValue();
        value.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C593490NPn(value, context, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LIZJ(String str) {
        if (str != null) {
            C2360909Mx c2360909Mx = C2360909Mx.LIZ;
            c2360909Mx.getClass();
            if (C2360909Mx.LIZIZ != null) {
                c2360909Mx.getClass();
                if (!Intrinsics.LJFF(C2360909Mx.LIZIZ, str)) {
                    return;
                }
            } else {
                return;
            }
        }
        C2360909Mx.LIZ.getClass();
        C2360909Mx.LIZIZ = null;
        C2360909Mx.LJ = null;
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LIZLLL(AbstractC2361009My abstractC2361009My) {
        WeakReference<AbstractC2361009My> next;
        C2360909Mx.LIZ.getClass();
        Iterator<WeakReference<AbstractC2361009My>> it2 = C2360909Mx.LJFF.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AbstractC2361009My abstractC2361009My2 = next.get();
                if (abstractC2361009My2 != null && abstractC2361009My2.hashCode() == abstractC2361009My.hashCode()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        WeakReference<AbstractC2361009My> weakReference = next;
        if (weakReference != null) {
            weakReference.clear();
            C2360909Mx.LJFF.remove(weakReference);
        }
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LJFF(AbstractC2361009My abstractC2361009My) {
        C2360909Mx.LIZ.getClass();
        C2360909Mx.LJFF.add(new WeakReference<>(abstractC2361009My));
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final TuxSheet LJ(C19EG c19eg, ScreenShotContent screenShotContent) {
        SharePackage sharePackageLJIIIZ = LJIIIZ(c19eg, screenShotContent, "live");
        if (sharePackageLJIIIZ != null) {
            return C621180OYa.LIZ.LJIIZILJ(sharePackageLJIIIZ, c19eg, new C1371970lo3(C13LE.LIZ(sharePackageLJIIIZ.getClass())));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final void LJI(String str, AbstractC2361009My abstractC2361009My) {
        C2360909Mx c2360909Mx = C2360909Mx.LIZ;
        c2360909Mx.getClass();
        if (C2360909Mx.LIZIZ != null) {
            c2360909Mx.getClass();
            if (Intrinsics.LJFF(C2360909Mx.LIZIZ, str)) {
                return;
            }
        }
        c2360909Mx.getClass();
        C2360909Mx.LIZIZ = str;
        if (((Boolean) C0ADB.LIZ.getValue()).booleanValue()) {
            C2360909Mx.LJ = new WeakReference(abstractC2361009My);
        } else {
            C2360909Mx.LJ = new SoftReference(abstractC2361009My);
        }
    }

    @Override // com.ss.android.ugc.aweme.screenshot.IScreenshotService
    public final SharePackage LJIIIZ(C19EG c19eg, ScreenShotContent screenShotContent, String str) {
        C1372470lor c1372470lor;
        C1106210etP c1106210etP;
        User user;
        Aweme aweme;
        Object obj = screenShotContent.content;
        if (obj instanceof Aweme) {
            C20343314it.LIZ.getClass();
            Object obj2 = screenShotContent.content;
            if (!(obj2 instanceof Aweme) || (aweme = (Aweme) obj2) == null) {
                return null;
            }
            AwemeSharePackage.Companion.getClass();
            AwemeSharePackage awemeSharePackageLIZJ = C1375860luK.LIZJ(aweme, c19eg, 0, str, "", "screenshot_popup", true);
            C786410Ut5.LJJJI("screenshot_image_path", screenShotContent.imagePath, awemeSharePackageLIZJ.extras);
            return awemeSharePackageLIZJ;
        }
        if (obj instanceof User) {
            C20343314it c20343314it = C20343314it.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            c20343314it.getClass();
            Object obj3 = screenShotContent.content;
            if (!(obj3 instanceof User) || (user = (User) obj3) == null) {
                return null;
            }
            UserSharePackage.Companion.getClass();
            UserSharePackage userSharePackageLIZLLL = C1373180lq0.LIZLLL(user, c19eg, c13bv, str, "screenshot_popup");
            C786410Ut5.LJJJI("screenshot_image_path", screenShotContent.imagePath, userSharePackageLIZLLL.extras);
            return userSharePackageLIZLLL;
        }
        if (obj instanceof C1106210etP) {
            C20343314it.LIZ.getClass();
            Object obj4 = screenShotContent.content;
            if (!(obj4 instanceof C1106210etP) || (c1106210etP = (C1106210etP) obj4) == null) {
                return null;
            }
            C1372380loi c1372380loi = LiveSharePackage.Companion;
            c1106210etP.LJJLIIJ = screenShotContent.imagePath;
            c1372380loi.getClass();
            LiveSharePackage liveSharePackageLJIIIIZZ = C1372380loi.LJIIIIZZ(c19eg, c1106210etP);
            C786410Ut5.LJJJI("panel_source", "screenshot_popup", liveSharePackageLJIIIIZZ.extras);
            return liveSharePackageLJIIIIZZ;
        }
        if (!(obj instanceof C1372470lor) || (c1372470lor = (C1372470lor) obj) == null) {
            return null;
        }
        C1372460loq c1372460loq = PoiSharePackage.Companion;
        EnumC1372650lp9 enumC1372650lp9 = EnumC1372650lp9.SCREENSHOT_SHARE;
        c1372460loq.getClass();
        return C1372460loq.LIZ(c19eg, c1372470lor, enumC1372650lp9);
    }
}
