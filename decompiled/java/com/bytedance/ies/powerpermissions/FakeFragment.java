package com.bytedance.ies.powerpermissions;

import X.C0HWO;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1701330uNH;
import X.C19514011Wg;
import X.C19514611Wm;
import X.C19741112Lp;
import X.C19741612Lu;
import X.C19EG;
import X.C19EH;
import X.C786410Ut5;
import X.EnumC442280HVy;
import X.InterfaceC19514411Wk;
import X.InterfaceC19515111Wr;
import X.InterfaceC19741212Lq;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class FakeFragment extends Fragment implements InterfaceC19514411Wk {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9OCo7LD0jHELIOSLTchIDwgISoiOmEVKS4pDz0yLygpJzs=";
    public int LL;
    public InterfaceC19515111Wr LLILLJJLI;
    public final HashSet<String> LLILLL = new HashSet<>();
    public final HashSet<String> LLILZ = new HashSet<>();
    public final HashSet<String> LLILZIL = new HashSet<>();
    public C19514611Wm LLILZLL;

    public final void NR() {
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        C19514011Wg.LIZIZ(12);
        C19EG activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LJIIZILJ(this);
            c19ehLJIIJ.LJIIJ();
        }
        if (activity instanceof FakeActivity) {
            FakeActivity fakeActivity = (FakeActivity) activity;
            if (fakeActivity.isFinishing()) {
                return;
            }
            fakeActivity.finish();
        }
    }

    @Override // X.InterfaceC19514411Wk
    public final void nA() {
        NR();
    }

    @Override // X.InterfaceC19514411Wk
    public final void o() {
        NR();
    }

    public final void OR(HashSet<String> hashSet) throws Throwable {
        Fragment fragment;
        C19514011Wg.LIZIZ(4);
        if (hashSet.isEmpty()) {
            C19514011Wg.LIZIZ(5);
            MR(null, null);
            return;
        }
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        int iIntValue = this.LL;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5SngeebyHfsFH+mQi0d2NpGCpXokQQ6iud0=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {strArr, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "([Ljava/lang/String;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2945, "com/bytedance/ies/powerpermissions/FakeFragment", "requestPermissions", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2945, "com/bytedance/ies/powerpermissions/FakeFragment", "requestPermissions", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            } else {
                fragment = this;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            fragment = this;
        }
        fragment.requestPermissions(strArr, iIntValue);
        c0wst.LIZ(2945, "com/bytedance/ies/powerpermissions/FakeFragment", "requestPermissions", null, objArr, fragment, c0wzw, true);
    }

    @Override // X.InterfaceC19514411Wk
    public final void Um(List<String> list) throws Throwable {
        Context context;
        Intent intentLIZJ;
        Fragment fragment;
        this.LLILLL.clear();
        this.LLILZIL.clear();
        this.LLILZ.clear();
        this.LL++;
        for (String str : list) {
            Context context2 = getContext();
            if (context2 != null) {
                C19741112Lp.LIZ.getClass();
                if (C19741112Lp.LIZLLL(context2, str)) {
                    this.LLILLL.add(str);
                } else if (!Intrinsics.LJFF("android.permission.SYSTEM_ALERT_WINDOW", str) && !Intrinsics.LJFF("android.permission.ACCESS_NOTIFICATION_POLICY", str) && !Intrinsics.LJFF("android.permission.MANAGE_EXTERNAL_STORAGE", str)) {
                    this.LLILZ.add(str);
                } else {
                    this.LLILZIL.add(str);
                }
            }
        }
        if (getActivity() != null) {
            HashSet<String> hashSet = this.LLILZIL;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            Iterator<String> it3 = hashSet.iterator();
            boolean z = false;
            while (it3.hasNext()) {
                InterfaceC19741212Lq interfaceC19741212Lq = C19741612Lu.LIZ.get(it3.next());
                if (interfaceC19741212Lq != null && (context = getContext()) != null && (intentLIZJ = interfaceC19741212Lq.LIZJ(context)) != null) {
                    int iIntValue = this.LL;
                    C1701330uNH.LIZ(intentLIZJ, this);
                    C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5SngeebyHfsFH+mQi0d2NpGCpXokQQ6iud0=", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = {intentLIZJ, Integer.valueOf(iIntValue)};
                    C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/bytedance/ies/powerpermissions/FakeFragment", "startActivityForResult", this, objArr, "void", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        c0wst.LIZ(11087, "com/bytedance/ies/powerpermissions/FakeFragment", "startActivityForResult", null, objArr, this, c0wzw, false);
                    } else {
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        if (objArr2 != null) {
                            Object obj = objArr2[0];
                            if (obj != null) {
                                fragment = (Fragment) obj;
                            } else {
                                fragment = this;
                            }
                            Object obj2 = objArr2[1];
                            if (obj2 != null) {
                                intentLIZJ = (Intent) obj2;
                            }
                            Object obj3 = objArr2[2];
                            if (obj3 != null) {
                                iIntValue = ((Integer) obj3).intValue();
                            }
                        } else {
                            fragment = this;
                        }
                        fragment.startActivityForResult(intentLIZJ, iIntValue);
                        c0wst.LIZ(11087, "com/bytedance/ies/powerpermissions/FakeFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
                    }
                    C19514011Wg.LIZIZ(3);
                    z = true;
                }
            }
            if (!z) {
                OR(this.LLILZ);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19514011Wg.LIZIZ(15);
        C19514611Wm c19514611Wm = this.LLILZLL;
        if (c19514611Wm != null) {
            c19514611Wm.LIZJ();
        } else {
            NR();
        }
    }

    public final void MR(int[] iArr, String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (iArr != null && iArr[i] == -1) {
                    if (Intrinsics.LJFF(str, "android.permission.READ_CONTACTS")) {
                        Keva.getRepo("FriendsSharePreferences").storeBoolean("read_contact_denied", true);
                    } else {
                        Keva.getRepo("permission_store").storeBoolean(str, true);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        C19EG activity = getActivity();
        if (activity != null) {
            if (true ^ this.LLILLL.isEmpty()) {
                Iterator<String> it2 = this.LLILLL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C0HWO(it2.next(), EnumC442280HVy.GRANTED));
                }
            }
            if (strArr != null && iArr != null) {
                int length2 = strArr.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    if (iArr[i2] == 0) {
                        arrayList.add(new C0HWO(strArr[i2], EnumC442280HVy.GRANTED));
                    } else {
                        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                        String str2 = strArr[i2];
                        c19741112Lp.getClass();
                        if (C19741112Lp.LJI(activity, str2, false)) {
                            arrayList.add(new C0HWO(strArr[i2], EnumC442280HVy.DENIED_PERMANENT));
                        } else {
                            arrayList.add(new C0HWO(strArr[i2], EnumC442280HVy.THIS_OPERATION_NOT_PERMITTED));
                        }
                    }
                }
            }
            for (String str3 : this.LLILZIL) {
                C19741112Lp.LIZ.getClass();
                if (C19741112Lp.LIZLLL(activity, str3)) {
                    arrayList.add(new C0HWO(str3, EnumC442280HVy.GRANTED));
                } else if (C19741112Lp.LJI(activity, str3, false)) {
                    arrayList.add(new C0HWO(str3, EnumC442280HVy.DENIED_PERMANENT));
                } else {
                    arrayList.add(new C0HWO(str3, EnumC442280HVy.THIS_OPERATION_NOT_PERMITTED));
                }
            }
            C19514011Wg.LIZIZ(11);
            InterfaceC19515111Wr interfaceC19515111Wr = this.LLILLJJLI;
            if (interfaceC19515111Wr != null) {
                C0HWO[] c0hwoArr = (C0HWO[]) arrayList.toArray(new C0HWO[0]);
                interfaceC19515111Wr.LIZ((C0HWO[]) Arrays.copyOf(c0hwoArr, c0hwoArr.length));
            }
            C19514611Wm c19514611Wm = this.LLILZLL;
            if (c19514611Wm != null) {
                c19514611Wm.LIZJ();
            } else {
                NR();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.LL) {
            C786410Ut5.LJLIIL(300L, new BPEAHandler(), new ARunnableS129S0100000_29(this, 14));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C19514011Wg.LIZIZ(6);
        int i2 = this.LL;
        if (i == i2 && strArr.length != 0 && iArr.length != 0) {
            C19514011Wg.LIZIZ(7);
            MR(iArr, strArr);
        } else if (i == i2) {
            C19514011Wg.LIZIZ(8);
        } else if (strArr.length == 0) {
            C19514011Wg.LIZIZ(10);
        } else {
            C19514011Wg.LIZIZ(9);
        }
    }
}
