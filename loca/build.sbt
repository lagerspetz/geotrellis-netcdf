name := "loca"
libraryDependencies ++= Seq(
  "org.locationtech.geotrellis" %% "geotrellis-raster"    % "1.1.0-RC6",
  "org.locationtech.geotrellis" %% "geotrellis-spark"     % "1.1.0-RC6",
  "org.apache.hadoop"            % "hadoop-client"        % Version.hadoop % "provided",
  "org.apache.spark"            %% "spark-core"           % Version.spark  % "provided"
)

fork in Test := false
parallelExecution in Test := false
