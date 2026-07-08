package com.ss.android.ugc.aweme.ogc.news.managetopics;

import X.AbstractC1159550gHR;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C1159410gHD;
import X.C1159450gHH;
import X.C1159480gHK;
import X.C1159490gHL;
import X.C1159520gHO;
import X.C1159560gHS;
import X.C1159570gHT;
import X.C1159580gHU;
import X.C1159590gHV;
import X.C1159600gHW;
import X.C1159610gHX;
import X.C1159620gHY;
import X.C1159630gHZ;
import X.C1159640gHa;
import X.C1159650gHb;
import X.C1159680gHe;
import X.C1159710gHh;
import X.C11NZ;
import X.C11RO;
import X.C11S5;
import X.C189200o6;
import X.C1954807lC;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C452501pT;
import X.C632140Oqq;
import X.C742100T9c;
import X.EnumC1159500gHM;
import X.InterfaceC0148002o;
import X.InterfaceC420801kM;
import Y.ACallableS419S0100000_12;
import Y.ACallableS423S0100000_18;
import Y.AObserverS222S0100000_18;
import Y.AfS187S0100000_18;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.ogc.news.managetopics.ManageTopicsContentVM;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.ManageTopicsCacheConfig;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.ManageTopicsResponse;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.TopicPreference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS158S0101000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ManageTopicsContentVM extends AssemViewModel<C1159410gHD> {
    public String LLILLL;
    public boolean LLILZ;
    public String LLIZLLLIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(221));
    public final C1159680gHe LLILLJJLI = new C1159680gHe();
    public final ConcurrentHashMap<Integer, EnumC1159500gHM> LLILZIL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, EnumC1159500gHM> LLILZLL = new ConcurrentHashMap<>();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(108));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159410gHD(0);
    }

    public final C1159520gHO wQ2() {
        return (C1159520gHO) this.LL.getValue();
    }

    public final void xQ2() {
        C11NZ c11nzLJJJJZ;
        setState(AFwS256S0000000_18.get$arr$(230));
        C742100T9c.LIZ.getClass();
        InterfaceC420801kM interfaceC420801kM = C742100T9c.LIZJ;
        if (interfaceC420801kM == null || interfaceC420801kM.isDisposed()) {
            ((LiveData) C742100T9c.LIZIZ.getValue()).setValue(C1159450gHH.LIZ);
            C1159680gHe c1159680gHe = this.LLILLJJLI;
            c1159680gHe.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            ManageTopicsCacheConfig.ManageTopicsCacheModel manageTopicsCacheModel = ManageTopicsCacheConfig.LIZ;
            ManageTopicsCacheConfig.ManageTopicsCacheModel manageTopicsCacheModel2 = (ManageTopicsCacheConfig.ManageTopicsCacheModel) settingsManagerLIZLLL.LJIIIIZZ("manage_topics_cache_config", ManageTopicsCacheConfig.ManageTopicsCacheModel.class, manageTopicsCacheModel);
            if (manageTopicsCacheModel2 == null) {
                manageTopicsCacheModel2 = manageTopicsCacheModel;
            }
            if (manageTopicsCacheModel2.enable) {
                ManageTopicsResponse manageTopicsResponse = C1159680gHe.LIZJ;
                if (manageTopicsResponse == null) {
                    C1159680gHe.LIZLLL = 0L;
                } else {
                    ManageTopicsCacheConfig.ManageTopicsCacheModel manageTopicsCacheModel3 = (ManageTopicsCacheConfig.ManageTopicsCacheModel) SettingsManager.LIZLLL().LJIIIIZZ("manage_topics_cache_config", ManageTopicsCacheConfig.ManageTopicsCacheModel.class, manageTopicsCacheModel);
                    if (manageTopicsCacheModel3 != null) {
                        manageTopicsCacheModel = manageTopicsCacheModel3;
                    }
                    long j = manageTopicsCacheModel.ttlMs;
                    if (j < 0) {
                        j = 0;
                    }
                    long j2 = jCurrentTimeMillis - C1159680gHe.LIZLLL;
                    if (0 <= j2 && j2 < j) {
                        c11nzLJJJJZ = C11NZ.LJJJJZ(manageTopicsResponse);
                        disposeOnClear(c11nzLJJJJZ.LJL((C11RO) this.LLIZ.getValue()).LJJLL(new AfS187S0100000_18(this, 25), new AfS187S0100000_18(this, 26)));
                    } else {
                        C1159680gHe.LIZJ = null;
                        C1159680gHe.LIZLLL = 0L;
                    }
                }
            } else {
                C1159680gHe.LIZJ = null;
                C1159680gHe.LIZLLL = 0L;
            }
            c11nzLJJJJZ = C632140Oqq.LIZLLL(c1159680gHe.LIZIZ.LIZIZ(), "/tiktok/v1/topic-preferences/setting/get", null).LJJIJIIJIL(new C09JN() { // from class: X.0gHQ
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ManageTopicsContentRepository@1168.fetchNewsFeedStrength$2");
                    ManageTopicsResponse manageTopicsResponse2 = (ManageTopicsResponse) obj;
                    SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                    ManageTopicsCacheConfig.ManageTopicsCacheModel manageTopicsCacheModel4 = ManageTopicsCacheConfig.LIZ;
                    ManageTopicsCacheConfig.ManageTopicsCacheModel manageTopicsCacheModel5 = (ManageTopicsCacheConfig.ManageTopicsCacheModel) settingsManagerLIZLLL2.LJIIIIZZ("manage_topics_cache_config", ManageTopicsCacheConfig.ManageTopicsCacheModel.class, manageTopicsCacheModel4);
                    if (manageTopicsCacheModel5 != null) {
                        manageTopicsCacheModel4 = manageTopicsCacheModel5;
                    }
                    if (manageTopicsCacheModel4.enable) {
                        C1159680gHe.LIZJ = manageTopicsResponse2;
                        C1159680gHe.LIZLLL = System.currentTimeMillis();
                    }
                    C1C7U.LIZIZ("ManageTopicsContentRepository@1168.fetchNewsFeedStrength$2");
                }
            });
            disposeOnClear(c11nzLJJJJZ.LJL((C11RO) this.LLIZ.getValue()).LJJLL(new AfS187S0100000_18(this, 25), new AfS187S0100000_18(this, 26)));
        }
    }

    public final void yQ2(AbstractC1159550gHR abstractC1159550gHR) {
        String str;
        try {
            if (abstractC1159550gHR instanceof C1159570gHT) {
                final C1159570gHT c1159570gHT = (C1159570gHT) abstractC1159550gHR;
                disposeOnClear(C11NZ.LJJJJI(new Callable() { // from class: X.0gHP
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String string;
                        C1C7U.LIZ("ManageTopicsContentVM@4b1f.logPageShow$1");
                        Integer numLIZ = this.LL.LLILLJJLI.LIZ();
                        C1159520gHO c1159520gHOWQ2 = this.LL.wQ2();
                        Bundle bundle = c1159570gHT.LIZ;
                        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
                            string = "";
                        }
                        boolean z = numLIZ != null && numLIZ.intValue() == 0;
                        c1159520gHOWQ2.getClass();
                        Pair[] pairArr = new Pair[2];
                        pairArr[0] = new Pair("enter_from", string);
                        pairArr[1] = new Pair("is_first", z ? "1" : CardStruct.IStatusCode.DEFAULT);
                        C20684815ws.LJIILLIIL("manage_key_content_topic_page_show", C2097608Jq.LJIIIIZZ(pairArr));
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ManageTopicsContentVM@4b1f.logPageShow$1");
                        return unit;
                    }
                }).LJL(C11S5.LIZ()).LJJLJ());
                xQ2();
                C742100T9c.LIZ.getClass();
                ((MutableLiveData) C742100T9c.LIZIZ.getValue()).observe(this, new AObserverS222S0100000_18(this, 35));
            } else if (abstractC1159550gHR instanceof C1159640gHa) {
                xQ2();
            } else if (abstractC1159550gHR instanceof C1159560gHS) {
                final C1159480gHK c1159480gHK = ((C1159560gHS) abstractC1159550gHR).LIZ;
                float f = ((C1159560gHS) abstractC1159550gHR).LIZIZ;
                EnumC1159500gHM.Companion.getClass();
                final EnumC1159500gHM enumC1159500gHMLIZ = C1159490gHL.LIZ(f);
                if (enumC1159500gHMLIZ != null) {
                    disposeOnClear(C11NZ.LJJJJI(new Callable() { // from class: X.0gHJ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            EnumC1159500gHM enumC1159500gHMLIZ2;
                            C1C7U.LIZ("ManageTopicsContentVM@4b1f.handleProgressChanged$1");
                            ManageTopicsContentVM manageTopicsContentVM = this.LL;
                            manageTopicsContentVM.withState(new AwS227S0300000_18(manageTopicsContentVM, c1159480gHK, enumC1159500gHMLIZ, 77));
                            C1159480gHK c1159480gHK2 = c1159480gHK;
                            if (c1159480gHK2.LLIZ) {
                                C1159490gHL c1159490gHL = EnumC1159500gHM.Companion;
                                float f2 = c1159480gHK2.LLILZ;
                                c1159490gHL.getClass();
                                enumC1159500gHMLIZ2 = C1159490gHL.LIZ(f2);
                            } else {
                                enumC1159500gHMLIZ2 = c1159480gHK2.LLILZIL;
                            }
                            C1159520gHO c1159520gHOWQ2 = this.LL.wQ2();
                            C1159480gHK c1159480gHK3 = c1159480gHK;
                            int i = c1159480gHK3.LL;
                            String str2 = c1159480gHK3.LLILLJJLI;
                            EnumC1159500gHM enumC1159500gHM = enumC1159500gHMLIZ;
                            c1159520gHOWQ2.getClass();
                            Pair[] pairArr = new Pair[4];
                            pairArr[0] = new Pair("topic_id", String.valueOf(i));
                            pairArr[1] = new Pair("topic_name", str2);
                            if (enumC1159500gHMLIZ2 == null) {
                                enumC1159500gHMLIZ2 = EnumC1159500gHM.DEFAULT;
                            }
                            pairArr[2] = new Pair("status_before", String.valueOf(enumC1159500gHMLIZ2.getServerValue()));
                            pairArr[3] = new Pair("status_after", String.valueOf(enumC1159500gHM.getServerValue()));
                            C20684815ws.LJIILLIIL("manage_key_content_topic_slider_move", C2097608Jq.LJIIIIZZ(pairArr));
                            ManageTopicsContentVM manageTopicsContentVM2 = this.LL;
                            int i2 = c1159480gHK.LL;
                            EnumC1159500gHM enumC1159500gHM2 = enumC1159500gHMLIZ;
                            manageTopicsContentVM2.LLILZLL.put(Integer.valueOf(i2), enumC1159500gHM2);
                            float progressValue = enumC1159500gHM2.getProgressValue();
                            EnumC1159500gHM orDefault = manageTopicsContentVM2.LLILZIL.getOrDefault(Integer.valueOf(i2), null);
                            if (Intrinsics.LIZ(progressValue, orDefault != null ? Float.valueOf(orDefault.getProgressValue()) : null)) {
                                manageTopicsContentVM2.LLILZLL.remove(Integer.valueOf(i2));
                                Iterator<Map.Entry<Integer, EnumC1159500gHM>> it2 = manageTopicsContentVM2.LLILZLL.entrySet().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        manageTopicsContentVM2.LLILZLL.clear();
                                        manageTopicsContentVM2.setState(AFwS256S0000000_18.get$arr$(1027));
                                        break;
                                    }
                                    Map.Entry<Integer, EnumC1159500gHM> next = it2.next();
                                    float progressValue2 = next.getValue().getProgressValue();
                                    EnumC1159500gHM orDefault2 = manageTopicsContentVM2.LLILZIL.getOrDefault(next.getKey(), null);
                                    if (!Intrinsics.LIZ(progressValue2, orDefault2 != null ? Float.valueOf(orDefault2.getProgressValue()) : null)) {
                                        manageTopicsContentVM2.setState(AFwS256S0000000_18.get$arr$(1033));
                                        break;
                                    }
                                }
                            } else {
                                manageTopicsContentVM2.setState(AFwS256S0000000_18.get$arr$(1032));
                            }
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("ManageTopicsContentVM@4b1f.handleProgressChanged$1");
                            return unit;
                        }
                    }).LJL((C11RO) this.LLIZ.getValue()).LJJLJ());
                }
            } else if (abstractC1159550gHR instanceof C1159620gHY) {
                disposeOnClear(C11NZ.LJJJJI(new ACallableS423S0100000_18(this, 2)).LJL(C11S5.LIZ()).LJJLJ());
            } else if (abstractC1159550gHR instanceof C1159650gHb) {
                disposeOnClear(C11NZ.LJJJJI(new ACallableS419S0100000_12(this, 7)).LJJIJIIJIL(new AfS187S0100000_18(this, 88)).LJL((C11RO) this.LLIZ.getValue()).LJJLJ());
            } else if (abstractC1159550gHR instanceof C1159630gHZ) {
                wQ2().getClass();
                C20684815ws.onEventV3("manage_key_content_topic_learn_more_click");
                String str2 = this.LLILLL;
                if (str2 != null) {
                    setState(new AwS69S1000000_18(URLEncoder.encode(str2, "UTF-8"), 31));
                }
            } else if (abstractC1159550gHR instanceof C1159600gHW) {
                wQ2().getClass();
                C20684815ws.onEventV3("manage_key_content_topic_cancel_click");
            } else if (abstractC1159550gHR instanceof C1159590gHV) {
                C1159520gHO c1159520gHOWQ2 = wQ2();
                boolean z = ((C1159590gHV) abstractC1159550gHR).LIZ;
                c1159520gHOWQ2.getClass();
                if (z) {
                    str = "confirm";
                } else {
                    str = "cancel";
                }
                C20684815ws.LJIILLIIL("manage_key_content_topic_cancel_confirm_click", C2097908Jt.LIZJ(new Pair("click_position", str)));
            } else if (abstractC1159550gHR instanceof C1159580gHU) {
                C1159520gHO c1159520gHOWQ22 = wQ2();
                int i = ((C1159580gHU) abstractC1159550gHR).LIZ;
                String str3 = ((C1159580gHU) abstractC1159550gHR).LIZIZ;
                c1159520gHOWQ22.getClass();
                C20684815ws.LJIILLIIL("manage_key_content_topic_info_click", C2097608Jq.LJIIIIZZ(new Pair("topic_id", String.valueOf(i)), new Pair("topic_name", str3)));
            } else if (abstractC1159550gHR instanceof C1159610gHX) {
                this.LLILZ = true;
            } else {
                throw new C1954807lC();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final List<C1159480gHK> zQ2(List<TopicPreference> list) {
        boolean z;
        String str;
        if (list != null && !list.isEmpty()) {
            Iterator<TopicPreference> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().description;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.LLILZIL.clear();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TopicPreference topicPreference : list) {
            C1159490gHL c1159490gHL = EnumC1159500gHM.Companion;
            Integer num = topicPreference.strength;
            c1159490gHL.getClass();
            EnumC1159500gHM[] enumC1159500gHMArrValues = EnumC1159500gHM.values();
            int length = enumC1159500gHMArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    EnumC1159500gHM enumC1159500gHM = enumC1159500gHMArrValues[i];
                    int serverValue = enumC1159500gHM.getServerValue();
                    if (num != null && serverValue == num.intValue()) {
                        Integer num2 = topicPreference.topic;
                        if (num2 != null) {
                            int iIntValue = num2.intValue();
                            this.LLILZIL.put(Integer.valueOf(iIntValue), enumC1159500gHM);
                            String str3 = topicPreference.name;
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (z) {
                                str = null;
                            } else {
                                str = topicPreference.description;
                            }
                            arrayList.add(new C1159480gHK(iIntValue, str3, str, enumC1159500gHM.getProgressValue(), enumC1159500gHM, true, false));
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final void vQ2(int i, String str) {
        C1159710gHh c1159710gHh = this.LLILLJJLI.LIZ;
        c1159710gHh.getClass();
        Object objLIZ = C1159710gHh.LIZ("updateTopicsVersion", new AwS158S0101000_18(c1159710gHh, i, 9));
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(objLIZ)) {
            objLIZ = bool;
        }
        if (!Intrinsics.LJFF(objLIZ, Boolean.TRUE) && str != null) {
            setState(new AwS69S1000000_18(str, 1));
        }
    }
}
