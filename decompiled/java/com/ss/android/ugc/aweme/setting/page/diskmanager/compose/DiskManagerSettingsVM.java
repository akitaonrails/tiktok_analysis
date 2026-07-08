package com.ss.android.ugc.aweme.setting.page.diskmanager.compose;

import X.C09JN;
import X.C0PEM;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1683090ttr;
import X.C1701940uOG;
import X.C20185213yU;
import X.C20185513yX;
import X.C20684815ws;
import X.C23250099c;
import X.EnumC1335310kqv;
import X.EnumC1335420kr6;
import X.InterfaceC0148002o;
import X.InterfaceC1487280oo2;
import Y.AObjectS318S0200000_30;
import Y.AfS164S0200000_30;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.setting.model.DiskManagerPageParam;
import com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS80S1000000_30;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class DiskManagerSettingsVM extends AssemViewModel<C1683090ttr> {
    public C20185513yX LL;
    public DiskManagerPageParam LLILLJJLI;
    public C11JF LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public C11JF LLILZLL;
    public C11JF LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public final int LLJI = 2131847736;
    public final int LLJIJIL = 2131847717;
    public final int LLJILJIL = 2131847718;
    public final int LLJILJILJ = 2131847715;
    public final int LLJILLL = 2131847714;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1683090ttr(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LLILZLL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        C11JF c11jf3 = this.LLIZ;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
    }

    public final void vQ2(Context context) {
        setState(new AwS396S0200000_30(this, new AObjectS318S0200000_30(context, this, 2), 13));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", EnumC1335420kr6.CACHE.getModule());
        jSONObject.put("size", this.LLIZLLLIL);
        C20684815ws.LJIJ("clean_temp_file", jSONObject);
    }

    public final void wQ2(Context context) {
        setState(new AwS396S0200000_30(this, new AObjectS318S0200000_30(context, this, 3), 14));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", EnumC1335420kr6.RESOURCE.getModule());
        jSONObject.put("size", this.LLJ);
        C20684815ws.LJIJ("clean_resource_file", jSONObject);
    }

    public final void xQ2(final Context context) {
        String str;
        final IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
        final Bundle bundle = new Bundle();
        bundle.putBoolean("is_disk_manage_mode", true);
        DiskManagerPageParam diskManagerPageParam = this.LLILLJJLI;
        if (diskManagerPageParam != null) {
            str = diskManagerPageParam.enterMethod;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "click_goto_clean_in_disk_check_dialog")) {
            bundle.putBoolean("enable_publish_from_draft", false);
        }
        iExternalService.asyncService("CleanDraft", new IExternalService.ServiceLoadCallback() { // from class: X.14DF
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                iExternalService.draftService().openDraftActivity(context, bundle);
            }
        });
    }

    public final void yQ2(Context context) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C20185213yU(context, this, null), 2);
    }

    public final void zQ2(final Context context, final EnumC1335420kr6 enumC1335420kr6) {
        final EnumC1335310kqv enumC1335310kqv;
        C20185513yX c20185513yX = this.LL;
        if (c20185513yX != null) {
            enumC1335310kqv = c20185513yX.LIZLLL;
        } else {
            enumC1335310kqv = null;
        }
        this.LLILLL = (C11JF) C11NZ.LJJJJZ("").LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.13yY
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) throws JSONException {
                long jLJZL;
                long jLJII;
                String absolutePath;
                DiskManagerSettingsVM diskManagerSettingsVM = this.LL;
                if ((diskManagerSettingsVM.LLILZ && enumC1335420kr6 == EnumC1335420kr6.CACHE) || (diskManagerSettingsVM.LLILZIL && enumC1335420kr6 == EnumC1335420kr6.RESOURCE)) {
                    jLJZL = 0;
                } else {
                    List<InterfaceC345370DgN> listLJIIJJI = C2427009fA.LJIIJJI();
                    EnumC1335420kr6 enumC1335420kr62 = enumC1335420kr6;
                    ArrayList<InterfaceC345370DgN> arrayList = new ArrayList();
                    for (Object obj2 : (ArrayList) listLJIIJJI) {
                        if (enumC1335420kr62 == ((InterfaceC345370DgN) obj2).LIZLLL()) {
                            arrayList.add(obj2);
                        }
                    }
                    EnumC1335310kqv enumC1335310kqv2 = enumC1335310kqv;
                    EnumC1335420kr6 enumC1335420kr63 = enumC1335420kr6;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    for (InterfaceC345370DgN interfaceC345370DgN : arrayList) {
                        if (enumC1335310kqv2 != EnumC1335310kqv.EXTREME_LOW || enumC1335420kr63 == EnumC1335420kr6.DRAFT) {
                            jLJII = interfaceC345370DgN.LJII(false);
                        } else {
                            jLJII = interfaceC345370DgN.LJ(false);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("module: ");
                        sbLIZ.append(enumC1335420kr63);
                        sbLIZ.append(", name = ");
                        sbLIZ.append(interfaceC345370DgN.getClass().getSimpleName());
                        sbLIZ.append(", size = ");
                        sbLIZ.append(jLJII / 1048576.0d);
                        sbLIZ.append("M, workspace: ");
                        File fileLJIIIIZZ = interfaceC345370DgN.LJIIIIZZ();
                        if (fileLJIIIIZZ != null) {
                            absolutePath = fileLJIIIIZZ.getAbsolutePath();
                        } else {
                            absolutePath = null;
                        }
                        sbLIZ.append(absolutePath);
                        C2344809Gs.LJFF("disk-manager", C2188811AlT.LIZIZ(sbLIZ));
                        arrayList2.add(Long.valueOf(jLJII));
                    }
                    jLJZL = C13LP.LJZL(arrayList2);
                }
                int i = C1335410kr5.LIZ[enumC1335420kr6.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.LL.LLJ = jLJZL;
                    }
                } else {
                    this.LL.LLIZLLLIL = jLJZL;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("module", enumC1335420kr6);
                jSONObject.put("size", jLJZL);
                C794240VDq.LIZJ("disk_manager_module_size", jSONObject);
                DiskManagerSettingsVM diskManagerSettingsVM2 = this.LL;
                EnumC1335420kr6 enumC1335420kr64 = enumC1335420kr6;
                double d = jLJZL;
                Context context2 = context;
                diskManagerSettingsVM2.getClass();
                int i2 = C1335430kr7.LIZ[enumC1335420kr64.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        double d2 = d / 1048576;
                        if (d2 < 1.0d) {
                            return context2.getString(diskManagerSettingsVM2.LLJI, Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                        }
                        return context2.getString(diskManagerSettingsVM2.LLJI, Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
                    }
                    double d3 = d / 1073741824;
                    if (d3 > 1.0d) {
                        return context2.getString(2131847723, Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
                    }
                    return context2.getString(2131847722, Arrays.copyOf(new Object[]{Double.valueOf(d / 1048576)}, 1));
                }
                double d4 = d / 1073741824;
                if (d4 > 1.0d) {
                    return context2.getString(diskManagerSettingsVM2.LLJILJIL, Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1));
                }
                return context2.getString(diskManagerSettingsVM2.LLJIJIL, Arrays.copyOf(new Object[]{Double.valueOf(d / 1048576)}, 1));
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS164S0200000_30(enumC1335420kr6, this, 1), new C09JN() { // from class: X.13yZ
            @Override // X.C09JN
            public final void accept(Object obj) {
                String string;
                C1C7U.LIZ("DiskManagerSettingsVM@985e.showModuleSize$3");
                DiskManagerSettingsVM diskManagerSettingsVM = this.LL;
                Context context2 = context;
                EnumC1335420kr6 enumC1335420kr62 = enumC1335420kr6;
                int i = diskManagerSettingsVM.LLJI;
                int i2 = C1335430kr7.LIZ[enumC1335420kr62.ordinal()];
                if (i2 != 2) {
                    if (i2 != 3) {
                        string = context2.getString(diskManagerSettingsVM.LLJIJIL, Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                    } else {
                        string = context2.getString(i, Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                    }
                } else {
                    string = context2.getString(2131847722, Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                }
                int i3 = C1335400kr4.LIZ[enumC1335420kr6.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            this.LL.setState(new AwS80S1000000_30(string, 15));
                        }
                    } else {
                        this.LL.setState(new AwS80S1000000_30(string, 14));
                    }
                } else {
                    this.LL.setState(new AwS80S1000000_30(string, 13));
                }
                C1C7U.LIZIZ("DiskManagerSettingsVM@985e.showModuleSize$3");
            }
        });
    }
}
