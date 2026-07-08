package ttp.orbu.sdk.app.domain.entity.gecko;

import X.C08FF;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public enum GeckoValidationError {
    HashDoesNotMatch("hashDoesNotMatch"),
    SizeDoesNotMatch("sizeDoesNotMatch"),
    InvalidManifest("invalidManifest"),
    InvalidManifestSignature("invalidManifestSignature"),
    PathDoesNotExist("pathDoesNotExist"),
    DirectoryContentsDoNotMatch("directoryContentsDoNotMatch"),
    UnableToComputeHash("unableToComputeHash"),
    UnableToComputeSize("unableToComputeSize"),
    UnableToBuildManifest("unableToBuildManifest"),
    UnableToMatchDirectoryContents("unableToMatchDirectoryContents");

    public static final a Companion = new a();
    public final String value;

    public static GeckoValidationError valueOf(String str) {
        return (GeckoValidationError) C08FF.LIZ(GeckoValidationError.class, str);
    }

    public final String getValue() {
        return this.value;
    }

    public static final class a {
        public final GeckoValidationError a(String str) {
            for (GeckoValidationError geckoValidationError : GeckoValidationError.values()) {
                if (u.LJIJI(geckoValidationError.getValue(), str, true)) {
                    return geckoValidationError;
                }
            }
            return null;
        }
    }

    GeckoValidationError(String str) {
        this.value = str;
    }
}
