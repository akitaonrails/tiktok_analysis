package com.ss.android.ugc.aweme.bytebench;

import X.C09GA;
import X.C21308818aE;
import X.InterfaceC1865190ydZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes29.dex */
public class ByteBenchStrategyHWFastImportConfiguration$$Imp implements ByteBenchStrategyHWFastImportConfiguration {
    public C09GA mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public final ConcurrentHashMap<String, Object> mStickyStrategy = new ConcurrentHashMap<>();
    public InterfaceC1865190ydZ mDefaultCreate = new InterfaceC1865190ydZ() { // from class: X.0zMA
        @Override // X.InterfaceC1865190ydZ
        public final <T> T create(Class<T> cls) {
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            return null;
        }
    };

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get1080PHighFpsByteVC1FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_1080p_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc1_1080p_highfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_1080p_highfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_1080p_highfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc1_1080p_highfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get1080PHighFpsH264FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_1080p_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc0_1080p_highfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_1080p_highfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_1080p_highfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc0_1080p_highfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get1080PLowFpsByteVC1FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_1080p_lowfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc1_1080p_lowfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_1080p_lowfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_1080p_lowfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc1_1080p_lowfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get1080PLowFpsH264FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_1080p_lowfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc0_1080p_lowfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_1080p_lowfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_1080p_lowfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc0_1080p_lowfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KHighFpsByteVC1FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_4k_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc1_4k_highfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_4k_highfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_4k_highfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc1_4k_highfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KHighFpsH264FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_4k_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc0_4k_highfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_4k_highfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_4k_highfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc0_4k_highfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KLowFpsByteVC1FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_4k_lowfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc1_4k_lowfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_4k_lowfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_4k_lowfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc1_4k_lowfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KLowFpsH264FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_4k_lowfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc0_4k_lowfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_4k_lowfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_4k_lowfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc0_4k_lowfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KMidFpsByteVC1FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_4k_midfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc1_4k_midfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_4k_midfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_4k_midfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc1_4k_midfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KMidFpsH264FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_4k_midfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc0_4k_midfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_4k_midfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_4k_midfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc0_4k_midfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get720PHighFpsByteVC1FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_720p_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc1_720p_highfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_720p_highfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_720p_highfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc1_720p_highfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get720PHighFpsH264FastImportConfig() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_720p_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc0_720p_highfps_fastimport")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_720p_highfps_fastimport");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_720p_highfps_fastimport");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc0_720p_highfps_fastimport", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String getByteVC1HWDecodeThreshold() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_hwdecode_threshold");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc1_hwdecode_threshold")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_hwdecode_threshold");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_hwdecode_threshold");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc1_hwdecode_threshold", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String getByteVC1HWPageModeDecodeThreshold() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_hwdecode_pagemode");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc1_hwdecode_pagemode")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_hwdecode_pagemode");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_hwdecode_pagemode");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc1_hwdecode_pagemode", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String getH264HWDecodeThreshold() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_hwdecode_threshold");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc0_hwdecode_threshold")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_hwdecode_threshold");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_hwdecode_threshold");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc0_hwdecode_threshold", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String geth264HWPageModeDecodeThreshold() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_hwdecode_pagemode");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("bytebench_bytevc0_hwdecode_pagemode")) {
                        strLJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_hwdecode_pagemode");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_hwdecode_pagemode");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("bytebench_bytevc0_hwdecode_pagemode", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}
