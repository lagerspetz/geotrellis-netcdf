name := "gddp"
libraryDependencies ++= Seq(
  "org.locationtech.geotrellis" %% "geotrellis-raster"    % "2.0.0-SNAPSHOT",
  "org.locationtech.geotrellis" %% "geotrellis-spark"     % "2.0.0-SNAPSHOT",
  "org.apache.hadoop"            % "hadoop-client"        % Version.hadoop % "provided",
  "org.apache.spark"            %% "spark-core"           % Version.spark  % "provided"
)

fork in Test := false
parallelExecution in Test := false
