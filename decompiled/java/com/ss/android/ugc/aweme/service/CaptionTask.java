package com.ss.android.ugc.aweme.service;

import X.C017P;
import X.C01GW;
import X.C0BTT;
import X.C0CCZ;
import X.C0VZ0;
import X.C13BV;
import X.C13LP;
import X.C1475700oVM;
import X.C452501pT;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC0241006d;
import X.InterfaceC1282004zy;
import X.InterfaceC1482870ogv;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.metric.event.IDeviceInfoEventParamProvider;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class CaptionTask implements C0CCZ, IDeviceInfoEventParamProvider<C017P> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(254));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(162));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(161));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(252));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(251));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(253));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(160));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CaptionTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.metric.event.IDeviceInfoEventParamProvider
    public final InterfaceC1282004zy LIZ() {
        Iterable iterableLLIIII;
        final int i = ((Boolean) this.LLILLJJLI.getValue()).booleanValue() ? -1 : ((Boolean) this.LL.getValue()).booleanValue() ? 1 : 0;
        int i2 = ((Boolean) this.LLILLJJLI.getValue()).booleanValue() ? -1 : ((Boolean) this.LLILZLL.getValue()).booleanValue() ? 1 : 0;
        final int i3 = ((Boolean) this.LLILLL.getValue()).booleanValue() ? -1 : ((Boolean) this.LLILZ.getValue()).booleanValue() ? 1 : 0;
        final int i4 = ((Boolean) this.LLILLL.getValue()).booleanValue() ? -1 : ((Boolean) this.LLILZIL.getValue()).booleanValue() ? 1 : 0;
        final int iIntValue = ((Number) this.LLIZ.getValue()).intValue();
        if (Build.VERSION.SDK_INT < 24) {
            iterableLLIIII = C13BV.INSTANCE;
        } else {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LocaleList localeList = LocaleList.getDefault();
                int size = localeList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    String languageTag = localeList.get(i5).toLanguageTag();
                    if (languageTag.length() > 0) {
                        linkedHashSet.add(languageTag);
                    }
                }
                C844470XAv.LIZ.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) C844470XAv.LIZ().getSystemService(InputMethodManager.class);
                if (inputMethodManager == null) {
                    iterableLLIIII = C13LP.LLIIII(linkedHashSet);
                } else {
                    Iterator<InputMethodInfo> it2 = inputMethodManager.getEnabledInputMethodList().iterator();
                    while (it2.hasNext()) {
                        for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it2.next(), true)) {
                            if (Intrinsics.LJFF(inputMethodSubtype.getMode(), "keyboard")) {
                                String languageTag2 = inputMethodSubtype.getLanguageTag();
                                if (languageTag2.length() == 0) {
                                    languageTag2 = inputMethodSubtype.getLocale();
                                }
                                linkedHashSet.add(languageTag2);
                            }
                        }
                    }
                    iterableLLIIII = C13LP.LLIIII(linkedHashSet);
                }
            } catch (NoClassDefFoundError e) {
                TryCatchGuardChecker.doCheck(e);
                iterableLLIIII = C13BV.INSTANCE;
            }
        }
        final String strLJJLIIIJ = C13LP.LJJLIIIJ(iterableLLIIII, null, null, null, 0, null, null, 63);
        final Integer numValueOf = Integer.valueOf(i2);
        return new InterfaceC0241006d(strLJJLIIIJ, i, numValueOf, i4, i3, iIntValue) { // from class: X.017P
            public final int LL = 1;
            public final int LLILLJJLI;
            public final Integer LLILLL;
            public final int LLILZ;
            public final int LLILZIL;
            public final int LLILZLL;
            public final String LLIZ;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C017P)) {
                    return false;
                }
                C017P c017p = (C017P) obj;
                return this.LL == c017p.LL && this.LLILLJJLI == c017p.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c017p.LLILLL) && this.LLILZ == c017p.LLILZ && this.LLILZIL == c017p.LLILZIL && this.LLILZLL == c017p.LLILZLL && Intrinsics.LJFF(this.LLIZ, c017p.LLIZ);
            }

            public final int hashCode() {
                int i6 = ((this.LL * 31) + this.LLILLJJLI) * 31;
                Integer num = this.LLILLL;
                return ((((((((i6 + (num == null ? 0 : num.hashCode())) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + this.LLIZ.hashCode();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("cla_is_combine", Integer.valueOf(this.LL));
                linkedHashMap.put("cla_auto_translation_toggle_status", Integer.valueOf(this.LLILLJJLI));
                linkedHashMap.put("cla_sticker_translation_toggle_status", this.LLILLL);
                linkedHashMap.put("cla_foreign_caption_toggle_status", Integer.valueOf(this.LLILZ));
                linkedHashMap.put("cla_original_caption_toggle_status", Integer.valueOf(this.LLILZIL));
                linkedHashMap.put("font_size", Integer.valueOf(this.LLILZLL));
                linkedHashMap.put("cla_keyboard_lang_list", this.LLIZ);
                return linkedHashMap;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ColdBootCLAUserSettingParams(isCombine=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", isAutoTranslOn=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", isStickerTranslOn=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", isForeignCaptionOn=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(", isNativeCaptionOn=");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(", fontSize=");
                sbLIZ.append(this.LLILZLL);
                sbLIZ.append(", keyboardLangList=");
                sbLIZ.append(this.LLIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> filteredParams() {
                return keyParams();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                return C2097608Jq.LJ();
            }

            {
                this.LLILLJJLI = i;
                this.LLILLL = numValueOf;
                this.LLILZ = i4;
                this.LLILZIL = i3;
                this.LLILZLL = iIntValue;
                this.LLIZ = strLJJLIIIJ;
            }
        };
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean zBooleanValue;
        if (!C0BTT.LIZ()) {
            boolean zLJI = MethodIDManager.LJI(137974);
            if (!((Boolean) this.LL.getValue()).booleanValue()) {
                zBooleanValue = ((Boolean) this.LLILZ.getValue()).booleanValue();
            } else {
                zBooleanValue = ((Boolean) this.LLILZIL.getValue()).booleanValue();
            }
            InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1475700oVM.LIZ();
            interfaceC1482870ogvLIZ.LJJJLIIL(((Boolean) this.LL.getValue()).booleanValue());
            interfaceC1482870ogvLIZ.LJIIZILJ(zBooleanValue);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }
}
