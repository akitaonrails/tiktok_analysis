package com.ss.android.ugc.aweme.account.prompt;

import X.C04TD;
import X.C0XUE;
import X.C10GR;
import X.C19EG;
import X.C1BVD;
import X.C1BVI;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.experiment.prompt.ShowPromptToConfirmDynamicDataExperiment;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public final class AccountShowConfirmPromptServiceImpl implements IAccountShowBindPromptApi {
    public static IAccountShowBindPromptApi LIZJ() {
        Object objLIZ = C04TD.LIZ(IAccountShowBindPromptApi.class, false);
        if (objLIZ != null) {
            return (IAccountShowBindPromptApi) objLIZ;
        }
        if (C04TD.LJLJJLL == null) {
            synchronized (IAccountShowBindPromptApi.class) {
                if (C04TD.LJLJJLL == null) {
                    C04TD.LJLJJLL = new AccountShowConfirmPromptServiceImpl();
                }
            }
        }
        return C04TD.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi
    public final boolean LIZ() {
        Object next;
        Long loginTime;
        C1BVD.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("usau_confirm_email_phone_phase_2", 0) != 1) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("row_update_email_phone_phase_2", 0) != 1) {
                return false;
            }
        }
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            return false;
        }
        User curUser = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
        if (curUser.getUid() == null) {
            return false;
        }
        Iterator it2 = ((ArrayList) C0XUE.LIZ.LJ(curUser.getUid())).iterator();
        long jLongValue = 0;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                Long loginTime2 = ((BaseLoginMethod) next).getLoginTime();
                char c = (loginTime2 == null || loginTime2.longValue() <= 0) ? (char) 0 : (char) 1;
                do {
                    Object next2 = it2.next();
                    Long loginTime3 = ((BaseLoginMethod) next2).getLoginTime();
                    if (loginTime3 != null && loginTime3.longValue() > 0 && c < 1) {
                        next = next2;
                        c = 1;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) next;
        if (baseLoginMethod != null && (loginTime = baseLoginMethod.getLoginTime()) != null) {
            jLongValue = loginTime.longValue();
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - jLongValue) / 1000;
        ShowPromptToConfirmDynamicDataExperiment.Frequency frequency = ShowPromptToConfirmDynamicDataExperiment.LIZ().verifyEmailPhoneFrequencyControl;
        if (frequency == null || jCurrentTimeMillis < frequency.timeAfterLogin) {
            return false;
        }
        String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C1BVD.LIZ(storeRegionUpperCase)) {
            linkedHashMap.put("x", Integer.valueOf(frequency.nonAutoConfirmSysPopFreq));
            linkedHashMap.put("y", Integer.valueOf(frequency.nonAutoConfirmSysDismissSoftCap));
            linkedHashMap.put("z", Integer.valueOf(frequency.nonAutoConfirmSysAdjustedFreq));
            linkedHashMap.put("w", Integer.valueOf(frequency.nonAutoConfirmSysMaxNumberDisplayed));
        } else {
            linkedHashMap.put("x", Integer.valueOf(frequency.autoConfirmSysPopFreq));
            linkedHashMap.put("y", Integer.valueOf(frequency.autoConfirmSysDismissSoftCap));
            linkedHashMap.put("z", Integer.valueOf(frequency.autoConfirmSysAdjustedFreq));
            linkedHashMap.put("w", Integer.valueOf(frequency.autoConfirmSysMaxNumberDisplayed));
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Keva keva = C1BVD.LIZIZ;
        int i = keva.getInt("impression_time", 0);
        long j = (jCurrentTimeMillis2 - keva.getLong("last_show_time", -1L)) / 1000;
        Integer num = (Integer) linkedHashMap.get("w");
        if (i >= (num != null ? num.intValue() : -1)) {
            return false;
        }
        int i2 = keva.getInt("not_now_time", 0);
        Integer num2 = (Integer) linkedHashMap.get("y");
        if (i2 >= (num2 != null ? num2.intValue() : -1)) {
            if (j < (((Integer) linkedHashMap.get("z")) != null ? r0.intValue() : -1)) {
                return false;
            }
        } else {
            if (j < (((Integer) linkedHashMap.get("x")) != null ? r0.intValue() : -1)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi
    public final void LIZIZ(final C19EG c19eg, final String str, Function0<Unit> function0) {
        C1BVD.LIZ.getClass();
        Set<Integer> setLJIJJLI = ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJIJJLI();
        User curUser = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
        boolean zContains = setLJIJJLI.contains(2);
        boolean zContains2 = setLJIJJLI.contains(1);
        if (zContains) {
            String email = curUser.getEmail();
            if (email != null && !a0.LJJJIL(email)) {
                final C1BVI c1bvi = C1BVI.EMAIL;
                final String email2 = curUser.getEmail();
                PopupManager.LJIJI(new C10GR(c1bvi, c19eg, email2, str) { // from class: X.1BVC
                    public final C1BVI LL;
                    public final C19EG LLILLJJLI;
                    public final String LLILLL;
                    public final String LLILZ;
                    public final int LLILZIL = 851;

                    @Override // X.InterfaceC20660415sw
                    public final C688120Qyw i2() {
                        C19EG c19eg2 = this.LLILLJJLI;
                        return new C688120Qyw(c19eg2, c19eg2, null);
                    }

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return this.LLILZIL;
                    }

                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                        List listLJIIJJI;
                        String str2;
                        C1BVD c1bvd = C1BVD.LIZ;
                        C1BVI c1bvi2 = this.LL;
                        C19EG c19eg2 = this.LLILLJJLI;
                        String str3 = this.LLILLL;
                        String str4 = this.LLILZ;
                        AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(c20656615sK, 103);
                        c1bvd.getClass();
                        C1BVD.LIZJ = awS578S0100000_34;
                        Keva keva = C1BVD.LIZIZ;
                        int i = keva.getInt("impression_time", 0) + 1;
                        String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
                        if (!C1BVD.LIZ(storeRegionUpperCase)) {
                            C1BVD.LIZJ(c1bvi2);
                        }
                        ShowPromptToConfirmDynamicDataExperiment.MetaData metaDataLIZ = ShowPromptToConfirmDynamicDataExperiment.LIZ();
                        int[] iArr = C1BVH.LIZ;
                        int i2 = iArr[c1bvi2.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                if (C1BVD.LIZ(storeRegionUpperCase)) {
                                    ShowPromptToConfirmDynamicDataExperiment.Strings strings = metaDataLIZ.verifyEmailPhonePopupStrings;
                                    listLJIIJJI = C1697810uHb.LJIIJJI(strings.nonAutoConfirmPopupHeaderPhone, strings.nonAutoConfirmPopupBodyPhone);
                                } else {
                                    ShowPromptToConfirmDynamicDataExperiment.Strings strings2 = metaDataLIZ.verifyEmailPhonePopupStrings;
                                    listLJIIJJI = C1697810uHb.LJIIJJI(strings2.autoConfirmPopupHeaderPhone, strings2.autoConfirmPopupBodyPhone);
                                }
                            } else {
                                throw new C1954807lC();
                            }
                        } else if (C1BVD.LIZ(storeRegionUpperCase)) {
                            ShowPromptToConfirmDynamicDataExperiment.Strings strings3 = metaDataLIZ.verifyEmailPhonePopupStrings;
                            listLJIIJJI = C1697810uHb.LJIIJJI(strings3.nonAutoConfirmPopupHeaderEmail, strings3.nonAutoConfirmPopupBodyEmail);
                        } else {
                            ShowPromptToConfirmDynamicDataExperiment.Strings strings4 = metaDataLIZ.verifyEmailPhonePopupStrings;
                            listLJIIJJI = C1697810uHb.LJIIJJI(strings4.autoConfirmPopupHeaderEmail, strings4.autoConfirmPopupBodyEmail);
                        }
                        int i3 = iArr[c1bvi2.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                str2 = "phone";
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            str2 = "email";
                        }
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str4), new Pair("show_index", String.valueOf(i)), new Pair("show_type", "pop_up_v2"), new Pair("verify_type", str2));
                        mapLJIIJ.put("enter_method", "normal");
                        C20684815ws.LJIILLIIL("verify_pii_page_show", mapLJIIJ);
                        C1397580mTM c1397580mTM = new C1397580mTM(c19eg2);
                        c1397580mTM.LJI((CharSequence) ListProtector.get(listLJIIJJI, 0));
                        String str5 = (String) ListProtector.get(listLJIIJJI, 1);
                        String string = c19eg2.getString(2131829425);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str3);
                        sbLIZ.append("\n\n");
                        sbLIZ.append(str5);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        final AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19eg2, 739);
                        String strJ4 = C786410Ut5.j4(strLIZIZ, Arrays.copyOf(new Object[]{string}, 1));
                        int iLJJJ = a0.LJJJ(strJ4, string, 0, false, 6);
                        SpannableString spannableString = new SpannableString(strJ4);
                        if (iLJJJ != -1) {
                            final int iLIZ = C960203pA.LIZ(R.attr.a1j, c19eg2);
                            C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.039I
                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) {
                                    awS556S0100000_12.invoke();
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    super.updateDrawState(textPaint);
                                    textPaint.setColor(iLIZ);
                                    C444890HcV c444890HcV = new C444890HcV();
                                    c444890HcV.LIZ(83);
                                    textPaint.setTypeface(c444890HcV.getTypeface());
                                    textPaint.setUnderlineText(false);
                                }
                            }, iLJJJ, string.length() + iLJJJ, 33);
                        }
                        c1397580mTM.LIZIZ(spannableString);
                        C985403tE.LIZ(c1397580mTM, new C1BVF(storeRegionUpperCase, metaDataLIZ, str4, c1bvi2, i, c19eg2));
                        c1397580mTM.LIZLLL(AFwS281S0000000_34.get$arr$(42));
                        c1397580mTM.LIZJ(new C1BVE(i, c1bvi2, storeRegionUpperCase, str4));
                        c1397580mTM.LJII = !C1BVD.LIZ(storeRegionUpperCase);
                        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                        TuxTextView tuxTextView = (TuxTextView) c1397510mTF.LJI(R.id.ewz);
                        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                        tuxTextView.setHighlightColor(0);
                        tuxTextView.setTuxFont(41);
                        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1j, c19eg2));
                        C1391850mK7.LIZIZ(c1397510mTF, "94");
                        c1397510mTF.LIZLLL();
                        keva.storeLong("last_show_time", System.currentTimeMillis());
                        keva.storeInt("last_show_type", c1bvi2.getValue());
                        keva.storeInt("impression_time", i);
                    }

                    {
                        this.LL = c1bvi;
                        this.LLILLJJLI = c19eg;
                        this.LLILLL = email2;
                        this.LLILZ = str;
                    }
                }, true);
                return;
            } else {
                if (function0 == null) {
                    return;
                }
                function0.invoke();
                return;
            }
        }
        if (zContains2) {
            String bindPhone = curUser.getBindPhone();
            if (bindPhone != null && !a0.LJJJIL(bindPhone)) {
                final C1BVI c1bvi2 = C1BVI.PHONE;
                final String bindPhone2 = curUser.getBindPhone();
                PopupManager.LJIJI(new C10GR(c1bvi2, c19eg, bindPhone2, str) { // from class: X.1BVC
                    public final C1BVI LL;
                    public final C19EG LLILLJJLI;
                    public final String LLILLL;
                    public final String LLILZ;
                    public final int LLILZIL = 851;

                    @Override // X.InterfaceC20660415sw
                    public final C688120Qyw i2() {
                        C19EG c19eg2 = this.LLILLJJLI;
                        return new C688120Qyw(c19eg2, c19eg2, null);
                    }

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return this.LLILZIL;
                    }

                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                        List listLJIIJJI;
                        String str2;
                        C1BVD c1bvd = C1BVD.LIZ;
                        C1BVI c1bvi22 = this.LL;
                        C19EG c19eg2 = this.LLILLJJLI;
                        String str3 = this.LLILLL;
                        String str4 = this.LLILZ;
                        AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(c20656615sK, 103);
                        c1bvd.getClass();
                        C1BVD.LIZJ = awS578S0100000_34;
                        Keva keva = C1BVD.LIZIZ;
                        int i = keva.getInt("impression_time", 0) + 1;
                        String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
                        if (!C1BVD.LIZ(storeRegionUpperCase)) {
                            C1BVD.LIZJ(c1bvi22);
                        }
                        ShowPromptToConfirmDynamicDataExperiment.MetaData metaDataLIZ = ShowPromptToConfirmDynamicDataExperiment.LIZ();
                        int[] iArr = C1BVH.LIZ;
                        int i2 = iArr[c1bvi22.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                if (C1BVD.LIZ(storeRegionUpperCase)) {
                                    ShowPromptToConfirmDynamicDataExperiment.Strings strings = metaDataLIZ.verifyEmailPhonePopupStrings;
                                    listLJIIJJI = C1697810uHb.LJIIJJI(strings.nonAutoConfirmPopupHeaderPhone, strings.nonAutoConfirmPopupBodyPhone);
                                } else {
                                    ShowPromptToConfirmDynamicDataExperiment.Strings strings2 = metaDataLIZ.verifyEmailPhonePopupStrings;
                                    listLJIIJJI = C1697810uHb.LJIIJJI(strings2.autoConfirmPopupHeaderPhone, strings2.autoConfirmPopupBodyPhone);
                                }
                            } else {
                                throw new C1954807lC();
                            }
                        } else if (C1BVD.LIZ(storeRegionUpperCase)) {
                            ShowPromptToConfirmDynamicDataExperiment.Strings strings3 = metaDataLIZ.verifyEmailPhonePopupStrings;
                            listLJIIJJI = C1697810uHb.LJIIJJI(strings3.nonAutoConfirmPopupHeaderEmail, strings3.nonAutoConfirmPopupBodyEmail);
                        } else {
                            ShowPromptToConfirmDynamicDataExperiment.Strings strings4 = metaDataLIZ.verifyEmailPhonePopupStrings;
                            listLJIIJJI = C1697810uHb.LJIIJJI(strings4.autoConfirmPopupHeaderEmail, strings4.autoConfirmPopupBodyEmail);
                        }
                        int i3 = iArr[c1bvi22.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                str2 = "phone";
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            str2 = "email";
                        }
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str4), new Pair("show_index", String.valueOf(i)), new Pair("show_type", "pop_up_v2"), new Pair("verify_type", str2));
                        mapLJIIJ.put("enter_method", "normal");
                        C20684815ws.LJIILLIIL("verify_pii_page_show", mapLJIIJ);
                        C1397580mTM c1397580mTM = new C1397580mTM(c19eg2);
                        c1397580mTM.LJI((CharSequence) ListProtector.get(listLJIIJJI, 0));
                        String str5 = (String) ListProtector.get(listLJIIJJI, 1);
                        String string = c19eg2.getString(2131829425);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str3);
                        sbLIZ.append("\n\n");
                        sbLIZ.append(str5);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        final AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19eg2, 739);
                        String strJ4 = C786410Ut5.j4(strLIZIZ, Arrays.copyOf(new Object[]{string}, 1));
                        int iLJJJ = a0.LJJJ(strJ4, string, 0, false, 6);
                        SpannableString spannableString = new SpannableString(strJ4);
                        if (iLJJJ != -1) {
                            final int iLIZ = C960203pA.LIZ(R.attr.a1j, c19eg2);
                            C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.039I
                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) {
                                    awS556S0100000_12.invoke();
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    super.updateDrawState(textPaint);
                                    textPaint.setColor(iLIZ);
                                    C444890HcV c444890HcV = new C444890HcV();
                                    c444890HcV.LIZ(83);
                                    textPaint.setTypeface(c444890HcV.getTypeface());
                                    textPaint.setUnderlineText(false);
                                }
                            }, iLJJJ, string.length() + iLJJJ, 33);
                        }
                        c1397580mTM.LIZIZ(spannableString);
                        C985403tE.LIZ(c1397580mTM, new C1BVF(storeRegionUpperCase, metaDataLIZ, str4, c1bvi22, i, c19eg2));
                        c1397580mTM.LIZLLL(AFwS281S0000000_34.get$arr$(42));
                        c1397580mTM.LIZJ(new C1BVE(i, c1bvi22, storeRegionUpperCase, str4));
                        c1397580mTM.LJII = !C1BVD.LIZ(storeRegionUpperCase);
                        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                        TuxTextView tuxTextView = (TuxTextView) c1397510mTF.LJI(R.id.ewz);
                        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                        tuxTextView.setHighlightColor(0);
                        tuxTextView.setTuxFont(41);
                        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1j, c19eg2));
                        C1391850mK7.LIZIZ(c1397510mTF, "94");
                        c1397510mTF.LIZLLL();
                        keva.storeLong("last_show_time", System.currentTimeMillis());
                        keva.storeInt("last_show_type", c1bvi22.getValue());
                        keva.storeInt("impression_time", i);
                    }

                    {
                        this.LL = c1bvi2;
                        this.LLILLJJLI = c19eg;
                        this.LLILLL = bindPhone2;
                        this.LLILZ = str;
                    }
                }, true);
                return;
            } else {
                if (function0 == null) {
                    return;
                }
                function0.invoke();
                return;
            }
        }
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
