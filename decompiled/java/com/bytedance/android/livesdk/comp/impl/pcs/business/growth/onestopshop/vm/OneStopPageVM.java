package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm;

import X.AbstractC19994813Le;
import X.C013C;
import X.C09JN;
import X.C09YA;
import X.C0JOM;
import X.C0KBP;
import X.C0UO0;
import X.C1782230wTl;
import X.C1819490xRr;
import X.C1820790xTx;
import X.C1820830xU1;
import X.C1821040xUM;
import X.C1821080xUQ;
import X.C1821130xUV;
import X.C1826730xdX;
import X.C1954807lC;
import X.C500260Jjc;
import X.EnumC1782220wTk;
import X.InterfaceC0148002o;
import X.InterfaceC1821220xUe;
import X.InterfaceC517590KRp;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.LivePcsOneStopShopCacheDurationSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.OneStopShopGoLiveSchemaSetting;
import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.setting.FlashListItemViewComponentConfig;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.api.sub.SMBSetupInfoResponse;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: loaded from: classes28.dex */
public final class OneStopPageVM extends AssemViewModel<C1820790xTx> implements IPcsOneStopShopVmAbility {
    public int LLILLJJLI;
    public boolean LLILZ;
    public final C09YA LL = new C09YA(this, new C1821130xUV());
    public final int LLILLL = AbstractC19994813Le.Default.nextInt();
    public C1821080xUQ LLILZIL = new C1821080xUQ("", false, 0, true, false, false, false);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1820790xTx(0);
    }

    public final void wQ2() {
        setState(new C1820830xU1());
        C1821080xUQ c1821080xUQ = this.LLILZIL;
        if ((c1821080xUQ.LJ && c1821080xUQ.LJI) || c1821080xUQ.LJFF) {
            return;
        }
        setState(new C1821040xUM(UriProtector.parse(OneStopShopGoLiveSchemaSetting.INSTANCE.getValue())));
    }

    public final void j02(String str) {
        setState(new C1821040xUM(UriProtector.parse(str).buildUpon().appendQueryParameter("show_entrance", "one_stop_shop").appendQueryParameter("is_from_live_take_page", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(this.LLILZIL.LJFF)) ? 1 : 0)).build()));
    }

    public final void vQ2(boolean z) {
        setState(new C1819490xRr());
        final C013C c013c = new C013C();
        disposeOnClear(((InterfaceC1821220xUe) this.LL.getValue().getOperator()).r0(z).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0xUF
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v1, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r13v2 */
            /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r30v1, types: [java.util.List] */
            @Override // X.C09JN
            public final void accept(Object obj) {
                int i;
                boolean z2;
                int i2;
                boolean z3;
                String str;
                Boolean boolValueOf;
                k kVarLJIJJLI;
                SMBSetupInfoResponse.ResponseData.SetupData.OperationsTaskReward operationsTaskReward;
                ImageModel imageModel;
                List urls;
                SMBSetupInfoResponse.ResponseData.SetupData.OperationsTaskReward operationsTaskReward2;
                EnumC1778960wOU enumC1778960wOU;
                String str2;
                String str3;
                ?? arrayList;
                C1820460xTQ c1820460xTQ;
                boolean z4;
                SMBSetupInfoResponse.ResponseData.SetupData.PlaybookSection playbookSection;
                InterfaceC1891350zJl next;
                List<InterfaceC1891350zJl> list;
                InterfaceC1891350zJl next2;
                List<InterfaceC1891350zJl> list2;
                ImageModel imageModel2;
                InterfaceC1891350zJl interfaceC1891350zJl;
                List<InterfaceC1891350zJl> list3;
                InterfaceC1891350zJl next3;
                String str4;
                List<SMBSetupInfoResponse.ResponseData.SetupData.CreatorTaskInfo.Subtask> list4;
                Object c1820420xTM;
                ImageModel imageModel3;
                ImageModel imageModel4;
                C1C7U.LIZ("OneStopPageVM@272c.fetchData$2");
                BaseResponse baseResponse = (BaseResponse) obj;
                OneStopPageVM oneStopPageVM = this.LL;
                SMBSetupInfoResponse.ResponseData responseData = (SMBSetupInfoResponse.ResponseData) baseResponse.data;
                oneStopPageVM.getClass();
                DataChannelGlobal.LLILZ.JQ2(C168L.class, new C758750TpZ(responseData.isTargetCreator, responseData.setupState, responseData.smbHasLeadsDmEnabled));
                OneStopPageVM oneStopPageVM2 = this.LL;
                SMBSetupInfoResponse.ResponseData responseData2 = (SMBSetupInfoResponse.ResponseData) baseResponse.data;
                oneStopPageVM2.getClass();
                SMBSetupInfoResponse.ResponseData.SetupData setupData = responseData2.setupData;
                if (setupData != null) {
                    i = setupData.scene;
                } else {
                    i = 2;
                }
                int i3 = responseData2.industryType;
                if (i >= 1 && setupData != null && setupData.secondaryPageSections != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ArrayList arrayList2 = new ArrayList();
                SMBSetupInfoResponse.ResponseData.SetupData setupData2 = responseData2.setupData;
                if (setupData2 != null) {
                    i2 = setupData2.scene;
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList2.add(new C1157100gDU(z3, oneStopPageVM2.LLILZ));
                SMBSetupInfoResponse.ResponseData.SetupData setupData3 = responseData2.setupData;
                String str5 = "";
                if (setupData3 != null) {
                    SMBSetupInfoResponse.ResponseData.SetupData.OperationsTaskReward operationsTaskReward3 = setupData3.opTaskReward;
                    if (operationsTaskReward3 != null && (imageModel4 = operationsTaskReward3.trafficCardIcon) != null) {
                        imageModel4.avgColor = "#FFFFFF";
                    }
                    SMBSetupInfoResponse.ResponseData.SetupData.CreatorTaskInfo creatorTaskInfo = setupData3.taskInfo;
                    if (i2 == 0) {
                        enumC1778960wOU = EnumC1778960wOU.ADD_DM;
                    } else {
                        enumC1778960wOU = EnumC1778960wOU.GO_LIVE_TASKS;
                    }
                    C1820590xTd c1820590xTd = new C1820590xTd(setupData3.optInEligibility, setupData3.qualificationInfo);
                    if (creatorTaskInfo == null || (str2 = creatorTaskInfo.header) == null) {
                        str2 = "";
                    }
                    if (operationsTaskReward3 == null || (str3 = operationsTaskReward3.challengeStatus) == null) {
                        str3 = "";
                    }
                    if (creatorTaskInfo != null && (list4 = creatorTaskInfo.subtasks) != null) {
                        arrayList = new ArrayList();
                        for (SMBSetupInfoResponse.ResponseData.SetupData.CreatorTaskInfo.Subtask subtask : list4) {
                            C1820520xTW c1820520xTW = new C1820520xTW(subtask.challengeType, subtask.taskProgressCurrent, subtask.taskProgressMax, subtask.challengeId);
                            int i4 = subtask.taskType;
                            if (i4 != 0) {
                                if (i4 == 1) {
                                    String str6 = subtask.taskDescription;
                                    if (oneStopPageVM2.LLILZ) {
                                        imageModel3 = subtask.taskIconDark;
                                    } else {
                                        imageModel3 = subtask.taskIcon;
                                    }
                                    c1820420xTM = new C1820430xTN(imageModel3, str6, c1820520xTW);
                                }
                            } else {
                                c1820420xTM = new C1820420xTM(subtask.taskDescription, subtask.taskProgress, c1820520xTW);
                            }
                            arrayList.add(c1820420xTM);
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    if (operationsTaskReward3 != null && (str4 = operationsTaskReward3.trafficCardDescription) != null && str4.length() > 0) {
                        c1820460xTQ = new C1820460xTQ(operationsTaskReward3.trafficCardIcon, operationsTaskReward3.trafficCardIconText, operationsTaskReward3.trafficCardDescription, operationsTaskReward3.trafficCardLinkText, operationsTaskReward3.trafficCardLinkType, operationsTaskReward3.campaignPageLink);
                    } else {
                        c1820460xTQ = null;
                    }
                    C1820390xTJ c1820390xTJ = new C1820390xTJ(str2, str3, enumC1778960wOU, c1820590xTd, arrayList, c1820460xTQ);
                    if (LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled()) {
                        C1820630xTh c1820630xThLIZ = oneStopPageVM2.getState().LL.LIZ();
                        if (c1820630xThLIZ != null && (list3 = c1820630xThLIZ.LIZLLL) != null) {
                            Iterator<InterfaceC1891350zJl> it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next3 = it2.next();
                                    if (next3 instanceof C1820390xTJ) {
                                        break;
                                    }
                                } else {
                                    next3 = null;
                                    break;
                                }
                            }
                            interfaceC1891350zJl = next3;
                        } else {
                            interfaceC1891350zJl = null;
                        }
                        C1820390xTJ c1820390xTJ2 = (C1820390xTJ) interfaceC1891350zJl;
                        if (c1820390xTJ2 != null) {
                            c1820390xTJ2.LL = c1820390xTJ.LL;
                            c1820390xTJ2.LLILLJJLI = c1820390xTJ.LLILLJJLI;
                            c1820390xTJ2.LLILLL = c1820390xTJ.LLILLL;
                            c1820390xTJ2.LLILZ = c1820390xTJ.LLILZ;
                            c1820390xTJ2.LLILZIL = c1820390xTJ.LLILZIL;
                            c1820390xTJ2.LLILZLL = c1820390xTJ.LLILZLL;
                            c1820390xTJ = c1820390xTJ2;
                        }
                        arrayList2.add(c1820390xTJ);
                    } else {
                        arrayList2.add(c1820390xTJ);
                    }
                    if (i2 >= 1) {
                        for (SMBSetupInfoResponse.ResponseData.SetupData.SecondaryPageSection secondaryPageSection : setupData3.secondaryPageSections) {
                            if (!secondaryPageSection.pages.isEmpty()) {
                                String str7 = secondaryPageSection.sectionHeader;
                                List<SMBSetupInfoResponse.ResponseData.SetupData.SecondaryPageSection.SecondaryPage> list5 = secondaryPageSection.pages;
                                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                                int i5 = 0;
                                for (SMBSetupInfoResponse.ResponseData.SetupData.SecondaryPageSection.SecondaryPage secondaryPage : list5) {
                                    int i6 = i5 + 1;
                                    if (i5 >= 0) {
                                        SMBSetupInfoResponse.ResponseData.SetupData.SecondaryPageSection.SecondaryPage secondaryPage2 = secondaryPage;
                                        if (oneStopPageVM2.LLILZ) {
                                            imageModel2 = secondaryPage2.pageIconDarkLink;
                                        } else {
                                            imageModel2 = secondaryPage2.pageIconLink;
                                        }
                                        arrayList3.add(new C1820960xUE(imageModel2, secondaryPage2.pageHeader, secondaryPage2.pageDescription, new C1820980xUG(oneStopPageVM2, secondaryPage2), secondaryPage2.pageFeatureName, secondaryPage2.pageModuleName));
                                        i5 = i6;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                                C1820920xUA c1820920xUA = new C1820920xUA(str7, arrayList3);
                                if (LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled()) {
                                    C1820630xTh c1820630xThLIZ2 = oneStopPageVM2.getState().LL.LIZ();
                                    if (c1820630xThLIZ2 != null && (list2 = c1820630xThLIZ2.LIZLLL) != null) {
                                        Iterator<InterfaceC1891350zJl> it3 = list2.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                next2 = it3.next();
                                                InterfaceC1891350zJl interfaceC1891350zJl2 = next2;
                                                if ((interfaceC1891350zJl2 instanceof C1820920xUA) && Intrinsics.LJFF(((C1820920xUA) interfaceC1891350zJl2).LL, c1820920xUA.LL)) {
                                                    break;
                                                }
                                            } else {
                                                next2 = null;
                                                break;
                                            }
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    boolean zLJFF = Intrinsics.LJFF(next2, c1820920xUA);
                                    InterfaceC1891350zJl interfaceC1891350zJl3 = c1820920xUA;
                                    if (zLJFF) {
                                        interfaceC1891350zJl3 = next2;
                                    }
                                    arrayList2.add(interfaceC1891350zJl3);
                                } else {
                                    arrayList2.add(c1820920xUA);
                                }
                            }
                        }
                    }
                    C1821080xUQ c1821080xUQ = oneStopPageVM2.LLILZIL;
                    if ((!c1821080xUQ.LJI || !c1821080xUQ.LJ) && !c1821080xUQ.LJFF) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (i2 >= 1 && z4 && (playbookSection = setupData3.playbookSection) != null) {
                        String str8 = playbookSection.sectionHeader;
                        List<Playbook> list6 = playbookSection.playbookList;
                        ArrayList arrayList4 = new ArrayList();
                        for (Playbook playbook : list6) {
                            PlaybookContent playbookContent = playbook.content;
                            if (playbookContent != null) {
                                arrayList4.add(new C1821010xUJ(playbookContent.coverUrl, new C1821090xUR(oneStopPageVM2, playbook), playbookContent.title, playbookContent.description));
                            }
                        }
                        InterfaceC1891350zJl c1820930xUB = new C1820930xUB(str8, arrayList4);
                        if (LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled()) {
                            C1820630xTh c1820630xThLIZ3 = oneStopPageVM2.getState().LL.LIZ();
                            if (c1820630xThLIZ3 != null && (list = c1820630xThLIZ3.LIZLLL) != null) {
                                Iterator<InterfaceC1891350zJl> it4 = list.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next = it4.next();
                                        if (next instanceof C1820930xUB) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                            } else {
                                next = null;
                            }
                            if (Intrinsics.LJFF(next, c1820930xUB)) {
                                c1820930xUB = next;
                            }
                            arrayList2.add(c1820930xUB);
                        } else {
                            arrayList2.add(c1820930xUB);
                        }
                    }
                    arrayList2.add(new C1820900xU8());
                }
                C1821150xUX c1821150xUX = new C1821150xUX();
                for (FlashListItemViewComponentConfig flashListItemViewComponentConfig : C13LP.LJLLLL(new C512401z8(81), C202700qH.LIZ("list_view_one_stop_shop").LIZ())) {
                    Pair pairLJI = C500260Jjc.LJI(arrayList2, new AwS586S0100000_7(flashListItemViewComponentConfig, 598));
                    Object first = pairLJI.getFirst();
                    int iIntValue = ((Number) pairLJI.getSecond()).intValue();
                    int i7 = flashListItemViewComponentConfig.op;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3 && first != null && iIntValue >= 0) {
                                ListProtector.remove(arrayList2, iIntValue);
                            }
                        } else {
                            C0KJF c0kjf = new C0KJF(flashListItemViewComponentConfig.url, flashListItemViewComponentConfig.LIZ, c1821150xUX.LIZ);
                            if (first != null && iIntValue >= 0) {
                                ListProtector.add(arrayList2, iIntValue, c0kjf);
                                arrayList2.remove(first);
                            } else {
                                int i8 = flashListItemViewComponentConfig.fallbackOrder;
                                if (i8 != -2) {
                                    if (i8 == 0) {
                                        ListProtector.add(arrayList2, 0, c0kjf);
                                    }
                                } else {
                                    arrayList2.add(c0kjf);
                                }
                            }
                        }
                    } else {
                        C0KJF c0kjf2 = new C0KJF(flashListItemViewComponentConfig.url, flashListItemViewComponentConfig.LIZ, c1821150xUX.LIZ);
                        if (first != null && iIntValue >= 0) {
                            ListProtector.add(arrayList2, iIntValue, c0kjf2);
                        } else {
                            int i9 = flashListItemViewComponentConfig.fallbackOrder;
                            if (i9 != -2) {
                                if (i9 == 0) {
                                    ListProtector.add(arrayList2, 0, c0kjf2);
                                }
                            } else {
                                arrayList2.add(c0kjf2);
                            }
                        }
                    }
                }
                if (setupData == null || (operationsTaskReward2 = setupData.opTaskReward) == null || (str = operationsTaskReward2.campaignPageLink) == null) {
                    str = "";
                }
                boolean zLJJIIZI = a0.LJJIIZI(str, EnumC046400Es.SMB_CHALLENGE_GUIDE.getValue(), false);
                boolean zLJJIIZI2 = a0.LJJIIZI(str, EnumC046400Es.SMB_CHALLENGE_HOME.getValue(), false);
                if (setupData != null && (operationsTaskReward = setupData.opTaskReward) != null && (imageModel = operationsTaskReward.trafficCardIcon) != null && (urls = imageModel.getUrls()) != null) {
                    boolValueOf = Boolean.valueOf(!urls.isEmpty());
                } else {
                    boolValueOf = null;
                }
                boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
                if (zLJJIIZI) {
                    str5 = "learn_more";
                } else if (zLJJIIZI2) {
                    if (zLJJJI) {
                        str5 = "go_claim";
                    } else {
                        str5 = "go_live_task";
                    }
                }
                C1820630xTh c1820630xTh = new C1820630xTh(i, i3, str5, z2, arrayList2);
                C1820630xTh c1820630xThLIZ4 = oneStopPageVM2.getState().LL.LIZ();
                if (c1820630xThLIZ4 != null && c1820630xThLIZ4.LIZ == i && i == 0) {
                    oneStopPageVM2.setState(new C1821050xUN(responseData2));
                } else {
                    oneStopPageVM2.setState(new C1821020xUK(c1820630xTh, responseData2));
                }
                if (!c013c.element || !LivePcsOneStopShopCacheDurationSetting.INSTANCE.isPrefetchEnabled()) {
                    OneStopPageVM oneStopPageVM3 = this.LL;
                    SMBSetupInfoResponse.ResponseData responseData3 = (SMBSetupInfoResponse.ResponseData) baseResponse.data;
                    oneStopPageVM3.getClass();
                    oneStopPageVM3.xQ2(EnumC1782220wTk.MAIN_PAGE, null);
                    String str9 = oneStopPageVM3.LLILZIL.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (oneStopPageVM3.LLILZIL.LIZJ > 0) {
                        linkedHashMap.put("show_latency_from_feed_card_click", String.valueOf(System.currentTimeMillis() - oneStopPageVM3.LLILZIL.LIZJ));
                    }
                    linkedHashMap.put("using_cache", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(responseData3.LIZ)) ? 1 : 0));
                    C1820640xTi.LIZJ(c1820630xTh, "show", str9, linkedHashMap);
                    c013c.element = true;
                }
                OneStopPageVM oneStopPageVM4 = this.LL;
                if (oneStopPageVM4.LLILZIL.LIZIZ) {
                    oneStopPageVM4.withState(new C1821110xUT(oneStopPageVM4));
                }
                OneStopPageVM oneStopPageVM5 = this.LL;
                T t = baseResponse.data;
                oneStopPageVM5.getClass();
                LivePcsOneStopShopCacheDurationSetting livePcsOneStopShopCacheDurationSetting = LivePcsOneStopShopCacheDurationSetting.INSTANCE;
                if (livePcsOneStopShopCacheDurationSetting.isPrefetchEnabled()) {
                    try {
                        Gson gson = C19748512Ol.LIZJ;
                        if (gson != null && (kVarLJIJJLI = gson.LJIJJLI(t)) != null) {
                            C1106750euH.LIZ.LJIILLIIL(new C1100630ekP(new C0KA1(livePcsOneStopShopCacheDurationSetting.getValue())), kVarLJIJJLI.LJIILIIL(), "/webcast/sub/upsell/one_stop_shop_setup/info/", C2097908Jt.LIZJ(new Pair("need_setup_data", Boolean.TRUE)));
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                C1C7U.LIZIZ("OneStopPageVM@272c.fetchData$2");
            }
        }, new C09JN() { // from class: X.0wYb
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("OneStopPageVM@272c.fetchData$3");
                Throwable th = (Throwable) obj;
                this.LL.setState(new C1819470xRp(th));
                this.LL.xQ2(EnumC1782220wTk.MAIN_PAGE, th);
                C501540Jlg.LIZJ(C497740JfY.LJII(), th);
                C1C7U.LIZIZ("OneStopPageVM@272c.fetchData$3");
            }
        }));
    }

    public final void xQ2(EnumC1782220wTk enumC1782220wTk, Throwable th) {
        int i;
        int i2 = C1782230wTl.LIZ[enumC1782220wTk.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = this.LLILLL;
            } else {
                throw new C1954807lC();
            }
        } else {
            i = this.LLILLJJLI;
        }
        if (th == null) {
            InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
            if (interfaceC517590KRpLIZJ != null) {
                interfaceC517590KRpLIZJ.LJ(new C0KBP(i));
                return;
            }
            return;
        }
        InterfaceC517590KRp interfaceC517590KRpLIZJ2 = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ2 != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC517590KRpLIZJ2.LJIIIZ(new C0JOM(i, message, th));
        }
    }

    public final void yQ2(int i, int i2) {
        ((InterfaceC1821220xUe) this.LL.getValue().getOperator()).LJJIJL(i, i2).LJIILIIL(new C0UO0()).LJJLJ();
    }
}
