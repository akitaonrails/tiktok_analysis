package com.ss.android.ugc.gamora.editor;

import X.C0MUK;
import X.C1388190mED;
import X.C1697810uHb;
import X.C20622515mp;
import X.C21146717pB;
import X.C2188811AlT;
import X.C262120APa;
import X.C262130APb;
import X.C283450B9b;
import X.C283460B9c;
import X.C283470B9d;
import X.C545820Lau;
import X.C786410Ut5;
import X.C857610Xkd;
import X.C857620Xke;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.optimization.InjectLayoutInflater;
import com.ss.android.ugc.aweme.services.optimization.PreloadContextReplaceHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public final class LayoutPreloadForEditPageServiceImp implements ILayoutPreloadServiceForEditPage {
    public int LIZIZ;
    public final Set<Integer> LIZ = new LinkedHashSet();
    public final List<Integer> LIZJ = C1697810uHb.LJIIJJI(10, 11, 14, 18, 17, 2, 16, 20, 100);

    public static int LIZIZ(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 14) {
            return 10;
        }
        if (i == 16) {
            return 7;
        }
        if (i != 18) {
            return (i == 20 || i == 23 || i == 29 || !(i == 10 || i == 11)) ? 0 : 10;
        }
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage
    public final void clearCache() {
        this.LIZ.clear();
        this.LIZIZ = 0;
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage
    public final InjectLayoutInflater createInjectLayoutInflater() {
        return new InjectLayoutInflater() { // from class: X.0Xkc
            public String LIZ = "";

            @Override // com.ss.android.ugc.aweme.services.optimization.InjectLayoutInflater
            public final boolean isInjectionEnabled() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.services.optimization.InjectLayoutInflater
            public final void setTag(String str) {
                this.LIZ = str;
            }

            @Override // com.ss.android.ugc.aweme.services.optimization.InjectLayoutInflater
            public final View inflate(Context context, int i, ViewGroup viewGroup, boolean z) {
                int iIntValue;
                long jCurrentTimeMillis = System.currentTimeMillis();
                View viewLIZIZ = C21146717pB.LIZIZ(context, i, viewGroup, z);
                PreloadContextReplaceHelper.replaceAfterInflate(viewLIZIZ, context, z, viewGroup);
                String str = this.LIZ;
                Map<String, Integer> map = C857610Xkd.LIZIZ;
                int i2 = 0;
                if (((Integer) ((LinkedHashMap) map).get(str)) != null && r0.intValue() - 1 > 0) {
                    i2 = iIntValue;
                }
                C857620Xke c857620Xke = (C857620Xke) ((LinkedHashMap) C857610Xkd.LIZ).get(str);
                if (c857620Xke != null) {
                    map.put(str, Integer.valueOf(i2));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("inflate: ");
                    sbLIZ.append(str);
                    sbLIZ.append(" (");
                    sbLIZ.append(i2);
                    sbLIZ.append('/');
                    sbLIZ.append(c857620Xke.LIZJ);
                    sbLIZ.append(") cost: ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                return viewLIZIZ;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[ADDED_TO_REGION, REMOVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ(int r6) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.LayoutPreloadForEditPageServiceImp.LIZ(int):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage
    public final void preloadLayoutFilesForPublishExtension(Context context) {
        int iIntValue;
        int iIntValue2;
        if (context != null) {
            ArrayList<C857620Xke> arrayList = new ArrayList();
            arrayList.add(new C857620Xke("share_layout_publish_cell_item_v2", "BaseSyncShareViewV2#getLayoutResId", 1));
            arrayList.add(new C857620Xke("share_layout_radio_button", "BaseSyncShareViewV2#share_layout_radio_button", 2));
            arrayList.add(new C857620Xke("poi_view_publish_extension", "PoiPublishExtension#poi_view_publish_extension", 1));
            arrayList.add(new C857620Xke("item_publish_multi_anchor", "MultiAnchorPublishSettingItem#item_publish_multi_anchor", 1));
            arrayList.add(new C857620Xke("poi_publish_extension_cell", " PoiPublishExtensionCell#poi_publish_extension_cell", 1));
            arrayList.add(new C857620Xke("publish_item_publish_setting_tux", "PublishSettingItem#publish_item_publish_setting_tux", 1));
            arrayList.add(new C857620Xke("layout_option_template_disclosure_cell", "DisclosureCellPublishOptionViewFactory#layout_option_template_disclosure_cell", 1));
            long jCurrentTimeMillis = System.currentTimeMillis() - C857610Xkd.LIZJ;
            if (jCurrentTimeMillis >= 60) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clean expired cache: ");
                sbLIZ.append(jCurrentTimeMillis);
                sbLIZ.append(" > ");
                sbLIZ.append(60L);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                ((LinkedHashMap) C857610Xkd.LIZIZ).clear();
            }
            C857610Xkd.LIZJ = System.currentTimeMillis();
            for (C857620Xke c857620Xke : arrayList) {
                String str = c857620Xke.LIZIZ;
                Map<String, C857620Xke> map = C857610Xkd.LIZ;
                if (((LinkedHashMap) map).get(str) == null) {
                    map.put(str, c857620Xke);
                }
                Map<String, Integer> map2 = C857610Xkd.LIZIZ;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
                if (linkedHashMap.get(str) == null) {
                    map2.put(str, 0);
                }
                Integer num = (Integer) linkedHashMap.get(str);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                int i = c857620Xke.LIZJ;
                if (iIntValue >= i) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("abort because oversize: ");
                    sbLIZ2.append(c857620Xke.LIZIZ);
                    sbLIZ2.append(" (");
                    sbLIZ2.append(iIntValue);
                    sbLIZ2.append(c857620Xke.LIZJ);
                    sbLIZ2.append(')');
                    C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    int i2 = 0;
                    while (i2 < i) {
                        C21146717pB.LIZLLL(context, c857620Xke.LIZ);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("preload: ");
                        sbLIZ3.append(c857620Xke.LIZIZ);
                        sbLIZ3.append(" (");
                        i2++;
                        sbLIZ3.append(i2);
                        sbLIZ3.append('/');
                        sbLIZ3.append(c857620Xke.LIZJ);
                        sbLIZ3.append(')');
                        C2188811AlT.LIZIZ(sbLIZ3);
                        Map<String, Integer> map3 = C857610Xkd.LIZIZ;
                        Integer num2 = (Integer) ((LinkedHashMap) map3).get(str);
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        map3.put(str, Integer.valueOf(iIntValue2 + 1));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage
    public final void preloadLayoutFiles(Context context, Bundle bundle) {
        Activity activityLIZ;
        if (bundle != null && context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && C20622515mp.LIZJ(activityLIZ) != null && C262130APb.LIZ()) {
            int i = C0MUK.LIZJ(bundle).recordData.shootMode;
            if (C262130APb.LIZ()) {
                Iterator it2 = LIZ(i).iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    if (!this.LIZ.contains(Integer.valueOf(iIntValue))) {
                        this.LIZ.add(Integer.valueOf(iIntValue));
                        C21146717pB.LIZJ(context, iIntValue);
                    }
                }
            }
            if (((Number) C262130APb.LIZ.getValue()).intValue() == 2) {
                int iLIZIZ = LIZIZ(i);
                int i2 = iLIZIZ - this.LIZIZ;
                for (int i3 = 0; i3 < i2; i3++) {
                    C21146717pB.LIZJ(context, R.layout.i9s);
                }
                this.LIZIZ = Math.max(iLIZIZ, this.LIZIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage
    public final void preloadLayoutFilesForUpload(Scene scene, String str) {
        preloadLayoutFilesFromShootMode(scene, 100);
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage
    public final void preloadLayoutFilesFromShootMode(Scene scene, Integer num) {
        ArrayList arrayList = new ArrayList();
        if (C262120APa.LIZ() && num != null) {
            if (this.LIZJ.contains(Integer.valueOf(num.intValue())) && scene != null && C20622515mp.LJ(scene) != null) {
                if (C262120APa.LIZ()) {
                    Iterator it2 = LIZ(num.intValue()).iterator();
                    boolean z = false;
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        if (!this.LIZ.contains(Integer.valueOf(iIntValue))) {
                            this.LIZ.add(Integer.valueOf(iIntValue));
                            arrayList.add(Integer.valueOf(iIntValue));
                            z = true;
                        }
                    }
                    if (z) {
                        C21146717pB.LJFF(C545820Lau.LIZIZ(scene), "Edit", arrayList);
                    }
                }
                if (((Number) C262120APa.LIZ.getValue()).intValue() == 2) {
                    int iLIZIZ = LIZIZ(num.intValue());
                    int i = iLIZIZ - this.LIZIZ;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList2.add(Integer.valueOf(R.layout.i9s));
                    }
                    if (arrayList2.size() > 0) {
                        C21146717pB.LJFF(C545820Lau.LIZIZ(scene), "Edit", arrayList2);
                    }
                    this.LIZIZ = Math.max(iLIZIZ, this.LIZIZ);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage
    public final void preloadLayoutFiles(Context context, int i) {
        if (context == null) {
            return;
        }
        Iterator it2 = LIZ(i).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (!this.LIZ.contains(Integer.valueOf(iIntValue))) {
                this.LIZ.add(Integer.valueOf(iIntValue));
                C21146717pB.LIZJ(context, iIntValue);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage
    public final View loadLayoutFiles(String str, Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        if ((C262130APb.LIZ() || C262120APa.LIZ() || ((Boolean) C283450B9b.LIZ.getValue()).booleanValue() || ((Boolean) C283470B9d.LIZ.getValue()).booleanValue() || ((Boolean) C283460B9c.LIZ.getValue()).booleanValue()) && this.LIZ.contains(Integer.valueOf(i))) {
            if (context != null) {
                this.LIZ.remove(Integer.valueOf(i));
                return C21146717pB.LIZIZ(context, i, viewGroup, z);
            }
            return C786410Ut5.Td(layoutInflater, i, viewGroup, z);
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, z);
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage
    public final View loadLayoutToolbarFiles(String str, Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        int i2;
        if ((((Number) C262130APb.LIZ.getValue()).intValue() == 2 || ((Number) C262120APa.LIZ.getValue()).intValue() == 2) && (i2 = this.LIZIZ) > 0) {
            if (context != null) {
                this.LIZIZ = i2 - 1;
                return C21146717pB.LIZIZ(context, i, viewGroup, z);
            }
            return C786410Ut5.Td(layoutInflater, i, viewGroup, z);
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, z);
    }
}
