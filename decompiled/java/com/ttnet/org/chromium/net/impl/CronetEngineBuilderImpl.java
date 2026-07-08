package com.ttnet.org.chromium.net.impl;

import X.AbstractC1497090p3r;
import X.AbstractC1497170p3z;
import X.AbstractC1497630p4j;
import X.AbstractC1498350p5t;
import X.C0VSJ;
import X.C1497180p40;
import X.C1498440p62;
import X.C1498460p64;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1498400p5y;
import X.InterfaceC1498450p63;
import android.content.Context;
import android.util.Pair;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTSlaSamplingSetting;
import com.ttnet.org.chromium.net.TTThreadConfigInfoProvider$ThreadConfigInfo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.chromium.CronetAppInfoProvider;
import org.chromium.CronetAppMonitorProvider;
import org.chromium.CronetEventListener;

/* JADX INFO: loaded from: classes24.dex */
public abstract class CronetEngineBuilderImpl extends AbstractC1497090p3r {
    public final Context LIZ;
    public boolean LIZLLL;
    public String LJ;
    public String LJFF;
    public EnumC1498400p5y LJIIIZ;
    public long LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public TTAppInfoProvider LJIILL;
    public AbstractC1497630p4j LJIILLIIL;
    public AbstractC1498350p5t LJIIZILJ;
    public String LJIJ;
    public ArrayList<byte[]> LJIJI;
    public Map<String[], Pair<byte[], byte[]>> LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public long LJJII;
    public String LJJIII;
    public boolean LJJIIJ;
    public int LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public String LJJIJ;
    public TTAppInfoProvider.AppInfo LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public long LJJIJLIJ;
    public ArrayList<TTThreadConfigInfoProvider$ThreadConfigInfo> LJJIL;
    public InterfaceC1498450p63 LJJIZ;
    public TTSamplingSettingProvider$TTSlaSamplingSetting LJJJ;
    public long LJJJI;
    public boolean LJJJIL;
    public String LJJJJ;
    public final List<C1498440p62> LIZIZ = new LinkedList();
    public final List<C1498460p64> LIZJ = new LinkedList();
    public int LJIIL = 20;
    public boolean LJI = true;
    public boolean LJII = true;
    public boolean LJIIIIZZ = false;

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LIZJ() {
        this.LJJI = true;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LIZLLL() {
        this.LJIIIIZZ = true;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJII() {
        this.LJIIJJI = true;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIIIZ() {
        this.LJJIFFI = true;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIIJ() {
        this.LJIILJJIL = true;
        return this;
    }

    public C1497180p40 LJJJI() {
        return null;
    }

    public CronetEngineBuilderImpl LJJJIL(AbstractC1497170p3z abstractC1497170p3z) {
        return this;
    }

    static {
        PatternProtector.compile("^[0-9\\.]*$");
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJ(boolean z) {
        this.LJII = z;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJI(boolean z) {
        this.LJIILIIL = z;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIIIIZZ(boolean z) {
        this.LJI = z;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIIJJI(boolean z) {
        this.LJJIIJ = z;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIIL(long j) {
        this.LJJII = j;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIILIIL(CronetAppInfoProvider cronetAppInfoProvider) {
        this.LJIILL = cronetAppInfoProvider;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIILJJIL(CronetAppMonitorProvider cronetAppMonitorProvider) {
        this.LJIILLIIL = cronetAppMonitorProvider;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIILL(int i) {
        this.LJJIIJZLJL = i;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIILLIIL(String str) {
        this.LJIJJLI = str;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIIZILJ(Map map) {
        this.LJIJJ = map;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIJ(CronetEventListener cronetEventListener) {
        this.LJIIZILJ = cronetEventListener;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIJI(String str) {
        this.LJIJ = str;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIJJ(boolean z) {
        this.LJJIIZ = z;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJIJJLI(boolean z) {
        this.LJJIIZI = z;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public /* bridge */ /* synthetic */ AbstractC1497090p3r LJIL(AbstractC1497170p3z abstractC1497170p3z) {
        LJJJIL(abstractC1497170p3z);
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJ(long j) {
        this.LJJJI = j;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJI(ArrayList arrayList) {
        this.LJIJI = arrayList;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIFFI(boolean z) {
        this.LJJIJIIJIL = z;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIII(String str) {
        this.LJJIJ = str;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIIJ(String str) {
        this.LJJ = str;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIIJZLJL(TTSamplingSettingProvider$TTSlaSamplingSetting tTSamplingSettingProvider$TTSlaSamplingSetting) {
        this.LJJJ = tTSamplingSettingProvider$TTSlaSamplingSetting;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public /* bridge */ /* synthetic */ AbstractC1497090p3r LJJIIZI(String str) {
        LJJJJ(str);
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIJ(String str) {
        this.LJIL = str;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIJIIJI(TTAppInfoProvider.AppInfo appInfo) {
        this.LJJIJIIJI = appInfo;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIJIIJIL(long j) {
        this.LJJIJLIJ = j;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIJIL(InterfaceC1498450p63 interfaceC1498450p63) {
        this.LJJIZ = interfaceC1498450p63;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIJL(ArrayList arrayList) {
        this.LJJIL = arrayList;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIJLIJ(int i) {
        if (i <= 19 && i >= -20) {
            this.LJIIL = i;
            return this;
        }
        throw new IllegalArgumentException("Thread priority invalid");
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIL(String str) {
        this.LJ = str;
        return this;
    }

    public final void LJJJJ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            throw new IllegalArgumentException("create Storage path failed");
        }
        if (c0vsj.isDirectory()) {
            this.LJFF = str;
            return;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }

    public CronetEngineBuilderImpl(Context context, boolean z) {
        this.LIZ = C786410Ut5.N3(context);
        LJJJ(0, 0L);
        this.LJIIJJI = false;
        this.LIZLLL = true;
        this.LJIILIIL = false;
        this.LJJIIJ = false;
    }

    @Override // X.AbstractC1497090p3r
    public /* bridge */ /* synthetic */ AbstractC1497090p3r LJFF(int i, long j) {
        LJJJ(i, j);
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJII(boolean z, boolean z2) {
        this.LJJIJIL = z;
        this.LJJIJL = z2;
        return this;
    }

    @Override // X.AbstractC1497090p3r
    public AbstractC1497090p3r LJJIIZ(String str, boolean z) {
        this.LJJJIL = z;
        this.LJJJJ = str;
        return this;
    }

    public final void LJJJ(int i, long j) {
        EnumC1498400p5y enumC1498400p5y;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC1498400p5y = EnumC1498400p5y.DISK;
                    } else {
                        throw new IllegalArgumentException("Unknown public builder cache mode");
                    }
                } else {
                    enumC1498400p5y = EnumC1498400p5y.DISK_NO_HTTP;
                }
            } else {
                enumC1498400p5y = EnumC1498400p5y.MEMORY;
            }
        } else {
            enumC1498400p5y = EnumC1498400p5y.DISABLED;
        }
        if (enumC1498400p5y.LL == 1 && this.LJFF == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.LJIIIZ = enumC1498400p5y;
        this.LJIIJ = j;
    }

    @Override // X.AbstractC1497090p3r
    public /* bridge */ /* synthetic */ AbstractC1497090p3r LIZ(int i, int i2, String str) {
        LJJIZ(i, i2, str);
        return this;
    }

    public final void LJJIZ(int i, int i2, String str) {
        if (!str.contains("/")) {
            ((LinkedList) this.LIZIZ).add(new C1498440p62(str, i, i2));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal QUIC Hint Host: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
