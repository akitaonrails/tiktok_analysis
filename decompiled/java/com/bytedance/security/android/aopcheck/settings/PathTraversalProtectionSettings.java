package com.bytedance.security.android.aopcheck.settings;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public final class PathTraversalProtectionSettings {
    public static final PathTraversalProtectionModel LIZ = new PathTraversalProtectionModel();

    public static class PathTraversalProtectionModel {

        @C09CT("path_traversal_content_resolver_intercept_enabled")
        public Boolean enableContentResolverIntercept;

        @C09CT("path_traversal_file_input_stream_intercept_enabled")
        public Boolean enableFileInputStreamIntercept;

        @C09CT("path_traversal_file_intercept_enabled")
        public Boolean enableFileIntercept;

        @C09CT("path_traversal_file_output_stream_intercept_enabled")
        public Boolean enableFileOutputStreamIntercept;

        @C09CT("path_traversal_file_reader_intercept_enabled")
        public Boolean enableFileReaderIntercept;

        @C09CT("path_traversal_file_writer_intercept_enabled")
        public Boolean enableFileWriterIntercept;

        @C09CT("path_traversal_zip_file_intercept_enabled")
        public Boolean enableZipFileIntercept;

        @C09CT("path_traversal_enabled")
        public Boolean pathTraversalEnabled = Boolean.TRUE;

        @C09CT("path_traversal_intercept_enabled")
        public Boolean pathTraversalInterceptEnabled;

        public PathTraversalProtectionModel() {
            Boolean bool = Boolean.FALSE;
            this.pathTraversalInterceptEnabled = bool;
            this.enableFileIntercept = bool;
            this.enableFileInputStreamIntercept = bool;
            this.enableFileOutputStreamIntercept = bool;
            this.enableFileReaderIntercept = bool;
            this.enableFileWriterIntercept = bool;
            this.enableZipFileIntercept = bool;
            this.enableContentResolverIntercept = bool;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SettingsModel{pathTraversalEnabled=");
            sbLIZ.append(this.pathTraversalEnabled);
            sbLIZ.append(", pathTraversalInterceptEnabled=");
            sbLIZ.append(this.pathTraversalInterceptEnabled);
            sbLIZ.append(", enableFileIntercept=");
            sbLIZ.append(this.enableFileIntercept);
            sbLIZ.append(", enableFileInputStreamIntercept=");
            sbLIZ.append(this.enableFileInputStreamIntercept);
            sbLIZ.append(", enableFileOutputStreamIntercept=");
            sbLIZ.append(this.enableFileOutputStreamIntercept);
            sbLIZ.append(", enableFileReaderIntercept=");
            sbLIZ.append(this.enableFileReaderIntercept);
            sbLIZ.append(", enableFileWriterIntercept=");
            sbLIZ.append(this.enableFileWriterIntercept);
            sbLIZ.append(", enableZipFileIntercept=");
            sbLIZ.append(this.enableZipFileIntercept);
            sbLIZ.append(", enableContentResolverIntercept=");
            sbLIZ.append(this.enableContentResolverIntercept);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
