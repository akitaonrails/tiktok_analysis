package com.ss.android.ugc.aweme.hometab.base.tabicon;

import X.C01GW;
import X.C0B75;
import X.C0NLG;
import X.C0NLH;
import X.C0NLJ;
import X.C0NLN;
import X.C0NLQ;
import X.C0NLR;
import X.C0NLS;
import X.C0NLT;
import X.C0NLU;
import X.C0NLX;
import X.C0NLY;
import X.C0NLZ;
import X.C0PEM;
import X.C1216270hkv;
import X.C1586060rNM;
import X.C1592410rXb;
import X.C1AF0;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C452501pT;
import X.C592330NLb;
import X.C592340NLc;
import X.C592350NLd;
import X.C592360NLe;
import X.EnumC592410NLj;
import X.InterfaceC497601wk;
import X.InterfaceC592390NLh;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.IconConfig;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.IconSizeConfig;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabIconViewConfig;
import com.ss.android.ugc.aweme.hometab.base.tabicon.settings.DynamicTabConfigModel;
import com.ss.android.ugc.aweme.hometab.base.tabicon.settings.IconSizeModel;
import com.ss.android.ugc.aweme.hometab.base.tabicon.settings.RealIconSizeModel;
import com.ss.android.ugc.aweme.hometab.base.tabicon.settings.SafeIconSizeModel;
import com.ss.android.ugc.aweme.tabicon.ITabIconService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class TabIconServiceImpl implements ITabIconService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C0NLQ());

    @Override // com.ss.android.ugc.aweme.tabicon.ITabIconService
    public final boolean LJII() {
        return ((Boolean) C0B75.LIZ.getValue()).booleanValue();
    }

    public final C0NLN LJIIIIZZ() {
        return (C0NLN) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tabicon.ITabIconService
    public final void LJFF() {
        if (LJII()) {
            C0NLN c0nlnLJIIIIZZ = LJIIIIZZ();
            c0nlnLJIIIIZZ.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NLH(c0nlnLJIIIIZZ, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.tabicon.ITabIconService
    public final void releaseResource() {
        if (LJII()) {
            C0NLU c0nluLIZ = LJIIIIZZ().LIZ();
            C23118094a.LJ(c0nluLIZ.LIZJ.LL);
            c0nluLIZ.LIZLLL.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0165 A[Catch: all -> 0x021a, TryCatch #0 {, blocks: (B:7:0x000c, B:9:0x0013, B:11:0x001b, B:16:0x002c, B:20:0x0032, B:21:0x0033, B:25:0x0038, B:28:0x0055, B:30:0x0059, B:32:0x005f, B:35:0x0070, B:37:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0089, B:46:0x0090, B:48:0x0094, B:54:0x00a3, B:56:0x00bb, B:58:0x00c7, B:61:0x00cc, B:63:0x00da, B:65:0x00e0, B:67:0x00e4, B:69:0x00ea, B:71:0x00ee, B:87:0x0114, B:91:0x0124, B:93:0x013c, B:95:0x0140, B:96:0x0142, B:98:0x0155, B:100:0x0159, B:103:0x0160, B:105:0x0169, B:104:0x0165, B:72:0x00f3, B:75:0x00fa, B:77:0x00fe, B:79:0x0104, B:81:0x0108, B:106:0x0179, B:108:0x0186, B:110:0x018f, B:112:0x01a4, B:113:0x01b5, B:114:0x01ce, B:115:0x01d5, B:117:0x01db, B:119:0x01e5, B:121:0x01e9, B:126:0x01f0, B:127:0x01f3, B:128:0x01f4, B:129:0x0208, B:131:0x020e, B:12:0x001c, B:14:0x0024), top: B:137:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013c A[Catch: all -> 0x021a, TryCatch #0 {, blocks: (B:7:0x000c, B:9:0x0013, B:11:0x001b, B:16:0x002c, B:20:0x0032, B:21:0x0033, B:25:0x0038, B:28:0x0055, B:30:0x0059, B:32:0x005f, B:35:0x0070, B:37:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0089, B:46:0x0090, B:48:0x0094, B:54:0x00a3, B:56:0x00bb, B:58:0x00c7, B:61:0x00cc, B:63:0x00da, B:65:0x00e0, B:67:0x00e4, B:69:0x00ea, B:71:0x00ee, B:87:0x0114, B:91:0x0124, B:93:0x013c, B:95:0x0140, B:96:0x0142, B:98:0x0155, B:100:0x0159, B:103:0x0160, B:105:0x0169, B:104:0x0165, B:72:0x00f3, B:75:0x00fa, B:77:0x00fe, B:79:0x0104, B:81:0x0108, B:106:0x0179, B:108:0x0186, B:110:0x018f, B:112:0x01a4, B:113:0x01b5, B:114:0x01ce, B:115:0x01d5, B:117:0x01db, B:119:0x01e5, B:121:0x01e9, B:126:0x01f0, B:127:0x01f3, B:128:0x01f4, B:129:0x0208, B:131:0x020e, B:12:0x001c, B:14:0x0024), top: B:137:0x000c, inners: #1 }] */
    @Override // com.ss.android.ugc.aweme.tabicon.ITabIconService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r18) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hometab.base.tabicon.TabIconServiceImpl.LIZ(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.tabicon.ITabIconService
    public final void LIZLLL(InterfaceC592390NLh interfaceC592390NLh, EnumC592410NLj enumC592410NLj) {
        if (!LJII()) {
            return;
        }
        C0NLU c0nluLIZ = LJIIIIZZ().LIZ();
        c0nluLIZ.getClass();
        int i = C0NLZ.LIZ[enumC592410NLj.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c0nluLIZ.LIZIZ.remove(interfaceC592390NLh);
                return;
            }
            return;
        }
        c0nluLIZ.LIZ.remove(interfaceC592390NLh);
    }

    @Override // com.ss.android.ugc.aweme.tabicon.ITabIconService
    public final boolean LJ(C592360NLe c592360NLe, Pair<Integer, Integer> pair) {
        float f;
        C01GW c01gw = C592340NLc.LIZIZ;
        RealIconSizeModel realIconSizeModel = ((DynamicTabConfigModel) c01gw.getValue()).realIconSizeConfig;
        if (realIconSizeModel == null || !realIconSizeModel.disableCheckIconSize) {
            if (pair == null) {
                C1AF0.LIZJ("CheckCustomTabIconSizeUtils#isIconSizeValid: realIconSize is null");
                return false;
            }
            int iIntValue = pair.getFirst().intValue();
            int iIntValue2 = pair.getSecond().intValue();
            if (iIntValue > 0 && iIntValue2 > 0) {
                float f2 = c592360NLe.LIZJ;
                if (f2 > 0.0f) {
                    float f3 = c592360NLe.LIZLLL;
                    if (f3 > 0.0f) {
                        float f4 = iIntValue / iIntValue2;
                        float f5 = f2 / f3;
                        RealIconSizeModel realIconSizeModel2 = ((DynamicTabConfigModel) c01gw.getValue()).realIconSizeConfig;
                        if (realIconSizeModel2 != null) {
                            f = realIconSizeModel2.iconSizeRatioError;
                        } else {
                            f = 0.02f;
                        }
                        if (Math.abs(f4 - f5) >= f) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("CheckCustomTabIconSizeUtils#isIconSizeValid: icon size is invalid, realRatio = ");
                            sbLIZ.append(f4);
                            sbLIZ.append(", expectRatio = ");
                            sbLIZ.append(f5);
                            sbLIZ.append(", errorRatio = ");
                            sbLIZ.append(f);
                            sbLIZ.append(", realWidth = ");
                            sbLIZ.append(iIntValue);
                            sbLIZ.append(", realHeight = ");
                            sbLIZ.append(iIntValue2);
                            sbLIZ.append(", expectWidth = ");
                            sbLIZ.append(c592360NLe.LIZJ);
                            sbLIZ.append(", expectHeight = ");
                            sbLIZ.append(c592360NLe.LIZLLL);
                            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                            return false;
                        }
                    }
                }
            }
            C1AF0.LIZJ("CheckCustomTabIconSizeUtils#isIconSizeValid: invalid size param(s)");
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tabicon.ITabIconService
    public final void LJI(InterfaceC592390NLh interfaceC592390NLh, EnumC592410NLj enumC592410NLj) {
        if (!LJII()) {
            return;
        }
        C0NLU c0nluLIZ = LJIIIIZZ().LIZ();
        c0nluLIZ.getClass();
        int i = C0NLZ.LIZ[enumC592410NLj.ordinal()];
        if (i != 1) {
            if (i == 2 && !c0nluLIZ.LIZIZ.contains(interfaceC592390NLh)) {
                c0nluLIZ.LIZIZ.add(interfaceC592390NLh);
                return;
            }
            return;
        }
        if (c0nluLIZ.LIZ.contains(interfaceC592390NLh)) {
            return;
        }
        c0nluLIZ.LIZ.add(interfaceC592390NLh);
    }

    @Override // com.ss.android.ugc.aweme.tabicon.ITabIconService
    public final C592330NLb LIZJ(EnumC592410NLj enumC592410NLj, String str, String str2) {
        Object next;
        TabIconViewConfig tabIconViewConfig;
        IconSizeModel iconSizeModel;
        C0NLR c0nlr;
        if (!LJII()) {
            return null;
        }
        C0NLN c0nlnLJIIIIZZ = LJIIIIZZ();
        synchronized (c0nlnLJIIIIZZ) {
            Iterator it2 = ((ArrayList) c0nlnLJIIIIZZ.LIZJ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    TabDynamicIconInfo tabDynamicIconInfo = (TabDynamicIconInfo) next;
                    if (Intrinsics.LJFF(tabDynamicIconInfo.tabKey, str) && (c0nlr = tabDynamicIconInfo.LIZ) != null && c0nlr.LIZIZ) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TabDynamicIconInfo tabDynamicIconInfo2 = (TabDynamicIconInfo) next;
            if (tabDynamicIconInfo2 == null) {
                return null;
            }
            C0NLR c0nlr2 = tabDynamicIconInfo2.LIZ;
            if (c0nlr2 != null && !c0nlr2.LIZ) {
                EnumC592410NLj enumC592410NLj2 = EnumC592410NLj.TOP;
                if (enumC592410NLj == enumC592410NLj2) {
                    tabIconViewConfig = tabDynamicIconInfo2.topTabIconConfig;
                } else {
                    tabIconViewConfig = tabDynamicIconInfo2.bottomTabIconConfig;
                }
                if (tabIconViewConfig == null) {
                    return null;
                }
                IconConfig iconConfig = tabIconViewConfig.iconConfig;
                if (iconConfig != null) {
                    String str3 = iconConfig.iconSelectLightUrl;
                    String str4 = iconConfig.iconUnSelectLightUrl;
                    String str5 = iconConfig.iconSelectDarkUrl;
                    String str6 = iconConfig.iconUnSelectDarkUrl;
                    if (str3 != null && str3.length() != 0 && str4 != null && str4.length() != 0 && str5 != null && str5.length() != 0 && str6 != null && str6.length() != 0) {
                        IconSizeConfig iconSizeConfig = tabIconViewConfig.iconSizeConfig;
                        if (iconSizeConfig != null) {
                            Float f = iconSizeConfig.width;
                            Float f2 = iconSizeConfig.height;
                            if (f != null && f2 != null) {
                                SafeIconSizeModel safeIconSizeModel = ((DynamicTabConfigModel) C592340NLc.LIZIZ.getValue()).safeIconSize;
                                if (enumC592410NLj == enumC592410NLj2) {
                                    if (safeIconSizeModel != null) {
                                        iconSizeModel = safeIconSizeModel.topSafeIconSize;
                                        if (iconSizeModel != null && (f.floatValue() > iconSizeModel.iconWidthMax || f.floatValue() < iconSizeModel.iconWidthMin || f2.floatValue() > iconSizeModel.iconHeightMax || f2.floatValue() < iconSizeModel.iconHeightMin)) {
                                            C0NLS c0nls = C0NLS.LIZ;
                                            String str7 = tabDynamicIconInfo2.iconId;
                                            c0nls.getClass();
                                            C0NLS.LIZIZ(str7, str, enumC592410NLj, false, "icon_size_error", "", null);
                                            return null;
                                        }
                                    }
                                } else if (safeIconSizeModel != null) {
                                    iconSizeModel = safeIconSizeModel.bottomSafeIconSize;
                                    if (iconSizeModel != null) {
                                        C0NLS c0nls2 = C0NLS.LIZ;
                                        String str72 = tabDynamicIconInfo2.iconId;
                                        c0nls2.getClass();
                                        C0NLS.LIZIZ(str72, str, enumC592410NLj, false, "icon_size_error", "", null);
                                        return null;
                                    }
                                }
                                String str8 = tabDynamicIconInfo2.iconId;
                                if (str8 == null) {
                                    str8 = "";
                                }
                                C1592410rXb c1592410rXb = new C1592410rXb(str3, str5, str4, str6);
                                C592360NLe c592360NLe = new C592360NLe(C1216270hkv.LIZ(f.floatValue()), C1216270hkv.LIZ(f2.floatValue()), f.floatValue(), f2.floatValue());
                                C0NLR c0nlr3 = tabDynamicIconInfo2.LIZ;
                                return new C592330NLb(str, str2, str8, enumC592410NLj, c1592410rXb, c592360NLe, c0nlr3.LIZLLL, c0nlr3.LJ);
                            }
                        }
                        C0NLS c0nls3 = C0NLS.LIZ;
                        String str9 = tabDynamicIconInfo2.iconId;
                        c0nls3.getClass();
                        C0NLS.LIZIZ(str9, str, enumC592410NLj, false, "icon_size_error", "", null);
                        return null;
                    }
                }
                C0NLS c0nls4 = C0NLS.LIZ;
                String str10 = tabDynamicIconInfo2.iconId;
                c0nls4.getClass();
                C0NLS.LIZIZ(str10, str, enumC592410NLj, false, "icon_res_error", "", null);
                return null;
            }
            C0NLS c0nls5 = C0NLS.LIZ;
            String str11 = tabDynamicIconInfo2.iconId;
            c0nls5.getClass();
            C0NLS.LIZIZ(str11, str, enumC592410NLj, false, "resource_not_downloaded", "", null);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.tabicon.ITabIconService
    public final void LIZIZ(C592330NLb c592330NLb, C0NLT c0nlt, String str, boolean z, String str2) {
        Object next;
        String str3;
        if (!LJII()) {
            return;
        }
        C0NLN c0nlnLJIIIIZZ = LJIIIIZZ();
        c0nlnLJIIIIZZ.getClass();
        if (z) {
            if (c592330NLb.LJI) {
                C0NLU c0nluLIZ = c0nlnLJIIIIZZ.LIZ();
                long j = c592330NLb.LJII;
                C592350NLd c592350NLd = new C592350NLd(j, c592330NLb);
                synchronized (c0nluLIZ.LIZLLL) {
                    try {
                        if (!c0nluLIZ.LIZLLL.containsKey(c592350NLd.LIZIZ)) {
                            long jLIZ = j - C1586060rNM.LIZ();
                            if (jLIZ <= 0) {
                                C23250099c.LIZLLL(c0nluLIZ.LIZJ, null, null, new C0NLY(c0nluLIZ, c592350NLd, null), 3);
                            } else {
                                c0nluLIZ.LIZLLL.put(c592350NLd.LIZIZ, C23250099c.LIZLLL(c0nluLIZ.LIZJ, null, null, new C0NLX(jLIZ, c0nluLIZ, c592350NLd, null), 3));
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } else {
            String str4 = c592330NLb.LIZJ;
            if (str2 != null && a0.LJJIIZI(str2, "Encoded image is not valid", false)) {
                C0NLJ c0nlj = (C0NLJ) c0nlnLJIIIIZZ.LIZIZ.getValue();
                Iterator it2 = ((ArrayList) c0nlnLJIIIIZZ.LIZJ).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((TabDynamicIconInfo) next).iconId, str4)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                TabDynamicIconInfo tabDynamicIconInfo = (TabDynamicIconInfo) next;
                c0nlj.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reDownloadIcon: ");
                if (tabDynamicIconInfo != null) {
                    str3 = tabDynamicIconInfo.iconId;
                } else {
                    str3 = null;
                }
                sbLIZ.append(str3);
                C2188811AlT.LIZIZ(sbLIZ);
                if (tabDynamicIconInfo != null) {
                    C23250099c.LIZLLL((InterfaceC497601wk) c0nlj.LIZ.getValue(), null, null, new C0NLG(c0nlj, tabDynamicIconInfo, null), 3);
                }
            }
        }
        C0NLS c0nls = C0NLS.LIZ;
        String str5 = c592330NLb.LIZJ;
        String str6 = c592330NLb.LIZ;
        EnumC592410NLj enumC592410NLj = c592330NLb.LIZLLL;
        c0nls.getClass();
        C0NLS.LIZIZ(str5, str6, enumC592410NLj, z, str2, str, c0nlt);
    }
}
